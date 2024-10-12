package dev.mehmetfd;


import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;

import io.javalin.Javalin;
import io.javalin.http.Handler;
import io.javalin.http.HttpStatus;

public class App {
    private static final Algorithm algorithm = Algorithm.HMAC256("very_secret");
    private static final JWTVerifier verifier = JWT.require(algorithm).build();

    public static String generateToken() {
        return JWT.create()
                .withIssuer("auth0")
                .withSubject("username")
                .sign(algorithm);
    }

    public static void main(String[] args) {
        var app = Javalin.create();

        Handler generateHandler = context -> {
            String token = generateToken();
            context.header("Authorization", "Bearer " + token);
            context.status(HttpStatus.OK);
        };

        Handler validateHandler = context -> {
            try {
                var authHeader = context.header("Authorization");
                var token = authHeader.split(" ")[1];
                DecodedJWT decodedJWT = verifier.verify(token);
                context.result("Hi " + decodedJWT.getSubject());
            } catch (Exception e) {
                context.status(401).result("Missing or invalid token");
            }
        };

        app.get("/generate", generateHandler);
        app.get("/validate", validateHandler);

        app.start(3000);
    }
}

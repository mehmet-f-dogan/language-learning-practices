package dev.mehmetfd;

import io.github.cdimascio.dotenv.Dotenv;

public class ConfigurationManager {
    private static Configuration configuration = new Configuration();

    public static Configuration getConfiguration() {
        return configuration;
    }

    public static void initConfiguration() {
        Dotenv dotenv = Dotenv
                .configure()
                .ignoreIfMalformed()
                .ignoreIfMissing()
                .systemProperties()
                .load();
        configuration.setRequiredVar(dotenv.get("PRIVATE"));
        configuration.setDefaultVar(dotenv.get("DEFAULT", "default value"));
    }
}

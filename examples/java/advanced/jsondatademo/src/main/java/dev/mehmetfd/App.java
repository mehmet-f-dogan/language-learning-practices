package dev.mehmetfd;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.google.gson.Gson;

public class App {

    private static String jsonFilePath = "";
    private static final Gson gson = new Gson();
    private static ArrayList<Person> people = new ArrayList<>();

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("missing <file-path>");
            return;
        }

        jsonFilePath = args[0];

        String jsonDataString = readJsonFile(args[0]);

        people = gson.fromJson(jsonDataString, people.getClass());

    }

    private static void createUser(String name) {
        people.add(new Person(name));
        save();
    }

    private static Person readUSer(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    private static void updateUser(String oldName, String newName) {
        people.forEach((p) -> {
            if (p.getName().equals(oldName)){
                p.setName(newName);
            }
        });
        save();
    }

    private static void deleteUser(String name) {
        people.removeIf((p) -> p.getName().equals(name));
        save();
    }    

    private static void save() {
        var peopleJson = gson.toJson(people);
        writeJsonToFile(peopleJson);
    }

    private static String readJsonFile(String filePath) {
        File file = new File(filePath);
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            return new String(data, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static void writeJsonToFile(String jsonData) {
        try {
            Files.write(Paths.get(jsonFilePath), jsonData.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

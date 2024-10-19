package dev.mehmetfd;

public class App {

    public static void main(String[] args) {
        ConfigurationManager.initConfiguration();
        Configuration config = ConfigurationManager.getConfiguration();
        var requiredVar = config.getRequiredVar();
        var defaultVar = config.getDefaultVar();
        System.out.println(requiredVar);
        System.out.println(defaultVar);
    }
}

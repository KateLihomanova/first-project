package design_patterns;

public class ConfigurationManager {
    private static ConfigurationManager configurationManager;

    public ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }
}

package complex_tasks.URL;

public class ShortenerFactory {
    public static ShorteningStrategy createStrategy(String type) throws Exception {
        switch (type.toLowerCase()) {
            case "uuid":
                return new UUIDGenerate();
            default:
                throw new Exception("Unsupported strategy: " + type);
        }
    }
}

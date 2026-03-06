package complex_tasks.URL;

public class UrlShortenerService {
    private final UrlStorage storage;
    private final ShorteningStrategy strategy;

    public UrlShortenerService(UrlStorage storage, ShorteningStrategy strategy) {
        this.storage = storage;
        this.strategy = strategy;
    }

    public String shorten(String longUrl) throws Exception {
        if (longUrl == null || longUrl.isEmpty())
            throw new IllegalArgumentException("Invalid URL");
        String shortKey = strategy.generateShortKey();
        storage.save(shortKey, longUrl);
        return shortKey;

    }

    public String restore (String shortKey) throws Exception {
        return storage.findByKey(shortKey);
    }
}

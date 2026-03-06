package complex_tasks.URL;

import java.util.UUID;

public class UUIDGenerate implements ShorteningStrategy {
    @Override
    public String generateShortKey() {
        return UUID.randomUUID().toString();
    }
}

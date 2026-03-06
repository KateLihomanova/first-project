package complex_tasks.URL;

public interface UrlStorage {
    void save(String key, String value) throws Exception;
    String findByKey(String key) throws Exception;
}

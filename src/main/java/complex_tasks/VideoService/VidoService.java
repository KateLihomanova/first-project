package complex_tasks.VideoService;

import java.util.HashMap;
import java.util.Map;

public class VidoService {
    private Map<String, VideoAdapter> adapters;

    public VidoService() {
        adapters = new HashMap<>();
        adapters.put("avi", new AviAdapter());
        adapters.put("mov", new MovAdapter());
        adapters.put("wmv", new WMVAdapter());
    }

    public void uploadVideo(String format, byte[] rawData) {
        VideoAdapter adapter = adapters.get(format.toLowerCase());
        if(adapter == null) {
            throw new UnsupportedOperationException("Невозможно обработать указанный формат видео");
        }
        byte[] convertedData = adapter.convertToMP4(rawData);
        storeVideo(convertedData);
    }

    private void storeVideo(byte[] data) {
        System.out.println("Видео сохранено");
    }
    public void streamVideo(String vidoID) {
        byte[] storedData = retrieveVideo(vidoID);
        playVideo(storedData);
    }

    private byte[] retrieveVideo(String ID) {
        System.out.println("Получили видео из хранилища");
        return new byte[] {};
    }

    private void playVideo(byte[] data) {
        System.out.println("Воспроизведение видео");
    }
}

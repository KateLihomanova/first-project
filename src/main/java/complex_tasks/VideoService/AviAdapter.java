package complex_tasks.VideoService;

public class AviAdapter implements VideoAdapter {
    @Override
    public byte[] convertToMP4(byte[] rawData) {
        System.out.println("Преобразую AVI в MP4 ");
        return rawData;
    }
}

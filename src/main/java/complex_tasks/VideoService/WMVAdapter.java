package complex_tasks.VideoService;

public class WMVAdapter implements VideoAdapter {
    @Override
    public byte[] convertToMP4(byte[] rawData) {
    System.out.println("Преобразую WMV в MP4 ");
    return rawData;
    }
}

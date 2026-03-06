package complex_tasks.VideoService;

public class MovAdapter implements VideoAdapter {
    @Override
    public byte[] convertToMP4(byte[] rawData) {
        System.out.println("Преобразую MOV в MP4 ");
        return rawData;
    }
}

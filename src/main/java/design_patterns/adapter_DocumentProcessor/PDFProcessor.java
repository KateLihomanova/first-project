package design_patterns.adapter_DocumentProcessor;

public class PDFProcessor implements DocumentProcessor {
    @Override
    public byte[] process(byte[] pdfInput) {
        System.out.println("PDF file.....");
        return pdfInput;
    }
}

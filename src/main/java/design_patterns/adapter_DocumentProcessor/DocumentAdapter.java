package design_patterns.adapter_DocumentProcessor;

public class DocumentAdapter implements DocumentProcessor {
    private PDFProcessor pdfFile;
    private DOCProcessor docFile;

    public DocumentAdapter(PDFProcessor pdfFile, DOCProcessor docFile) {
        this.pdfFile = pdfFile;
        this.docFile = docFile;
    }

    @Override
    public byte[] process(byte[] data) {
        byte[] intermediateResult = pdfFile.process(data);
        return docFile.process(intermediateResult);
    }
}

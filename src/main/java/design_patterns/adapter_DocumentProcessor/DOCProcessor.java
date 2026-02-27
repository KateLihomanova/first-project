package design_patterns.adapter_DocumentProcessor;

public class DOCProcessor implements DocumentProcessor {
    @Override
    public byte[] process(byte[] docInput) {
        System.out.println("DOC file.....");
        return docInput;
    }
}

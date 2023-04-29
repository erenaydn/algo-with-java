import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class generateImageFromPDF {
    public static void main(String[] args) throws IOException {
        generateImageFromPDF("training.pdf", "jpg");

    }

    public static void generateImageFromPDF(String filename, String extension) throws IOException {
        PDDocument document = PDDocument.load(new File(filename));
        PDFRenderer pdfRenderer = new PDFRenderer(document);
        for (int page = 0; page < document.getNumberOfPages(); ++page) {
            BufferedImage bim = pdfRenderer.renderImageWithDPI(
                    page, 444, ImageType.RGB);

            ImageIOUtil.writeImage(
                    bim, String.format("pdf22-%d.%s", page + 1, extension), 300);

        }
        document.close();
    }
}
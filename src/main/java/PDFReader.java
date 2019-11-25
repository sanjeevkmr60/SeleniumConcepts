import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PDFReader {

    public static void main(String args[]) throws IOException {

        URL url=new URL("http://www.africau.edu/images/default/sample.pdf");

        InputStream inputStream=url.openStream();
        BufferedInputStream fileParse=new BufferedInputStream(inputStream);
        PDDocument pdDocument=null;
        pdDocument=PDDocument.load(fileParse);
        String pdfText = new PDFTextStripper().getText(pdDocument);
        System.out.println(pdfText);
        Assert.assertTrue(pdfText.contains("A Simple PDF File"),"PDF Text is not verified");

    }
}

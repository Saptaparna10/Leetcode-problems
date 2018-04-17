import java.io.*;
import com.lowagie.text.DocumentException;

import org.xhtmlrenderer.pdf.ITextRenderer;
import org.xhtmlrenderer.pdf.ITextTextRenderer;

public class HTMLToPdf {

	public static void main(String[] args) {
		try {
		    //String k = "<html><body> This is my Project </body></html>";
			/*String k = new Scanner(new URL("https://www.le.ac.uk/oerresources/bdra/html/page_09.htm").openStream(), "UTF-8").useDelimiter("\\A").next();
		    OutputStream file = new FileOutputStream(new File("F:\\Test3.pdf"));
		    Document document = new Document();
		    PdfWriter writer = PdfWriter.getInstance(document, file);
		    document.open();
		    ByteArrayInputStream is = new ByteArrayInputStream(k.getBytes());
		    XMLWorkerHelper.getInstance().parseXHtml(writer, document, is);
		    document.close();
		    file.close();*/
			
			final ITextRenderer iTextRenderer = new ITextRenderer();

		    iTextRenderer.setDocument("F:\\test.html");
		    iTextRenderer.layout();

		    // The generated pdf will be written to the file. *//*
		    final FileOutputStream fileOutputStream =
		                new FileOutputStream(new File("F:\\test4.pdf"));

		    iTextRenderer.createPDF(fileOutputStream);
		    fileOutputStream.close();
		} catch (Exception e) {
		    e.printStackTrace();
		}
		//-------------------------------
		
		 /*try {
		        String url = new File("F:\\test.html").toURI().toURL().toString();
		        System.out.println("URL: " + url);

		        OutputStream out = new FileOutputStream("F:\\test4.pdf");

		        //Flying Saucer part
		        ITextRenderer renderer = new ITextRenderer();

		        renderer.setDocument(url);
		        renderer.layout();
		        renderer.createPDF(out);

		        out.close();
		    } catch (DocumentException | IOException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }*/

	}

}

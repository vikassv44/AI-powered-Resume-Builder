package project;

//ResumeGenerator.java
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;

public class ResumeGenerator {

 public void createPdf(String filename, UserData data) {
     Document document = new Document();

     try {
         PdfWriter.getInstance(document, new FileOutputStream(filename));
         document.open();
         
         // Add Title
         Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 24, BaseColor.BLUE);
         Paragraph title = new Paragraph("Resume", titleFont);
         title.setAlignment(Element.ALIGN_CENTER);
         document.add(title);

         document.add(new Paragraph("\n"));

         // Add User Details
         document.add(new Paragraph("Full Name: " + data.getFullName()));
         document.add(new Paragraph("Email: " + data.getEmail()));
         document.add(new Paragraph("Phone: " + data.getPhone()));
         document.add(new Paragraph("Education: " + data.getEducation()));
         document.add(new Paragraph("Skills: " + data.getSkills()));

         document.close();
         System.out.println("Resume created successfully!");
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}

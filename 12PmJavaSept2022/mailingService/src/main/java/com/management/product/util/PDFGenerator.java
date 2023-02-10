package com.management.product.util;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

@Component
public class PDFGenerator {

    public void generateItinerary(String filePath) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            document.add(generateTable());
            document.close();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private PdfPTable generateTable() {

        PdfPTable table = new PdfPTable(2);
        PdfPCell cell;

        cell = new PdfPCell(new Phrase("Flight Itenary"));
        cell.setColspan(2);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase("Flight Details"));
        cell.setColspan(2);
        table.addCell(cell);

        table.addCell("Airlines");
        table.addCell("Buddha Air");


        table.addCell("Departure City");
        table.addCell("Kathmandu");

        table.addCell("Arrival City");
        table.addCell("Simra");

        table.addCell("Flight Number");
        table.addCell("234234rtd");

        table.addCell("Departure Date");
        table.addCell("2022/12/23");

        table.addCell("Departure Time");
        table.addCell("11:000AM");

        cell = new PdfPCell(new Phrase("Passenger Details"));
        cell.setColspan(2);
        table.addCell(cell);

        table.addCell("First Name");
        table.addCell("Pravin");

        table.addCell("Last Name");
        table.addCell("Khaling");

        table.addCell("Email");
        table.addCell("khaling.pravin@gmail.com");

        table.addCell("Phone");
        table.addCell("9862212865");

        return table;

    }
}

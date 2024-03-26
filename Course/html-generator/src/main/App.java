package main;

import html.HTMLDocument;
import html.elements.Paragraph;
import html.elements.Heading;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {

        var htmlDoc = new HTMLDocument("New Web Page");
        htmlDoc.addElement(new Heading("Hello,", "color : red", 1));
        htmlDoc.addElement(new Paragraph("My Name is Suzanne"));
        try {
            Files.writeString(Path.of("index.html"), htmlDoc.toString());
        } catch (IOException e) {
          //  e.printStackTrace();
        }
    }
}

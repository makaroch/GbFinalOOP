package org.example.Model.SaveFormat;

import org.example.Model.Contact;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveTxt implements  SaveAs<Contact> {
    @Override
    public void saveAs(List<Contact> list, String path) {
        for (Contact t : list) {
            try (FileWriter writer = new FileWriter(path + ".txt", true)) {
                writer.write(t.toString() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

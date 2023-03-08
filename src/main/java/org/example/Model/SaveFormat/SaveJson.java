package org.example.Model.SaveFormat;

import org.example.Model.Contact;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaveJson implements SaveAs<Contact> {
    private Map<String, String> map = new HashMap<>();
    private JSONObject json = new JSONObject();
    @Override
    public void saveAs(List<Contact> list, String path) {
        for (int i = 0; i < list.size(); i++) {
            Contact contact = list.get(i);
            map.put("name", contact.getName());
            map.put("number", contact.getNumber());
            json.put(String.valueOf(i), map);
        }
        try (FileWriter fileWriter = new FileWriter("file.json")) {
            fileWriter.write(json.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

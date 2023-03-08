package org.example.ui.comand.comandSaveAs;

import org.example.SaveFormat;
import org.example.ui.Console;
import org.example.ui.comand.Comand;

public class SaveXml extends Comand {
    public SaveXml(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Сохранить в xml.";
    }

    @Override
    public void execute() {
        getConsole().save(SaveFormat.XML);
    }
}

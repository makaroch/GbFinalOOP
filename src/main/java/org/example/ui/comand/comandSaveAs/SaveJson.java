package org.example.ui.comand.comandSaveAs;

import org.example.SaveFormat;
import org.example.ui.Console;
import org.example.ui.comand.Comand;

public class SaveJson extends Comand {
    public SaveJson(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Сохранить в json.";
    }

    @Override
    public void execute() {
        getConsole().save(SaveFormat.JSON);
    }
}

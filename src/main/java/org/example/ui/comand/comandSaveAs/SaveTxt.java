package org.example.ui.comand.comandSaveAs;

import org.example.SaveFormat;
import org.example.ui.Console;
import org.example.ui.comand.Comand;

public class SaveTxt extends Comand {
    public SaveTxt(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Сохранить в txt.";
    }

    @Override
    public void execute() {
        getConsole().save(SaveFormat.TXT);
    }
}

package org.example.ui.comand;


import org.example.ui.Console;

public class DellNote extends Comand {
    public DellNote(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Удалить запись";
    }

    @Override
    public void execute() {
        getConsole().setAddOrDell(false);
        getConsole().addOrDellContact();
    }
}

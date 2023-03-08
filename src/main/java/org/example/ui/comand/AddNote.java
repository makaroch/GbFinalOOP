package org.example.ui.comand;


import org.example.ui.Console;

public class AddNote extends Comand {

    public AddNote(Console console) {
        super(console);
    }
    @Override
    public String description() {
        return "Добавить Запись";
    }

    @Override
    public void execute() {
        getConsole().setAddOrDell(true);
        getConsole().addOrDellContact();
    }
}

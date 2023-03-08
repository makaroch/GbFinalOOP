package org.example.ui.comand;


import org.example.ui.Console;

public class End extends Comand{

    public End(Console console) {
        super(console);
    }
    @Override
    public String description() {
        return "Выход";
    }

    @Override
    public void execute() {
       getConsole().end();
    }
}

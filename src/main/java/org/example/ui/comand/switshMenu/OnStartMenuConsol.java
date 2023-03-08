package org.example.ui.comand.switshMenu;

import org.example.ui.Console;

public class OnStartMenuConsol extends SwitshMenu {
    public OnStartMenuConsol(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Вернуться в основное меню.";
    }

    @Override
    public void execute() {
        getConsole().setMenu(this);
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

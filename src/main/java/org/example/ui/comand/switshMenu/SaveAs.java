package org.example.ui.comand.switshMenu;

import org.example.ui.Console;


public class SaveAs extends SwitshMenu {
    public SaveAs(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Сохранить как...";
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
        return 1;
    }
}

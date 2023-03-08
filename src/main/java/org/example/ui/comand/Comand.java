package org.example.ui.comand;


import org.example.ui.Console;

public abstract class Comand implements ui.comand.Option {
    private final Console console;

    public Comand(Console console){
        this.console = console;
    }

    protected Console getConsole(){
        return console;
    }
}

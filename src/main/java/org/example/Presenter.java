package org.example;

import org.example.Model.Model;
import org.example.ui.Viem;

public class Presenter {
    private Model model;
    private Viem viem;

    public Presenter(Model model, Viem viem) {
        this.model = model;
        this.viem = viem;
        viem.setPresenter(this);
        model.setPresenter(this);
    }
    public void start(){
        viem.start();
    }

    public void addNote(String[] contact) {
        model.addContact(contact);
    }
    public void dellNote(String[] contact) {
        model.dellContact(contact);
    }
    public void save(SaveFormat saveFormat){
        model.saveAs(saveFormat);
    }
    public void outRes(String text){
        viem.print(text);
    }
}

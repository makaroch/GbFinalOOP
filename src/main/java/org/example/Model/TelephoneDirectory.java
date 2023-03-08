package org.example.Model;

import org.example.Model.SaveFormat.SaveJson;
import org.example.Model.SaveFormat.SaveTxt;
import org.example.Presenter;
import org.example.SaveFormat;

import java.util.ArrayList;
import java.util.List;

public class TelephoneDirectory implements Model {
    private List<Contact> contacts;
    private Presenter presenter;

    public TelephoneDirectory() {
        contacts = new ArrayList<>();
    }

    @Override
    public void addContact(String[] contact) {
        contacts.add(new Contact(contact[0], contact[1]));
    }

    @Override
    public void dellContact(String[] contact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(contact[0]) && contacts.get(i).getNumber().equals(contact[1])) {
                contacts.remove(i);
                outputRes("Контакт удален");
                return;
            }
        }
        outputRes("Нет такого контакта");
    }

    @Override
    public void saveAs(SaveFormat saveFormat) {
        if (SaveFormat.JSON == saveFormat) {
            new SaveJson().saveAs(contacts, "file.json");
        } else if (SaveFormat.TXT == saveFormat) {
            new SaveTxt().saveAs(contacts, "file.txt");
        } else {
            outputRes("В разработке.");
            return;
        }
        outputRes("Файл сохранен");
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void outputRes(String text) {
        presenter.outRes(text);
    }
}

package org.example.Model;

import org.example.Presenter;
import org.example.SaveFormat;

public interface Model {
    void addContact(String[] contact);
    void dellContact(String[] contact);
    void saveAs(SaveFormat saveFormat);
    void setPresenter(Presenter presenter);
    void outputRes(String text);
}

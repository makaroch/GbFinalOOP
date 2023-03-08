package org.example.ui;


import org.example.Presenter;

public interface Viem {
    void setPresenter(Presenter presenter);
    void start();
    void print(String text);
}

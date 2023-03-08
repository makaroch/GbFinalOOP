package org.example.ui;


import org.example.Presenter;
import org.example.SaveFormat;
import org.example.ui.comand.*;
import org.example.ui.comand.comandSaveAs.SaveJson;
import org.example.ui.comand.comandSaveAs.SaveTxt;
import org.example.ui.comand.comandSaveAs.SaveXml;
import org.example.ui.comand.switshMenu.SwitshMenu;
import org.example.ui.comand.switshMenu.OnStartMenuConsol;
import org.example.ui.comand.switshMenu.SaveAs;


import java.util.*;
//menu
//valid
//print
//Scanner
//switch

public class Console implements Viem {
    private Scanner scanner;
    private Presenter presenter;
    private Map<SwitshMenu, Menu> menus;
    private Menu currentMenu;
    private boolean flag;
    private boolean addOrDell;

    public Console() {
        scanner = new Scanner(System.in);
        menus = new HashMap<>();
        menus.put(new OnStartMenuConsol(this), new Menu(new AddNote(this), new DellNote(this),
                new SaveAs(this), new End(this)));

        menus.put(new SaveAs(this), new Menu(new OnStartMenuConsol(this), new SaveJson(this),
                new SaveTxt(this), new SaveXml(this)));

        this.currentMenu = menus.get(new OnStartMenuConsol(this));
        flag = true;
    }

    @Override
    public void start() {
        while (flag) {
            printMenu();
            String input = scanner.nextLine();
            if (canParsIntToStr(input)) {
                if (!currentMenu.execute(Integer.parseInt(input))) {
                    System.out.println("Неверный ввод");
                }
            } else {
                System.out.println("Цифрами!");
            }
        }
    }

    private void printMenu() {
        System.out.println(currentMenu.printMenu());
    }

    private boolean canParsIntToStr(String s) {
        return s.matches("\\d+");
    }

    public void end() {
        System.out.println("Пока пока, возвращайся еще!");
        flag = false;
    }

    public void addOrDellContact() {
        String[] contact = new String[2];
        System.out.println("Введите имя контакта");
        contact[0] = scanner.nextLine();
        System.out.println("Введите номер в формате +7(xxx)-xxx-xx-xx");
        contact[1] = scanner.nextLine();
        if (checkNumber(contact[1])) {
            if (addOrDell) {
                presenter.addNote(contact);
            } else {
                presenter.dellNote(contact);
            }
        } else {
            System.out.println("некоректный ввод");
        }
    }

    private boolean checkNumber(String num) {
        return num.matches("\\+7\\(\\d{3}\\)-\\d{3}-\\d{2}-\\d{2}");
    }

    public void setMenu(SwitshMenu comand) {
        currentMenu = menus.get(comand);
    }

    public void setAddOrDell(boolean addOrDell) {
        this.addOrDell = addOrDell;
    }
    public void save(SaveFormat saveFormat){
        presenter.save(saveFormat);
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

}

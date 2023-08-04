package Seminar3.HomeWork.view.impl;

import Seminar3.HomeWork.view.Outputable;

public class ConsoleOutput implements Outputable {
    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}

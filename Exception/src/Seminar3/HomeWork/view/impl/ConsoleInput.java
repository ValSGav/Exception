package Seminar3.HomeWork.view.impl;

import java.util.Scanner;

public class ConsoleInput {
    private final Scanner sc;

    public ConsoleInput() {
        this.sc = new Scanner(System.in, "UTF-8");
    }

    public String getMessage(){
        return sc.nextLine();
    }
}

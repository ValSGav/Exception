//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package Seminar2.HomeWork;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        try {
            System.out.println(getInput("Введите строку"));
        } catch (IllegalArgumentException e){
            System.out.println("Должна быть введена не пустая строка!");
        }

    }

    public static String getInput(String message) throws IllegalArgumentException{

        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println(message);
        String inputString = sc.nextLine();
        if (inputString.isEmpty()){
            throw new IllegalArgumentException();
        }
        return inputString;
    }
}

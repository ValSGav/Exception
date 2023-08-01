/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

package Seminar2.HomeWork;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(getFloatNumber("Введите число"));
    }

    public static float getFloatNumber(String message){
        Scanner sc = new Scanner(System.in, "cp866");
        boolean isCorrect = false;
        float returnNumb=0f;
        while (!isCorrect){
            System.out.println(message);
            String inputString  = sc.nextLine();
            if (inputString.matches("[0-9]+\\.[0-9]+")){
                returnNumb = Float.parseFloat(inputString);
                isCorrect = true;}
                else{
                System.out.println("Введенное число не является вещественным! ");
                }

            }
        return returnNumb;
    }
}

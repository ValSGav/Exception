package Seminar1;

import java.beans.Introspector;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int[] array = new int[]{1,6,7,4,-3,9};

        String nub = "1dfsdff";
        int i = Integer.parseInt(nub);

    }

    private void dialogArray(int[] array){
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println("Введите число");
        int returnCode = checkArray(array, sc.nextInt());
        parceCode(returnCode);

    }

    private void parceCode(int returnCode){
        switch(returnCode){
            case -3:
                System.out.println("Массив не инициализрован");
                break;
            case -2:
                System.out.println("Массив меньше миниалного размера");
                    break;
            case -1:
                System.out.println("Элемент не найден");
                        break;
            default:
                System.out.println("Индекс икомого элемента: " + returnCode);
        }
        ;
    }

    private int checkArray(int[] array, int numb){
        if (array == null) return -3;

        int minLength = 3;

        if (array.length < minLength) return  -2;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numb) return i;
        }

        return -1;
    }
}

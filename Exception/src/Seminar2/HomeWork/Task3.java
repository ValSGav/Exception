//Дан следующий код, исправьте его там, где требуется
package Seminar2.HomeWork;

import java.io.FileNotFoundException;

public class Task3 {
//    public static void main(String[] args) throws Exception {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = { 1, 2 };
//            abc[3] = 9;
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }
//    }
//      public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//          System.out.println(a + b);
//}
public static void main(String[] args){
    try {
        //int a = 90;
        Integer a = null;
        int b = 10;
        //int b = 0;
        System.out.println(10 / b);
        printSum(a, b);
        //int[] abc = { 1, 2, 3, 4 };
        int[] abc = { 1, 2, 3, 4 , 5, 6, 7, 8};
        abc[7] = 9;
    //расставляем правильно порядок отлова исключений
    } catch (NullPointerException ex) {
        System.out.println("Указатель не может указывать на null!");
    } catch (IndexOutOfBoundsException ex) {
        System.out.println("Массив выходит за пределы своего размера!");
    } catch (Throwable ex) {
        System.out.println("Что-то пошло не так...");
    }
}
    public static void printSum(Integer a, Integer b) throws NullPointerException{ //вряд ли тут будет обращение к файлу, может будет передан null
        System.out.println(a + b);
    }

}

package Seminar2.HomeWork;

public class Task2 {
    public static void main(String[] args) {
        /*try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }*/

        /*
        Видимо есть смысл прверить деление на ноль условием, и выход за пределы массива тоже можно отловить условием.
        */

        //int[] intArray = new int[]{1,2,3,4,5,6,7,8,9};
        int[] intArray = new int[]{1,2,3,4,5,6};

            //int d = 0;
            int d = 1;
            int indexOfArray = 8;

            if (d != 0 && indexOfArray < intArray.length){
                double catchedRes1 = intArray[indexOfArray] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } else {
                if(d == 0)
                    System.out.println("Операция невозможна, деление на ноль");
                else
                    System.out.println("Операция невозможна, выход за пределы массива");
            }



    }
}

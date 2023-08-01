package Seminar1;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 4, 2};
        System.out.println(checkLength(array));

    }

    static int checkLength(int[] array) {
        int minLength = 5;
        if (array.length < minLength)
            return -1;

        return array.length;

    }
}


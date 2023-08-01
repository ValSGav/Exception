//Обработайте возможные исключительные ситуации.
// “Битые” значения в исходном массиве считайте нулями.
// Можно внести в код правки, которые считаете необходимыми.

package Seminar2;

public class Main3 {
    public static int ex2(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                String item = arr[i][j];
                //if (item.matches("[0-9]+")) {
                if(checkText(item)){
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        }
        return sum;
    }

    private static boolean checkText(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) < '0' || text.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}


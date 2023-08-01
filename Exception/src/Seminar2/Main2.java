package Seminar2;

import java.util.Scanner;

public class Main2 {
    public static void ex0(){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("РЈРєР°Р¶РёС‚Рµ РёРЅРґРµРєСЃ СЌР»РµРјРµРЅС‚Р° РјР°СЃСЃРёРІР°, РІ РєРѕС‚РѕСЂС‹Р№ С…РѕС‚РёС‚Рµ Р·Р°РїРёСЃР°С‚СЊ Р·РЅР°С‡РµРЅРёРµ 1");
        int index = scanner.nextInt();
        if (arr.length > index && index >= 0){
            arr[index] = 1;
        } else {
            System.out.println("РЈРєР°Р·Р°РЅ РёРЅРґРµРєСЃ Р·Р° РїСЂРµРґРµР»Р°РјРё РјР°СЃСЃРёРІР°");
        }
    }
}
package Seminar3.HomeWork;

import Seminar3.HomeWork.controller.Controller;

public class Main {
    public static void main(String[] args) {
        int dataItemCount = 6;
        Controller controller = new Controller(dataItemCount);
        controller.Run();
    }
}

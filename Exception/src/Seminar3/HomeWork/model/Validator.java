package Seminar3.HomeWork.model;

public class Validator {
    private int countOfItem;

    public Validator(int countOfItem) {
        this.countOfItem = countOfItem;
    }

    public int validateDataParseResult(int count) {
        if (count > this.countOfItem) {
            return -1;
        } else if (count < this.countOfItem) {
            return -2;
        } else return this.countOfItem;
    }

    public String parseValidateResult(int result){
        switch (result){
            case -1:
                return "В строке больше данных, чем предполагалось.";
            case -2:
                return "В строке меньше данных, чем предполагалось.";
            default:
                return "Введено верное количетво данных";

        }
    }
}


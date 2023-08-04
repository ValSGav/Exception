package Seminar3.HomeWork.controller;

import Seminar3.HomeWork.exception.DateFormatDataMissing;
import Seminar3.HomeWork.exception.PhoneNumberFormatDataMissing;
import Seminar3.HomeWork.exception.SexFormatDataMissing;
import Seminar3.HomeWork.model.Saveable;
import Seminar3.HomeWork.model.StringParser;
import Seminar3.HomeWork.model.Validator;
import Seminar3.HomeWork.model.impl.TXTWriter;
import Seminar3.HomeWork.view.impl.ConsoleInput;
import Seminar3.HomeWork.view.impl.ConsoleOutput;

import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class Controller {
    private ConsoleOutput viewOutput;
    private ConsoleInput viewInput;

    private StringParser stringParser;

    private int countItemInDataString;

    public Controller(int countItemInDataString) {
        this.viewOutput = new ConsoleOutput();
        this.viewInput = new ConsoleInput();
        this.stringParser = new StringParser();
        this.countItemInDataString = countItemInDataString;

    }

    public void Run() {
        boolean isEnd = false;
        do {
            viewOutput.showMessage("Введите данные о пользователе(Фамилия Имя Отчество, телефон, дата рождения, пол) без запятых через пробел. Для выхода введите exit");
            String dataString = viewInput.getMessage();
            if (!dataString.equals("exit")) {

                try {
                    stringParser.setSplittedString(dataString);

                    Validator validator = new Validator(countItemInDataString);

                    int resultOfValidating = validator.validateDataParseResult(stringParser.getCountItemsInString());

                    System.out.println(validator.parseValidateResult(resultOfValidating));

                    if (resultOfValidating > 0) {
                        HashMap<String, String> dataMap = stringParser.getDataMap();
                        Saveable saver = new TXTWriter(dataMap.get("LastName"));
                        saver.save(dataMap);
                    }


                } catch (DateFormatDataMissing | PhoneNumberFormatDataMissing | SexFormatDataMissing e) {
                    System.out.println(e.getMessage());
                } catch (IOException e){
                    System.out.println(Arrays.toString(e.getStackTrace()));
                }
            } else isEnd = true;

        } while (!isEnd);

    }
}

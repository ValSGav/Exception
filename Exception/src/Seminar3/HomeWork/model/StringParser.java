package Seminar3.HomeWork.model;

import Seminar3.HomeWork.exception.DateFormatDataMissing;
import Seminar3.HomeWork.exception.PhoneNumberFormatDataMissing;
import Seminar3.HomeWork.exception.SexFormatDataMissing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class StringParser {
    private String[] splittedString;
    private String splitter;


    public StringParser() {
        splitter = " ";
    }

    public void setSplittedString(String inString) {
        this.splittedString = inString.split(splitter);
    }

    public int getCountItemsInString() {
        return this.splittedString.length;
    }

    public String getSplitter() {
        return splitter;
    }

    public String[] getArrayOfString() {
        return this.splittedString;
    }

    public HashMap<String, String> getDataMap() throws DateFormatDataMissing, PhoneNumberFormatDataMissing, SexFormatDataMissing {

        HashMap<String, String> returnMap = new HashMap<String, String>();
        ArrayList<String> workArr = new ArrayList<String>();
        Collections.addAll(workArr, this.splittedString);
        returnMap.put("DateOfBirth", pullOutDateFromArrayList(workArr));
        returnMap.put("Sex", pullOutSexFromArrayList(workArr));
        returnMap.put("PhoneNumber", pullOutPhoneNumberFromArrayList(workArr));
        returnMap.put("LastName", workArr.get(0));
        returnMap.put("FirstName", workArr.get(1));
        returnMap.put("Patronymic", workArr.get(2));

        return returnMap;

    }

    private String pullOutDateFromArrayList(ArrayList<String> workArray) throws DateFormatDataMissing {

        for (int i = 0; i < workArray.size(); i++) {

            String resString = workArray.get(i);
            if (resString.matches("\\d{2}.\\d{2}.\\d{4}")) {
                workArray.remove(i);
                return resString;
            }
        }

        throw new DateFormatDataMissing("В строке не содержится данных с датой");
    }

    private String pullOutSexFromArrayList(ArrayList<String> workArray) throws SexFormatDataMissing {

        for (int i = 0; i < workArray.size(); i++) {

            String resString = workArray.get(i);
            if (resString.equals("f") || resString.equals("m")) {
                workArray.remove(i);
                return resString;
            }
        }

        throw new SexFormatDataMissing("В строке не содержится данных с полом(f/m)");
    }

    private String pullOutPhoneNumberFromArrayList(ArrayList<String> workArray) throws PhoneNumberFormatDataMissing {

        for (int i = 0; i < workArray.size(); i++) {

            String resString = workArray.get(i);
            if (resString.matches("\\d{11}")) {
                workArray.remove(i);
                return resString;
            }
        }

        throw new PhoneNumberFormatDataMissing("В строке не содержится данных с номером телефона");
    }
}

package Seminar3.HomeWork.model.impl;

import Seminar3.HomeWork.model.Saveable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class TXTWriter implements Saveable {

    private final String fileName;
    private final String fileExtension;


    public TXTWriter(String fileName) {
        this.fileName = fileName;
        this.fileExtension = ".txt";
    }

    @Override
    public void save(HashMap<String, String> data) throws IOException {

        File file = new File(this.fileName
                + this.fileExtension);
        boolean add = file.exists();
        try (FileWriter fw = new FileWriter(file, add)) {
            if (add) fw.write("\n");
            fw.write(data.toString());
        }

    }
}

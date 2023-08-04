package Seminar3.HomeWork.model;

import java.io.IOException;
import java.util.HashMap;

public interface Saveable {
    void save(HashMap<String, String> data) throws IOException;
}

package ru.netology;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ClientLog {
    private FileWriter writer;

    log(int productNum, int amount) {

    }

    public void exportAsCSV(File txtFile) throws IOException {
        var writer = new FileWriter(txtFile);
        writer.write(String.valueOf(log));
        writer.close();
    }
}

package by.academy.homework6;

import java.io.*;

public class Task2 {


    public static void main(String[] args) throws IOException {
        File dir = new File("src/by/academy/homework6/task2");

        if (!dir.exists()) {
            dir.mkdirs();
        }

        File inputFile = new File(dir, "Text Document.txt");

        System.out.println("Количество символов в тексте без редактирования: "
                + inputFile.length());

        File outputFile = new File(dir, "result.txt");
        if (!outputFile.exists()) {
            outputFile.createNewFile();
        }

        try (FileInputStream fis = new FileInputStream(inputFile);
             OutputStream fos = new FileOutputStream(outputFile)) {
            int a;

            while ((a = fis.read()) != -1) {
                System.out.println((char) a);
                if ((char) a != ' ') {
                    fos.write(a);
                }
            }
        }
        System.out.println("Количество символов в тексте без пробелов: "
                + outputFile.length());
    }

}

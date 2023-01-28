package by.academy.homework6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        File dirs = new File("src/by/academy/homework6/task1");

        if (!dirs.exists()) {
            dirs.mkdirs();
        }

        File file = new File(dirs, "textFromScanner.txt");

        if (!file.exists()) {
        file.createNewFile();
		}

        String s;

        try (FileOutputStream f = new FileOutputStream(file)) {
            do {
                System.out.println("Введите что-нибудь для записи в файл или stop для прекращения записи");
                s = sc.next();
                if (!s.equals("stop")){
                f.write(s.getBytes());
                }
            } while(!s.equals("stop")) ;
        }
    }


}

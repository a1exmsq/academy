package by.academy.homework6;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task4 {

    static Random rnd = new Random();

    public static void main(String[] args) throws IOException {
        File dirs = new File("src/by/academy/homework6/task4");

        if (!dirs.exists()) {
            dirs.mkdirs();
        }

        File fileLoremIpsum = new File("src/by/academy/homework6/task2",
                "Text Document.txt");

        int textSize = (int) fileLoremIpsum.length();
        System.out.println(textSize);

        for (int i = 1; i <= 100; i++){
            File file = new File(dirs, "file" + i + ".txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        }

        File fileResult = new File(dirs, "result.txt");
        if (!fileResult.exists()) {
            fileResult.createNewFile();
        }

        StringBuffer text = new StringBuffer();
        try (BufferedReader br = new BufferedReader(new FileReader(fileLoremIpsum))) {
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        File dir = new File("src/by/academy/homework6/task4");
        File[] arrFiles = dir.listFiles();
        List<File> listFiles = Arrays.asList(arrFiles);

        System.out.println(listFiles);
        try (FileWriter resultWriter = new FileWriter(fileResult)) {
        for (File f: listFiles) {
            int lengthCopy = rnd.nextInt(textSize);

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
                bw.write(text.substring(0, lengthCopy));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            resultWriter.write(f.getName() + ", size: " + lengthCopy + "\n");
        }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        }

    }


package by.academy.finalControl.task1;

import java.util.Scanner;

public class Task1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String string = sc.next();
        System.out.println(compressString(string));
    }

    public static String compressString(String text) {
        int strLength = text.length();

        if(strLength > 2) {
            StringBuilder compressedText = new StringBuilder();
            char lastChar = text.charAt(0);
            int charCount = 1;
            for(int i = 1; i < strLength; i++) {
                if(text.charAt(i) == lastChar) {
                    charCount++;
                }
                else {
                    compressedText.append(lastChar).append(charCount);
                    lastChar = text.charAt(i);
                    charCount = 1;
                }
            }
            compressedText.append(lastChar).append(charCount);
            if(compressedText.length() < strLength){
                return compressedText.toString();
            }
        }
        return text;
    }


}

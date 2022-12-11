package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите два слова, состоящие из четного числа букв: ");

        String word1 = sc.next();
        String word2 = sc.next();

        if (word1.length() % 2 != 0 || word2.length() % 2 != 0) {
            System.out.println("Введены слова или слово содержащие нечетноe кол-во букв");
            return;
        }
        char[] arrOfChars1 = new char[word1.length() / 2];
        char[] arrOfChars2 = new char[word2.length()];

        for (int i = 0; i < word1.length() / 2; i++) {
            char chars1 = word1.charAt(i);
            arrOfChars1[i] = chars1;
        }

        for (int i = word2.length() / 2; i < word2.length(); i++) {
            char chars2 = word2.charAt(i);
                arrOfChars2[i] = chars2;
        }

        String str1 = Arrays.toString(arrOfChars1).replace("[","").replace(",","")
                .replace(" ","").replace("]","");
        String str2 = Arrays.toString(arrOfChars2).replace("[" ,"").replace(",","")
                .replace(" ","").replace("]","");

//        String str1 = String.valueOf(arrOfChars1); второй вариант
//        String str2 = String.valueOf(arrOfChars2);

        System.out.println("Первая половина первого слова: " + str1);
        System.out.println("Вторая половина второго слова: " + str2.substring(word2.length() / 2, word2.length()));
        System.out.println(str1.concat(str2.substring(word2.length() / 2, word2.length())));
    }
}

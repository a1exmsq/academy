package by.academy.homework2;

import java.util.Random;
import java.util.Scanner;

public class Deal {

    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

    public static void main(String[] args) {

        int players;
        int cardsForEveryone = 5;

        String[] suits = {"\u2660", "\u2663", "\u2665", "\u2666"};

        String[] cardValue = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        int numberOfCards = suits.length * cardValue.length;

        System.out.println("Введите количество игроков: ");

        for(;;){

            if(sc.hasNextInt()){

            players = sc.nextInt();

                if(cardsForEveryone * players <= numberOfCards){
                    break;
                } else {
                    if (players == 0){

                        System.out.println("Игра прекращена.");
                        break;

                    } else if (players < 0){

                        System.out.println("Число игроков не может быть меньше 0.");

                    } else {

                        System.out.println("Превышено максимальное количество игроков!");
                    }
                }

            } else {

                System.out.println("Введенное число слишком большое!");
            }
        }

        String[] deck = new String[numberOfCards];
        for (int i = 0; i < cardValue.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = cardValue[i] + " " + suits[j];
            }
        }

        for (int i = 0; i < numberOfCards; i++) {
            int r = i + rnd.nextInt(numberOfCards - i);
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        for (int i = 0; i < players * cardsForEveryone; i++) {
            System.out.println(deck[i]);
            if (i % cardsForEveryone == cardsForEveryone - 1)
                System.out.println();
        }
    }

}




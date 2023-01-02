package by.academy.deal;


import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public void hello() {
        System.out.println("Добро пожаловать в строительный магазин!");
        System.out.println("Вот наш каталог: ");
        System.out.println("Для того чтобы добавить товар в корзину нажмите число соответствующее товару: ");
    }

    public void addToCartText(){
        System.out.println("Для того чтобы добавить товар в корзину нажмите число соответствующее товару: ");
    }

    public void quantityText(){
        System.out.println("Введите количество товара в шт. : ");
    }


    public  Product addToCart(Product[] p) {
        int i;
        int j = sc.nextInt() - 1;
        for (i = 0; i < p.length; i++) {
            if (i == j) {
                return p[i];
            }
        }
        return null;
    }

    public void deleteFromCart(Product[] p) {
        int i = sc.nextInt() - 1;
        p[i] = null;

    }


}


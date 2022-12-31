package by.academy.deal;

import java.util.Arrays;
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



    public void printCatalog(Product[] p) {
        int count = 1;

        for (Product product : p) {
            if (product == null) {
                break;
            }
            System.out.println(count + "." + product + " цена за шт. " + product.getPrice() + "€");
            count++;
        }

    }
    public void printShoppingCart(Product[] p) {
        int count = 1;

        for (Product product : p) {
            if (product == null) {
                break;
            }
            System.out.println(count + "." + product + " | " +  product.getPrice()
                    + "€ | "  + product.getQuantity() + " шт. " + "| Итоговая цена за товар: "
                    + product.calcPrice(product.getPrice(), product.getQuantity()) + "€");
            count++;
        }

    }
    public void printCheck (Product[] p) {

    }

    public Product addToCart(Product[] p) {
        int i;
        int j = sc.nextInt() - 1;
        for (i = 0; i < p.length; i++) {
            if (i == j) {
                return p[i];
            }
        }
        return null;
    }


}


package by.academy.deal;


import by.academy.deal.products.categories.buildingmaterials.BrickBM;
import by.academy.deal.products.categories.buildingmaterials.Cement;
import by.academy.deal.products.categories.buildingmaterials.GypsumPlasterboard;
import by.academy.deal.products.categories.metalwork.Bolt;
import by.academy.deal.products.categories.metalwork.NailMW;
import by.academy.deal.products.categories.metalwork.Nut;
import by.academy.deal.products.categories.tools.ClawHammer;
import by.academy.deal.products.categories.tools.ConcreteMixer;
import by.academy.deal.products.categories.tools.Screwdriver;
import java.util.Scanner;

public class Application {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Menu menu = new Menu();
        Deal deal = new Deal();
        menu.hello();
        Product[] shoppingCart = new Product[15];
        Product[] products = new Product[15];
        products[0] = new BrickBM(1);
        products[1] = new Cement(1);
        products[2] = new GypsumPlasterboard(1);
        products[3] = new Bolt(1);
        products[4] = new NailMW(1);
        products[5] = new Nut(1);
        products[6] = new ClawHammer(1);
        products[7] = new ConcreteMixer(1);
        products[8] = new Screwdriver(1);

        deal.printCatalog(products);
        menu.addToCartText();

        for (int i = 0; i < shoppingCart.length; i++){
            shoppingCart[i] = menu.addToCart(products);
            menu.quantityText();
            shoppingCart[i].setQuantity(sc.nextInt());
            System.out.println("Желаете продолжить?");
            System.out.println("1 - ДА, 2 - Посмотерь в корзину ");
            int cont = sc.nextInt();
            if (cont == 1) {
                deal.printCatalog(products);
            } else if (cont == 2) {
                deal.printShoppingCart(shoppingCart);
                System.out.println("1 - Вернутся к каталогу, 2 - Оплатить товары");
                if (sc.nextInt() == 1)
                deal.printCatalog(products);
                else break;
            } else {
                System.out.println("Число введено неверно");
            }

        }
        System.out.println("Хотите ли удалить некоторые позиции из корзины: ");
        System.out.println("1 - НЕТ, печать чека; 2 - ДА");
        int delete = sc.nextInt();
        if (delete == 2) {
            System.out.println("Введите номер позиции из корзины которую хотите удалить: ");
            menu.deleteFromCart(shoppingCart);
        } else {
            System.out.println("Печатаем чек: ");
            deal.printCheck(shoppingCart);
        }

    }
}
package by.academy.deal;

import by.academy.deal.products.categories.BuildingMaterials;
import by.academy.deal.products.categories.buildingmaterials.BrickBM;
import by.academy.deal.products.categories.buildingmaterials.Cement;
import by.academy.deal.products.categories.buildingmaterials.GypsumPlasterboard;
import by.academy.deal.products.categories.metalwork.Bolt;
import by.academy.deal.products.categories.metalwork.NailMW;
import by.academy.deal.products.categories.metalwork.Nut;
import by.academy.deal.products.categories.tools.ClawHammer;
import by.academy.deal.products.categories.tools.ConcreteMixer;
import by.academy.deal.products.categories.tools.Screwdriver;

import java.util.Arrays;
import java.util.Scanner;
// короче говоря до нг не успел сделать, сильно занят был, до занятия полностью сделаю:)

public class Application {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Menu menu = new Menu();
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

        menu.printCatalog(products);
        menu.addToCartText();



        for (int i = 0; i < shoppingCart.length; i++){
            shoppingCart[i] = menu.addToCart(products);
            menu.quantityText();
            shoppingCart[i].setQuantity(sc.nextInt());
            System.out.println("Желаете продолжить?");
            System.out.println("1 - ДА, 2 - Посмотерь в корзину ");
            int cont = sc.nextInt();
            if (cont == 1) {
                menu.printCatalog(products);
            } else if (cont == 2) {
                menu.printShoppingCart(shoppingCart);
            } else {
                System.out.println("Число введено неверно");
            }

        }
//        System.out.println("Печатаем чек: ");
        System.out.println(Arrays.toString(shoppingCart));



    }
}





//        System.out.println("");
//
//
//       Product bm = new BuildingMaterials("кирпич", 123, 12, "");
//       System.out.println(bm);
//        Product nw = new NailMW(44);
//        System.out.println(nw.calcPrice(nw.getPrice(), sc.nextInt()));
//        System.out.println(nw);
//        BrickBM brick = new BrickBM(sc.nextInt());
//        Cement cement = new Cement(sc.nextInt());
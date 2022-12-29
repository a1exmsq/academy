package by.academy.deal;

import by.academy.deal.products.categories.metalwork.NailMW;

import java.util.Scanner;

public class Application {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


//        Product bm = new BuildingMaterials("кирпич", 123, 12, "");
//        System.out.println(bm);
        Product nw = new NailMW(44);
        System.out.println(nw.calcPrice(nw.getPrice(), sc.nextInt()));
        System.out.println(nw);
    }
}

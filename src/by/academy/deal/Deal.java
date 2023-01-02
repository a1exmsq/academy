package by.academy.deal;

import by.academy.deal.products.categories.buildingmaterials.BrickBM;

import java.time.LocalDate;
import java.util.Arrays;

public class Deal {

    private Person seller;

    private Person buyer;

    private Product[] products;

    private LocalDate deadlineDate  = LocalDate.now().plusDays(10);

    private final String[] checkTitles = {"Товары", "Категория", "Количество", "Цена за 1ед.", "Сумма"};

    public Deal(Person seller, Person buyer, Product[] products) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
    }

    public Deal() {
    }


    public Person getSeller() {
        return seller;
    }

    public void setSeller(Person seller) {
        this.seller = seller;
    }

    public Person getBuyer() {
        return buyer;
    }

    public void setBuyer(Person buyer) {
        this.buyer = buyer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public LocalDate getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(LocalDate deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public void printCatalog(Product[] p) {
        int count = 1;

        for (Product product : p) {
            if (product == null) {
                break;
            }
            System.out.println(count + "." + product + " цена за 1ед. " + product.getPrice() + "€");
            count++;
        }

    }
    public void printShoppingCart(Product[] p) {
        int count = 1;

        for (Product product : p) {
            if (product == null) {
                continue;
            }
            System.out.println(count + "." + product + " | " +  product.getPrice()
                    + "€ | "  + product.getQuantity() + " шт. " + "| Итоговая цена за товар: "
                    + product.calcPrice(product.getPrice(), product.getQuantity()) + "€");
            count++;
        }

    }

    public void printCheck (Product[] p) {
        System.out.println("Дата:\t\t\t\t" + getDeadlineDate());
        System.out.printf("%-30s%-25s%-12s%-14s%s", checkTitles[0], checkTitles[1], checkTitles[2], checkTitles[3], checkTitles[4]);
        System.out.println("\n------------------------------------------------------------------------------------------");
        shoppingCart(p);
        System.out.println("------------------------------------------------------------------------------------------");
        double finalPrice = 0;
        for (Product product : p) {
            if (product == null) {
                continue;
            }
            finalPrice += product.calcPrice(product.getPrice(), product.getQuantity());
        }
        System.out.printf("Итого:\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t %.2f€", finalPrice);

    }

    public void shoppingCart(Product[] p) {

        for (Product product : p) {
            if (product == null) {
                continue;
            }
            System.out.printf("%-30s%-25s%-12d%.2f€\t\t %.2f€\n",  product, product.getCategory(), product.getQuantity(),product.getPrice(), product.calcPrice(product.getPrice(), product.getQuantity()));

        }
    }
    @Override
    public String toString() {
        return "Deal{" +
                "seller=" + seller +
                ", buyer=" + buyer +
                ", products=" + Arrays.toString(products) +
                ", deadlineDate=" + deadlineDate +
                '}';
    }
}

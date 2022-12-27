package by.academy.deal.products;

import by.academy.deal.Product;

public class MetalWork extends Product {

    public MetalWork(String name, int quantity, double price, String category) {
        super(name, quantity, price, category);
        this.setCategory("Металлические изделия");
    }
}

package by.academy.deal.products;

import by.academy.deal.Product;

public class BuildingMaterials extends Product {

    public BuildingMaterials(String name, int quantity, double price, String category) {
        super(name, quantity, price, category);
        this.setCategory("Строительные материалы");
    }
}

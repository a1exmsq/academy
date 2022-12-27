package by.academy.deal.products;

public class NailMW extends MetalWork{

    public NailMW(String name, int quantity, double price, String category) {
        super(name, quantity, price, category);
        this.setName("Гвозди");
        this.setPrice(0.03);
        this.setCategory("Строительные материалы");
    }
}

package by.academy.deal;

import java.time.LocalDate;

public class Deal {

    private Person seller;

    private Person buyer;

    private Product[] products;

    private LocalDate deadlineDate;

    public Deal(Person seller, Person buyer, Product[] products, LocalDate deadlineDate) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
        this.deadlineDate = LocalDate.now();
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
}

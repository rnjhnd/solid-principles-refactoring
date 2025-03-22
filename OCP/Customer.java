package OCP;

class Customer {
    private String name;
    private DiscountStrategy discount;

    public Customer(String name, DiscountStrategy discount) {
        this.name = name;
        this.discount = discount;
    }

    public double applyDiscount(double amount) {
        return amount - discount.calculateDiscount(amount);
    }

    public String getName() {
        return name;
    }
}

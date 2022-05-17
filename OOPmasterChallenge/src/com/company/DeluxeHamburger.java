package com.company;

public class DeluxeHamburger extends Hamburger{

    public DeluxeHamburger(String rollType, String meat, double basePrice) {
        super(rollType, meat, basePrice);
        double Chips = 7;
        super.setAdditionalPrice(getAdditionalPrice() + Chips);
        double Drink = 8;
        super.setAdditionalPrice(getAdditionalPrice() + Drink);
    }

    @Override
    public void Menu() {
        System.out.println("-----Deluxe Additions Menu----- \n 7.Chips £7 \n 8.Drink £8 " );
    }

    @Override
    public void additionalItems(int choice) {
        System.out.println("NO");
    }

    @Override
    public double orderTotal() {
        return super.orderTotal();
    }
}
package com.company;

public class Hamburger{

    private String rollType;
    private String meat;
    private String name;
    private double basePrice;

    private double additionalPrice;

    public Hamburger(String rollType, String meat, double basePrice) {
        this.rollType = rollType;
        this.meat = meat;
        this.name = "Basic Burger";
        this.basePrice = basePrice;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getAdditionalPrice() {
        return additionalPrice;
    }

    public void setAdditionalPrice(double additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    public void Menu(){
        System.out.println("-----Basic Additions Menu----- \n 1.Cheese £1 \n 2.Tomato £2 \n 3.Onion £3 \n 4.lettuce £4 \n" );
    }

    public void additionalItems(int choice){
        if(choice >= 1 && choice <= 4){
            switch (choice){
                case 1:
                    System.out.println("Adding Cheese");
                    double cheese = 1;
                    setAdditionalPrice(getAdditionalPrice() + cheese);
                    break;
                case 2:
                    System.out.println("Adding Tomato");
                    double tomato = 2;
                    setAdditionalPrice(getAdditionalPrice() + tomato);
                    break;
                case 3:
                    System.out.println("Adding Onion");
                    double onion = 3;
                    setAdditionalPrice(getAdditionalPrice() + onion);
                    break;
                case 4:
                    System.out.println("Adding Lettuce");
                    double lettuce = 4;
                    setAdditionalPrice(getAdditionalPrice() + lettuce);
                    break;
            }
        }
    }

    public double orderTotal(){
        return getBasePrice() + getAdditionalPrice();
    }
}
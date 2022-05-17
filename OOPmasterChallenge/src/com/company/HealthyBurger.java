package com.company;

public class HealthyBurger extends Hamburger{

    public HealthyBurger(String meat, double basePrice) {
        super("brown rye bread", meat, basePrice);
    }

    @Override
    public void additionalItems(int choice){
        super.additionalItems(choice);
            switch (choice){
                case 5:
                    System.out.println("Adding salad");
                    double salad = 5;
                    setAdditionalPrice(getAdditionalPrice() + salad);
                    break;
                case 6:
                    System.out.println("Adding chicken");
                    double chicken = 6;
                    setAdditionalPrice(getAdditionalPrice() + chicken);
                    break;
            }
    }

    @Override
    public double orderTotal() {
        return super.orderTotal();
    }

    @Override
    public void Menu() {
        super.Menu();
        System.out.println("-----Healthy Additions Menu----- \n 5.salad £5 \n 6.chicken £6 " );
    }
}
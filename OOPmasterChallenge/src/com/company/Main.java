package com.company;

// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.

// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
// The basic hamburger should have the following items.

// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.

// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).

// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).

// Create a Hamburger class to deal with all the above.

// The constructor should only include the roll type, meat and price, can also include name of burger

// Also create two extra varieties of Hamburgers (subclasses) to cater for

// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class65
// (in other words new burger type).

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.

//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand total for the
// burger (base price + all additions)

// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.

public class Main {

    public static void menu(){
        //Maybe the user sees the different burgers here
    }

    public static void main(String[] args) {

        Hamburger burger = new Hamburger("white","Beef",2.50);
        burger.Menu();
        burger.additionalItems(1);
        burger.additionalItems(2);
        burger.additionalItems(3);
        burger.additionalItems(4);
        System.out.println(burger.orderTotal());

        System.out.println("-----BREAK-----");

        HealthyBurger healthyBurger = new HealthyBurger("chicken",3.00);
        healthyBurger.Menu();
        healthyBurger.additionalItems(6);
        healthyBurger.additionalItems(5);
        healthyBurger.additionalItems(1);
        healthyBurger.additionalItems(2);
        healthyBurger.additionalItems(3);
        healthyBurger.additionalItems(4);
        System.out.println(healthyBurger.orderTotal());

        System.out.println("-----BREAK-----");

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("brioche","beef",4.00);
       // deluxeHamburger.Menu();
        deluxeHamburger.additionalItems(7);
        //deluxeHamburger.additionalItems(8);
        System.out.println(deluxeHamburger.orderTotal());
    }
}
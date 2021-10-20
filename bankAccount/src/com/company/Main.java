package com.company;

public class Main
{
    public static void main(String[] args)
    {
//        Account account = new Account("12345",0.00,"Bob Brown","myemail@bob.com","(087) 123-4567");
//        Account account1 = new Account();
//        System.out.println(account.getAccountNumber());
//        System.out.println(account.getBalance());
//
//        account.withdraw(100);
//        account.deposit(50);
//        account.withdraw(100);
//
//        Account timAccount = new Account("Tim","tim@email.com","12345");
//        System.out.println(timAccount.getAccountNumber() + " name " + timAccount.getCustomerName());


    vipCustomer vip1 = new vipCustomer();
        System.out.println(vip1.getName());

    vipCustomer vip2 = new vipCustomer("Bob",25000.00);
        System.out.println(vip2.getName());

    vipCustomer vip3 = new vipCustomer("Tim",25000.00,"Tim@email.com");
        System.out.println(vip3.getName());
        System.out.println(vip3.getEmail());
    }
}
package banking;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args){
        Bank bank = new Bank();

        bank.run();
    }
    public void run(){
        System.out.println("Donner votre nom :");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+ name + " Nous sommmes en train de creer un compte pour vous");
        Customer customer = new Customer(name);

        System.out.println("Donner votre adress :");
        String address = sc.next();
        customer.setAddress(address);
        BankAccount checkingAccount = new BankAccount("checking", customer);
        BankAccount savingAccount = new BankAccount("Savings", customer);

        System.out.println();
        System.out.println("Customer info: ");
        System.out.println(checkingAccount.getCustomerInfo());

        System.out.println("Checking info: ");
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println("Saving info: ");
        System.out.println(savingAccount.getAccountInfo());

        System.out.println();
        System.out.println("La somme a mettre dans le compte checque ");
        double amount = sc.nextDouble();
        checkingAccount.deposit(amount);

        System.out.println("La somme a mettre dans le compte epargne ");
        amount = sc.nextDouble();
        savingAccount.deposit(amount);

        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingAccount.getAccountInfo());

        System.out.println();
        System.out.println("La somme a retirer du compte checque ");
        amount = sc.nextDouble();
        try {
            checkingAccount.withdraw(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("La somme a retirer du compte epargne ");
        amount = sc.nextDouble();
        try {
            savingAccount.withdraw(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //print
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingAccount.getAccountInfo());

        sc.close();

    }

}

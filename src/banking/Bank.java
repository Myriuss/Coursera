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
        System.out.println("Hello "+ name + "Nous sommmes en train de creer un compte pour vous");
        Customer customer = new Customer(name);

        System.out.println("Donner votre adress :");
        String address = sc.next();
        customer.setAddress(address);
        BankAccount checkingAccount = new BankAccount("checking", customer);
        BankAccount savingAccount = new BankAccount("Savings", customer);

        System.out.println();
        System.out.println("Customer info: ");
        System.out.println(checkingAccount.getAccountInfo());
    }
}

package Lesson4;

public class BankAccount {

    int id;
    String name;
    double balance;

    double popolnenieScheta(int babki){

        balance+=babki;
        return balance;
    }

    double snyatieSoScheta(int babki){
        balance-=babki;
        return balance;
    }

    }




class BankAccountTest {
    public static void main(String[] args) {

            BankAccount MyAccount = new BankAccount();
            BankAccount YourAccount = new BankAccount();
            BankAccount HisAccount = new BankAccount();

            MyAccount.id = 1;
            MyAccount.name = "Dimas";
            MyAccount.balance = 12.35;

            YourAccount.id = 2;
            YourAccount.name = "Mike";
            YourAccount.balance = 2.5;

            HisAccount.id = 3;
            HisAccount.name = "Ivan";
            HisAccount.balance = 0.35;

        System.out.println(MyAccount.balance);
            MyAccount.popolnenieScheta(30);
        System.out.println(MyAccount.balance);
        MyAccount.snyatieSoScheta(50);
        System.out.println(MyAccount.balance);
    }
}
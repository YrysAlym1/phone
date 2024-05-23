package phone.service.impl;

import phone.models.Account;
import phone.service.MBankService;

import java.util.Scanner;

public class MBankImpl implements MBankService {
    private Account[] accounts = new Account[100];
    private int counter = 0;


    @Override
    public void accountMenu() {
        System.out.println("""
                1.profile
                2.balance
                3.delete account
                4.out application
                """);
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                System.out.println(profile());
                break;
            case 2:

                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

    @Override
    public void menu() {
        System.out.println("""
                1.create account;
                2.login
                """);
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                createAccount();
                break;
            case 2:
                loginAccount();
                break;
            default:
                System.out.println("Not this operation!");
                break;
        }
    }

    @Override
    public void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First name: ");
        String firstName = scanner.nextLine();
        System.out.println("Last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Age: ");
        int age = new Scanner(System.in).nextInt();
        System.out.println("ID passport: ");
        String idPassport = scanner.nextLine();

        Account account = new Account();
        account.setFirstName(firstName);
        account.setLastName(lastName);
        account.setAge(age);
        account.setIDPassport(idPassport);

        accounts[counter++] = account;
        accountMenu();
    }

    @Override
    public void loginAccount() {

    }

    @Override
    public String sendMoney() {
        return null;
    }

    @Override
    public String deleteAccount() {
        return null;
    }

    @Override
    public String replenish() {
        return null;
    }

    public Account profile() {
        Account account = new Account();
        System.out.println("ID passport: ");
        String idPassport = new Scanner(System.in).nextLine();
        for (int i = 0; i < counter; i++) {
            if (accounts[i].getIDPassport().equalsIgnoreCase(idPassport)) {
                account = accounts[i];
            }
        }
        return account;
    }

    public void balance() {
        System.out.println("ID passport: ");
        String idPassport = new Scanner(System.in).nextLine();
        for (int i = 0; i < counter; i++) {
            if(accounts[i].getIDPassport().equals(idPassport)) {
                System.out.println("Balance :"+accounts[i].getIDPassport());
                System.out.println("|~~~~~~~~~~~~~~~~~~~~|");
            }
        }
    }
}

package access;

import access.b.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        int amount = 100;
        account.isamountvalid(amount);
        account.deposit(10000);//만원 입금
        account.withdraw(5000);//5천원 출금
        System.out.println("balance = " + account.getBalance());
    }
}

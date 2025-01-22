package access.b;

public class BankAccount {

    private int balance;

    public BankAccount() {
        this.balance = 0;//잔고 0 원
    }

    //public 입금
    public void deposit(int amount) {
        if (isamountvalid(amount)) {
            balance += amount;
        }else{
            System.out.println("유효하지 않은 금액입니다");
        }
    }

    public void withdraw(int amount) {
        if(isamountvalid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다");
        }
    }

    //publc 메서드 : getbalance
    public int getBalance() {
        return balance;
    }

    //만약에 이 메서드를  public 으로 설정하면?
    public boolean isamountvalid(int amount) {
        //금액이 0 보다 커야함
        return amount > 0;
        //0보다 크면 참을 반환한다
    }
}

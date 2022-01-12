package k14dhpm2.oo;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account account = new Account();
        account.show();
        account.deposit(10000);
        account.show();
        account.withdraw(5000);
        account.show();


    }
    
}

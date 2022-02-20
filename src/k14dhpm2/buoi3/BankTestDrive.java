package k14dhpm2.buoi3;

public class BankTestDrive {
    public static void main(String[] args) {
        Bank bank = new Bank(123456, 10000);

        bank.deposits(500);
        bank.withdrawals(200);
        bank.show_account_balance();
    }
    
}

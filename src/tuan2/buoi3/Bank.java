package tuan2.buoi3;


public class Bank {
    int account_id;
    double account_balance;
    double account_deposits;
    double account_withdrawals;

    public Bank(int account_id, double account_balance){
        this.account_id = account_id;
        this.account_balance = account_balance;
    }

    void deposits(double account_deposits){
        System.out.println("- Số tiền gửi là: "+account_deposits);
        account_balance += account_deposits;
        System.out.println("- Thông tin tài khoản là:");
        System.out.println("+ Id: "+account_id);
        System.out.println("+ Số dư tài khoản: "+account_balance);
        System.out.println("___________________________________");
    }
    
    void withdrawals(double account_withdrawals){
        System.out.println("- Số tiền rút là: "+account_withdrawals);
        account_balance -= account_withdrawals;
        System.out.println("- Thông tin tài khoản là:");
        System.out.println("+ Id: "+account_id);
        System.out.println("+ Số dư tài khoản: "+account_balance);
        System.out.println("___________________________________");
    }

    void show_account_balance(){
        System.out.println("- Thông tin tài khoản là:");
        System.out.println("+ Id: "+account_id);
        System.out.println("+ Số dư tài khoản: "+account_balance);
        System.out.println("___________________________________");
    }
}

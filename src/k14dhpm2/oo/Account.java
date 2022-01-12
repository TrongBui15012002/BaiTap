package k14dhpm2.oo;

public class Account {
    //data
    int account_number;
    int account_balance;
    //operation
    //functions
    void deposit(int amount){
        account_balance += amount; 
    }
    void withdraw(int amount){
        account_balance -= amount;
    }
    void show(){
        System.out.println("- Thông tin tài khoản: ");
        System.out.println("+ Số tài khoản: "+account_number);
        System.out.println("+ Số dư tài khoản: "+account_balance);
    }
}

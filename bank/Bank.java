package bank;

class Account{
    public String name ;

    public void printInfo(){
        System.out.println(this.name);
    }
}

public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name="shahariar";
    }
}

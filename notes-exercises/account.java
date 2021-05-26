public class account{
    private int number;
    private double balance;

    public account(int number){
        this.number = number;
        this.balance = 0;
    }

    public account(int number, double balance){
        this.number = number;
        this.balance = balance;
    }

    public int getNumber(){
        return this.number;
    }

    public double getBalance(){
        return this.balance;
    }

    public String toString(){
        return String.format("Account[number="+this.number+",balance=$%.2f]",this.balance);
    }

    public account credit(double amount){
        this.balance += amount;
        return this;
    }

    public account debit(double amount){
        if(balance >= amount){
            this.balance -= amount;
        } else {
            throw new IllegalArgumentException();
        }
        return this;
    }

    public account transferTo(double amount, account another){
        if(balance >= amount){
            this.balance -= amount;
            another.balance += amount;
        } else {
            throw new IllegalArgumentException();
        }
        return this;
    }

    // test driver
    public static void main(String[] args) {
        account a1 = new account(101);
        account a2 = new account(102);
        System.out.println(a1);

        a1.credit(200);
        try {
            a1.debit(500);
        } catch (IllegalArgumentException ex) {
            System.out.println("Insufficient amount");
        }

        try {
            a1.transferTo(100, a2);
        } catch (IllegalArgumentException ex) {
            System.out.println("Insufficient amount");
        }

        System.out.println(a2.debit(100).credit(500).transferTo(200, a1));
    }
}

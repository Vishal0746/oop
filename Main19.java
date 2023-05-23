interface Account {
    void set(String name, int accountNumber, double balance);
    void display();
}

interface Person {
    void store(String name);
    void disp();
}

class Customer implements Person, Account {
    private String name;
    private int accountNumber;
    private double balance;
    
    public void set(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void display() {
        System.out.println("Account Information:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs" + balance);
    }
    
    public void store(String name) {
        this.name = name;
    }
    
    public void disp() {
        System.out.println("Person Information:");
        System.out.println("Name: " + name);
    }
    
    public void calculateInterest(double rate) {
        double interest = balance * rate / 100;
        balance += interest;
        System.out.println("Interest added: Rs" + interest);
    }
}

public class Main19{
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.store("John Smith");
        customer.set("John Smith", 123456, 5000.0);
        customer.display();
        customer.calculateInterest(5.0);
        customer.display();
        customer.disp();
    }
}

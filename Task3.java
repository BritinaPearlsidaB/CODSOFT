 import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    
    public double getBalance() {
        return balance;
    }
}

class ATM {
    private BankAccount account;
    private Scanner sc;

    public ATM(BankAccount account) {
        this.account = account;
        sc = new Scanner(System.in);
    }

    public void menu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
            System.out.println("Withdrawal successful.");
            System.out.println("Current balance: " + account.getBalance());
        }

    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
        System.out.println("Deposit successful.");
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + account.getBalance());
    }

    

    public static void main(String[] args) {
        BankAccount account = new BankAccount(3000.0);
        ATM atm = new ATM(account);
        Scanner sc=new Scanner(System.in);
                atm.menu();
                System.out.print("Enter the operation: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                       atm.withdraw();
                        break;
                    case 2:
                       atm.deposit();
                        break;
                    case 3:
                       atm.checkBalance();
                        break;
                    case 4:
                        System.out.println("Thank you!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                sc.close();
        }
       
    }

 
    


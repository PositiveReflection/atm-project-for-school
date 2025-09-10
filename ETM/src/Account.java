class Account {
    private int pin;
    private double balance;

    public Account(int pin, double initialBalance){
        this.pin = pin;
        this.balance = initialBalance;
    }
    public boolean checkPin(int enteredPin){
        return this.pin == enteredPin;
    }
    public double returnBalance(){
        return balance;
    }
    public void deposit(double amount){
        if (amount > 0){
            amount = amount + balance;
            System.out.println("Deposited " + amount + ". \n New balance: " + balance);
        } else {
            System.out.println("Deposit must be positive!");
        }
    }
    public void withdraw(double amount){
        if (amount <= 0){
            System.out.println("withdraw amount must be positive!");
        } else if (amount > balance) {
            System.out.println("Insufficent funds!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrew " + amount + "\n New balance: " + balance);
        }
    }
}
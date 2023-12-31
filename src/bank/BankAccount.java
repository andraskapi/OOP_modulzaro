package bank;

public class BankAccount {
    private String accountName;
    private double balance;
    private final String accountNumber;

    public BankAccount(String accountName, double balance, String accountNumber) {
        this.accountName = accountName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public static boolean isValidAccountNumber(String accountNumber) throws InvalidAccountNumberException {

        int sum = 0;
        int firstDigit = accountNumber.charAt(0);
        int lastDigit = accountNumber.charAt(accountNumber.length() - 1);

        for (int i = 0; i < accountNumber.length(); i++) {
            sum += Integer.parseInt(accountNumber.charAt(i) + "");
        }if (firstDigit % 2 == lastDigit % 2 && sum >= 20){
            return true;
        }throw new InvalidAccountNumberException("Nem megfelelő számlaszám");
    }

    public void transfer(double amount, BankAccount other) throws NoMoneyException, NullAmountException {
        if (amount < 1) {
            throw new NullAmountException("Ennél többet kell utalnod");
        }

        if (amount < this.balance) {
            this.balance -= amount;
            other.deposit(amount);
        } else throw new NoMoneyException("Nincs elég fedezet!");
    }

    public void withdraw(double amount) throws NoMoneyException, NullAmountException {
        if (amount < 1) {
            throw new NullAmountException("Ennél többet kell levenned");
        }
        if (amount < this.balance) {
            this.balance -= amount;
        } else throw new NoMoneyException("Nincs elég fedezet!");

    }

    public void deposit(double amount) throws NullAmountException {
        if (amount < 1) {
            throw new NullAmountException("Ennél többet kell befizetned");
        }
        this.balance += amount;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountName='" + accountName + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}

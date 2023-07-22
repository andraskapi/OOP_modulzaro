package bank;

public class Main {
    public static void main(String[] args) throws NoMoneyException, NullAmountException, InvalidAccountNumberException {
        BankAccount janiAcc = new BankAccount("Kis János",7500,"2447888");
        BankAccount belaAcc = new BankAccount("Kovács Béla",500,"1254000");

        System.out.println(BankAccount.isValidAccountNumber(janiAcc.getAccountNumber()));
        try {
            System.out.println(BankAccount.isValidAccountNumber(belaAcc.getAccountNumber()));
        }catch (InvalidAccountNumberException exception){
            System.out.println(exception.getMessage());
        }



        System.out.println(janiAcc.getBalance());
        System.out.println(janiAcc.getAccountName());
        System.out.println(janiAcc.getAccountNumber());
        janiAcc.deposit(1000);
        System.out.println(janiAcc);
        janiAcc.withdraw(1500);
        System.out.println(janiAcc);
        try {

            janiAcc.withdraw(12000);
        }catch (NoMoneyException e){
            System.out.println(e.getMessage());
        }


        System.out.println(janiAcc);

        janiAcc.transfer(1740,belaAcc);
        System.out.println(janiAcc);
        System.out.println(belaAcc);

    }


}

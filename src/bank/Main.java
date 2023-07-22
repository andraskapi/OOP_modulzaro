package bank;

public class Main {
    public static void main(String[] args) throws NoMoneyException, NullAmountException {
        BankAccount janiAcc = new BankAccount("Kis János",7500,"1447886-6654788");
        BankAccount belaAcc = new BankAccount("Kovács Béla",500,"1447886-7841473");

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

package creatingClasses;

public class bankTest {
    public static void main(String[] args) {
        bankAccount myAccount= new bankAccount("Checking",10000.0, 12345 );
        System.out.println("Account name"+myAccount.Name+"balance:"+" "+myAccount.Balance+"Account number"+myAccount.Number);
        myAccount.addMoney(1000);
        myAccount.withdrawMoney(1000);
        myAccount.checkBalance();
    }
}

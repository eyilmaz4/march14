package creatingClasses;

public class bankAccount {
    String Name;
    double Balance;
    float Number;
    public bankAccount(String name, double balance, int number){
        Name=name;
        Balance=balance;
        Number=number;
    }
    public void checkBalance(){
        System.out.println("your balance:"+" "+Balance);
    }
    public void addMoney(double money){
        System.out.println("you added:"+money+" "+"your new balance"+(Balance+money));
    }
    public void withdrawMoney(double money){
        System.out.println("you withdrew:"+money+" "+"your new balance"+(Balance-money));
    }
}

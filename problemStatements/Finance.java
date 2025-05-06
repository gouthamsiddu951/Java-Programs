
class Bank{
private class SBI implements ATM{
public void withdraw(){
System.out.println("withdraw from SBI");
}
public void checkbal(){
System.out.println("Chech balance from SBI");
}
public void deposit(){
System.out.println("deposit from SBI");
}
}
public ATM atm(){
return new SBI();
}
}
public class Finance{
public static void main(String [] args){
Bank bank=new Bank();
ATM obj=bank.atm();
obj.withdraw();
obj.checkbal();
obj.deposit();
}
}

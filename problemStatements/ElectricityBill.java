import java.util.Scanner;
public class ElectricityBill{
public static void main(String[] args){
int units;
Scanner scanner=new Scanner(System.in);
System.out.println("enter units");
units=scanner.nextInt();
double bill=0;
if(units<=100){
bill=units*1.50;

}
else if(units<=200){
bill=(100*1.50)+((units-100)*2.0);

}else if(units<=300){
bill=(100*1.50)+(100*2.0)+((units-200)*3.0);

}else{
bill=(100*1.50)+(100*2.0)+(100*3.0)+((units-300)*5.0);

}
System.out.println("the total amount is: "+ bill);
}
}
class Vechile{
void move(){
System.out.println("Vechile is moving...");
}
}
class Car extends Vechile{
void speed(){
System.out.println("Car is moving at a high speed.");
}
}
public class Mainvechile{
public static void main(String[] args){
Car myCar=new Car();
myCar.move();// Inherited method from vechile
myCar.speed();// Method of car class
}
}
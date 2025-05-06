class Fruit{
String color;
String shape;
double price;
public Fruit(String color,String shape,double price){
this.color=color;
this.shape=shape;
this.price=price;
}
public void business(){
System.out.println("from instamart");
}
}
class Banana extends Fruit{
public Banana(String color,String shape,double price){
super(color,shape,price);
}
public void energy(){
System.out.println("eat banana");
}
}
public class FruitShop{
public static void main(String[] args){
Banana banana=new Banana("Yellow","Booarang",20.0);
System.out.println(banana.color);
System.out.println(banana.shape);
System.out.println(banana.price);
banana.energy();
banana.business();
}
}

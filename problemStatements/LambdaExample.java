//Function class and lambda example


@FunctionalInterface
interface MathOperation{
int operate(int a,int b);
}
public class LambdaExample{
public static void main(String[] args){
MathOperation addition=(a,b)->a+b;
System.out.println("sum:"+addition.operate(5,3));
}
}
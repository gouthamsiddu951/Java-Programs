//to check if math palindrome or not
class mathpalindrome{
public static void main(String[] args){
int s=121;
int original=s;
int remainder;
int reversed=0;
while(s != 0){
remainder=s%10;
reversed=reversed*10+remainder;
s=s/10;
}
if(original==reversed){
System.out.print("palin");

}else{
System.out.print("not");
}
}
}
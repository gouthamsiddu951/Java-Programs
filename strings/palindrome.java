//to check if palindrome or not
class palindrome{
public static void main(String[] args){
String s="121";
String rev="";
for(int i=0;i<s.length();i++){
rev=rev+s.charAt(i);
}
if(rev.equals(s)){
System.out.print("palin");
}else{
System.out.print("not");
}
}
}
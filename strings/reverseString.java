//print reverse of string
class reverseString{
public static void main(String[] args){
String s="gowtham";
String rev="";
for(int i=0;i<s.length();i++){
rev=s.charAt(i)+rev;
}
System.out.print(rev);
}
}
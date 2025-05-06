//find how many characters are there 
class StringCharacters{
public static void main(String [] args){
String s="india@123";
int count=0;
for(int i=0;i<s.length();i++){
if ((s.charAt(i)>='a' && s.charAt(i)>='z')||(s.charAt(i)>='A' && s.charAt(i)>='Z'))
count++;
}
System.out.println("characters presesnt are :" + count);
}
}

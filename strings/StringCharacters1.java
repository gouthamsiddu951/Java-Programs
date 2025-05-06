//find how many characters,numbers,special characters are there 
class StringCharacters1{
public static void main(String [] args){
String s="india@123";
int charcount=0;
int numcount=0;
int specialcharacter=0;
for(int i=0;i<s.length();i++){
if ((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z')){
charcount++;
}
else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
numcount++;
}
else{
specialcharacter++;
}
}
System.out.println("characters presesnt are :" + charcount);
System.out.println("num presesnt are :" + numcount);
System.out.println("special presesnt are :" + specialcharacter);
}
}
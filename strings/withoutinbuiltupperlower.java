//convert to uppercase to lower without inbuild in string

class withoutinbuiltupperlower {
public static void main(String[] args) {
String s = "gowtham";
char[]ch=s.toCharArray();
for(int i=0;i<ch.length;i++){
if(ch[i]>='a'&&ch[i]<='z'){
ch[i]=(char)(ch[i]-32);
    }
}
System.out.println(ch);
}
}

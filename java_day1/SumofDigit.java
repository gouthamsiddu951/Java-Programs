class SumofDigit {
  public static void main(String[] args) {
int sum= 0;
int digit =0;
int num=123;
while(num>0){
  digit=num%10;
  sum=sum+digit;
  num=num/10;
  }
  System.out.println("sum:"+sum);
  }
}
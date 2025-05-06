class ClassName{
    public int method_Name(int n){
       int fact = 1;
       for(int i=0;i<n;i++){
        fact+=i;
       }
return fact;
    } 
    public static void main(String[] args){
        ClassName obj = new ClassName();
        obj.method_Name(5);
    }
}
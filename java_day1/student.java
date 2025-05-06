class student {
    String name1;
    String name2;
    long phno;
    double precentagea;
    double percentageb;
    student(String name1,String name2,long phno, double precentagea,double percentageb){
    this.name1=name1;
    this.name2=name2;
    this.precentagea=precentagea;
    this.percentageb=percentageb;
    }
    public static void main(String[] args){
        student obj = new student("siddu","goutham",9100668514l,80.0,90.0 );
        System.out.println(obj.name1);
        System.out.println(obj.name2);
        System.out.println("10th percentage:"+" "+ obj.precentagea);
        System.out.println("12th percentage:"+" "+ obj.percentageb);
    }
    
}

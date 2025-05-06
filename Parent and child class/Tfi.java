class Movie{
double movieBudget;
String movieGener;
String directorName;
public Movie(double movieBudget, String movieGener,String directorName){
this.movieBudget=movieBudget;
this.movieGener=movieGener;
this.directorName=directorName;
}
}
class KGF extends Movie{
String actorName;
String actressName;
double collections;
public KGF(double movieBudget, String movieGener,String directorName,String actorName,String actressName,double collections){
super(movieBudget,movieGener,directorName);
this.actorName=actorName;
this.actressName=actressName;
this.collections=collections;
}
public void display(){
System.out.println(movieBudget);
System.out.println(movieGener);
System.out.println(directorName);
System.out.println(actorName);
System.out.println(actressName);
System.out.println(collections);
}

public void showDialogue(){
System.out.println("The dialogue is Violence....Violence");
}
}
public class Tfi{
public static void main(String[] args){
KGF kgfmovie=new KGF(250.0,"Action","Neel mowa","YASH","Srinidhi",1200.0);

kgfmovie.display();
kgfmovie.showDialogue();
}
}


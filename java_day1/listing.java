class Contact{
    String name;
    long phno;
    String email;
    public void save(){
        System.out.println(name + phno);
    }
    class listing{
    public static void main(String[] args){
        Contact c=new Contact();
        c.name="sid";
        c.phno=123l;
        c.email="s@gmial";
        c.save();
    }
}
}


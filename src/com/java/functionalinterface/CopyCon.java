package com.java.functionalinterface;

public class CopyCon {
    int id;
    String name;
    CopyCon(int i,String n){
        id=i;
        name=n;
    }
    CopyCon(CopyCon c){
        id=c.id;
        name=c.name;
    }
      public void display(){
          System.out.println("Id:  "+id+"  name: "+name);
      }
    public static void main(String[] args) {
        CopyCon c1=new CopyCon(1,"Aslam");
        CopyCon c2=new CopyCon(c1);
        c1.display();
      //  c2.display();

        CopyCon c3=new CopyCon(2,"Junaid");
        CopyCon c4=new CopyCon(c3);
        c3.display();
       // c4.display();


    }
}

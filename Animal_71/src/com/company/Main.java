package com.company;




public class Main {

    public static <T> void doSomething(T ... Class){

            for(int i=0;i<Class.length;i++){
                try{
                    boolean a=Class[i] instanceof Mammal;
                    if(!a){
                        throw new Exception("invalid class");
                    }
                    System.out.println("Valid class");
                }
                catch(Exception  e){
                    System.out.println("Error: "+e);
            }

        }

    }
    public static <T extends Animal> void printcanmove(T ... Class){
        for(int i=0;i<Class.length;i++){
            Class[i].canMove();
        }
    }
    public static void main(String[] args) {
	// write your code here
        Animal a=new Birds();
        Animal b=new Land();
        Animal c=new Insects();
        Animal d=new Oviporus();
        Animal e=new Mammal();
        Animal f=new Water();

        Oviporus x=new Birds();
        Oviporus y=new Insects();

        doSomething(a,b,c,d,e,f);
        printcanmove(a,b,c,d,e,f);
        printcanmove(x,y);

    }

}


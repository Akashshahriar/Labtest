package com.company;

public class Insects extends Oviporus {
    protected String name;
    Insects(){
        this.name=null;
        this.movability=true;
        this.color=null;
        this.no_of_legs=0;
    }
    Insects(String name,String color,int no_of_legs){
        this.name=name;
        this.color=color;
        this.no_of_legs=no_of_legs;
    }
    public void canMove(){
        if(movability){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

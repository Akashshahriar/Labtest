package com.company;

public class Animal {
    protected boolean movability;
    protected String color;
    protected int no_of_legs;

    Animal(){
        movability=true;
        color=null;
        no_of_legs=0;
    }
    Animal(boolean movability,String color,int no_of_legs){
        this.movability=movability;
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

package com.company;

public class Mammal extends Animal {
    Mammal(){
        movability=true;
        color=null;
        no_of_legs=0;
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

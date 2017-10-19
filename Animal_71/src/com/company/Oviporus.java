package com.company;

public class Oviporus extends Animal {
    Oviporus(){
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

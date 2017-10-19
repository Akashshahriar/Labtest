package com.company;

public class Water extends Mammal {
    Water(){
        this.movability=false;
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

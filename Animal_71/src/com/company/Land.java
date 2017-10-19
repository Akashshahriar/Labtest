package com.company;

public class Land extends Mammal {
    Land(){
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

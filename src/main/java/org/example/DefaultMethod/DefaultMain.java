package org.example.DefaultMethod;


public class DefaultMain implements InterfaceA, InterfaceB {

    public void printSomething() {
        //Option 1 -> Provide our own Implementation
        System.out.println("I am inside Main class");

        //Option 2 -> Use existing implementation from interfaceA or interfaceB or both.
        InterfaceA.super.printSomething();
        InterfaceB.super.printSomething();
    }
     public static void main(String[] args){
        DefaultMain main = new DefaultMain();
        main.printSomething();
     }

}
package com.company;

public class Main {

    public static void main (String[]args){
    }

    public String createObject(String Mercedes) {
        Mercedes mercedes = new Mercedes();
        BMW bmw = new BMW();
        Lexus lexus = new Lexus();
        System.out.println("__________________");
        Printable[] printables = {mercedes , bmw , lexus};
        for (Printable printable : printables) {
            System.out.println(((Car) printable).getName());
            printable.print();
        }
            return Mercedes;
    }
}

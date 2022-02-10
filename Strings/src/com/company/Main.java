package com.company;

public class Main {

    public static void main(String[] args) {
        String mystring = "hey";
        System.out.println(mystring);
        mystring = mystring + ",  How are you doing";
        System.out.println(mystring);
        mystring = mystring + " \u00A9 2019 ";
        System.out.println(mystring);

        String numberstring = "456.22";
        numberstring = numberstring + "89.6";
        System.out.println(numberstring);

        String laststring = "10";
        int myInt = 50;
        laststring=laststring+myInt;
        System.out.println(laststring);
    }

}
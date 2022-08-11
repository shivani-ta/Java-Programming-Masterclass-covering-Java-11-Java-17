package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double var = 20.00d ;
        double var1 = 80.00d;
        double sum = (var+var1)*100.00d;
        System.out.println(sum);
        double x = sum % 40.00d;
        System.out.println(x);
        boolean isNox = (x == 0) ? true : false;
        System.out.println(isNox);
        if(!isNox) {
            System.out.println("got some remainder");
        }


    }
}

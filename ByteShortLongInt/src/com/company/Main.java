package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myvalue= 10000;
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        System.out.println("int min value ="+a+"int max value ="+b);
        System.out.println("busted min value ="+(a-1)+"busted max value ="+(b+1));


        byte myMinByteValue =Byte.MIN_VALUE;
        byte myMaxByteValue=Byte.MAX_VALUE;
        System.out.println("byte min value="+myMinByteValue);
        System.out.println("byte max value="+myMaxByteValue);


        short myMinShortValue =Short.MIN_VALUE;
        short myMaxShortValue=Short.MAX_VALUE;
        System.out.println("Short min value="+myMinShortValue);
        System.out.println("Short max value="+myMaxShortValue);


        long myLongValue=100;
        long myMinLongValue =Long.MIN_VALUE;
        long myMaxLongValue=Long.MAX_VALUE;
        System.out.println("Long min value="+myMinLongValue);
        System.out.println("Long max value="+myMaxLongValue);

        long bigLongLiteralValue= 2147483647678L ;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue =32767;

        int myTOtal =(a/2);

        byte mytotal1 =(byte)(myMinByteValue/2);
        short myTOtal3 =(short)(myMinShortValue/2);

        long myTOtal2 =(myMaxLongValue/2);

       




    }
}

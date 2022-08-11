package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1+2;//3
        System.out.println("1+2="+result);
        int previousresult = result;
        System.out.println("previousresult=    "+previousresult);
        result = result -1;
        System.out.println("3-1=  "+result);
        System.out.println("previousresult=   "+previousresult);


        result =  result*10;
        System.out.println("2*10=  "+result);

        result =  result/5;
        System.out.println("20/5=  "+result);

        result =  result%3;
        System.out.println("4/3=  "+result);

        //result=result+1;
        result++;
        System.out.println("1+1 ="+result);

        result--;
        System.out.println("2-1 ="+result);

        result+= 2;
        System.out.println("1+2 ="+result);

        result*= 10;
        System.out.println("3+10 ="+result);

        result/= 3;
        System.out.println("30/3 ="+result);

        result=result- 2;
        System.out.println("10-2 ="+result);

      boolean isAlien=false;
      if(isAlien==true) {
          System.out.println("it is not alien");
          System.out.println("and i am scared of aliens");
      }
      int topScore = 80;
      if(topScore <= 100){
          System.out.println("you got the high score!");
      }
      int secondTopScore = 81;
      if(topScore>secondTopScore  &&  topScore<100){
          System.out.println("greater than second top score and less than 100");
      }
      if((topScore>90 )||(secondTopScore<=90)){
            System.out.println("either or both the conditions are true");

      }
      int newValue = 50;
      if (newValue==50){
            System.out.println("This is true");
        }
      boolean isCar = false;
      if(isCar ){
          System.out.println("this is not supposed to happen ");
      }

    isCar = true;
      boolean wasCar = isCar? true : false;
      if(wasCar){
          System.out.println("wascar is true");
      }
      double  test = 20.00d;
      double test1 = 80.00d;
     double  cal = (test+test1)*100.00d;
        System.out.println(cal);
     double rem = cal%40.00d;
        System.out.println("remainder =  "+rem);
       boolean isRem= (rem == 0)? true: false;
        System.out.println(isRem);
        if(!isRem){
            System.out.println("got some remainder");
        }
    }
}

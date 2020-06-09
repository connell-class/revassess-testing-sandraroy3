package com.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		long number = num, originalNumber, remainder, result = 0; //num=153
        originalNumber = number;                                  //orinalNumber=number=153

        while (number != 0)
        {
            remainder = number % 10;                    // rem=3             //rem=5     //rem=1
            result += Math.pow(remainder, 3);           // result= 3^3=27    //27+125    //152+1
            number /= 10;                               // number= 15        //1         //0
        }

        if(result == originalNumber)                    //153=153
           return true;
        else
           return false;

	}
}

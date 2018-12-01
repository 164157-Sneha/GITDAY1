package com.sneha.ds;

public class ArmStrong1 {

int remainder,result;
	
	void Arms(int number){
		
		int temp = number;
		while (number != 0)
        {
            remainder = number % 10;
            number /= 10;
            result = result + (remainder*remainder*remainder);
        }

        if(temp == result)
            System.out.println(result + " is an Armstrong number.");
        else
            System.out.println(result + " is not an Armstrong number.");
    }

}

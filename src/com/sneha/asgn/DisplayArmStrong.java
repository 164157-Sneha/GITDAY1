package com.sneha.ds;

public class DisplayArmStrong {

    int n, i;
    int count=0,a, b, c, sum=0;
    
 void MyDisp(){
    for(i = 100; i <= 999; i++)
    {
        n = i;
        while(n > 0)
        {
            b = n % 10;
            sum = sum + (b * b * b);
            n = n / 10;
        }
        if(sum == i)
        {
            System.out.print(i+" ");
        }
        sum = 0;
}
}   
}
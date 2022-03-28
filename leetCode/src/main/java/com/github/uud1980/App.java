package com.github.uud1980;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int [] arr = {2, 5, 5, 11};
        
        System.out.print(twoSums.twoSumsBruteForce(arr,  10)[0]);
        System.out.print(twoSums.twoSumsBruteForce(arr,  10)[1]);
        
    }
}

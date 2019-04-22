package com.qa.medium;


import java.util.ArrayList;
import java.util.Arrays;

public class SortedSquare {
public static int[] sortedSquares(int[] A) {
        
        for(int i=0; i< A.length;i++){
            A[i]= A[i]*A[i];
        }
        
        Arrays.sort(A);
        return A;
    }

	public static void main(String[] args) {
		
		int[] a = {-4, -1, 0, 10 ,5};
		int[] a1  = sortedSquares(a);
		
		for(int i = 0; i < a1.length; i++){
			System.out.print(a1[i]+" ");
		}
		
		

	}

}

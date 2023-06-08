import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
		int len = permutation.size();
		if(len ==0){
			return null;
		}
		int i = len - 2;
		while(i >= 0 && permutation.get(i) >= permutation.get(i+1) ) i--;
		if(i>=0){
			int j = len -1;
			while(permutation.get(j) <= permutation.get(i))
			j--;
			swap(permutation,i,j);
		}
			reverse(permutation,i+1,permutation.size()-1);
			
			return permutation;
	}

	public static void swap(ArrayList<Integer> permutation , int i , int j){
		Collections.swap(permutation,i,j);

	}

	public static void reverse(ArrayList<Integer> permutation , int i , int j){
		while(i<j) 
		swap(permutation , i++ ,j--);
	}
}

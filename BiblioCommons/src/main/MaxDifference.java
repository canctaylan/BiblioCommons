package main;

import java.util.ArrayList;
import java.util.List;

public class MaxDifference {
	
	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(9);
		a.add(8);
		a.add(7);
		a.add(5);
		
		System.out.println(maxDifference(a));
	}
	

	public static int maxDifference(List<Integer> arr) {
	    // Write your code here
	    int minimum,difference = -1;
	    if(arr.size()==0)
	        return -1;

	    minimum = arr.get(0);
	    
	    for(int i=0;i<arr.size();i++)
	    {
	    	if(minimum!=arr.get(i))
	    	{
	        difference = Math.max(difference,arr.get(i)-minimum);
	        minimum = Math.min(minimum,arr.get(i));
	    	}
	    }    
	    return difference;

	    }

}

<<<<<<< HEAD
package com.tier1;
import java.lang.*;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		//int length=arr.length;
		int sum=0,i;
		if(arr==null)
			return 0;
		
		for(i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
//		for(int num:arr) {
//			sum=sum+num;
//		}
		
//		if(sum<0)
//		  sum=-sum;
		Math.abs(sum);
		return Math.abs(sum);
	}
}
=======
package com.tier1;
import java.lang.*;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		//int length=arr.length;
		int sum=0,i;
		if(arr==null)
			return 0;
		
		for(i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
//		for(int num:arr) {
//			sum=sum+num;
//		}
		
//		if(sum<0)
//		  sum=-sum;
		Math.abs(sum);
		return Math.abs(sum);
	}
}
>>>>>>> 5cad087cd576c8631dff7475b3c02f2dd3840c7e

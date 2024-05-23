package com.dxc.PracticePrograms;

public class MinimumElement{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int[] arr=new int[] {5,2,8,7,1};
				int temp=0;
		     	System.out.println("Array elements are:");
				for(int i=0;i<arr.length;i++)
					{
					System.out.print(arr[i]+" ");
				}
				int max=arr[0];
				for(int i=0;i<arr.length;i++)
				{
				  if(max>arr[i])
				  {
					  max=arr[i];
					  
				  }
			    }
				System.out.println();
				
				System.out.println("The manimum element is:"+max);
				
				

	}

}

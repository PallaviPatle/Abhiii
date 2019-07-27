package ArrayHomework;

public class ArrengeAssending {
	public static void main(String[] args) {
		int temp=0;
		int arr[]={20,30,10,50,40};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
	
	  System.out.println("Elements of array sorted in ascending order: ");  
      for (int i = 0; i < arr.length; i++) {   
          System.out.print(arr[i] + " ");
}
}
}
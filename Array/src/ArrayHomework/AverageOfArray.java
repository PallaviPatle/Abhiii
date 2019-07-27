package ArrayHomework;

public class AverageOfArray {
	public static void main(String[] args) {
		int sum=0,ave=0;
		
		int arr[]={20,30,40,10,50};
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			ave=sum/arr.length;
		}
		System.out.println("Average is:"+ave);
	}

}


public class Array5 {
	public static void main(String[] args) {
		int arr[]={60,40,70,50,25};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Min of array="+min);
	}

}

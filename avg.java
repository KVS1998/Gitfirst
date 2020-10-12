package array;

public class avg {

	public static void main(String[] args) {
		double arr[]= {10,20,30,40,50};
		double total=0;
		for(int i=0;i<arr.length;i++)
		{
			total = total + arr[i];
		}
        double average = total/arr.length;
        System.out.println("average is: " +average);
	}

}
//ok

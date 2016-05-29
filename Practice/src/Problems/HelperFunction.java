package Problems;

public class HelperFunction {
	 public static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	 public static void printPartialArray(int arr[],int l, int r){
		 for(int i = l;i<=r;i++){
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println();
	 }
	 public static void swapArray(int arr[],int id1,int id2){
		 int val1 = arr[id1];
		 int val2 = arr[id2];
		 arr[id2] = val1;
		 arr[id1] = val2;
	 }
}

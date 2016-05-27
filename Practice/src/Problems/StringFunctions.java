package Problems;

public class StringFunctions {

	public static int binarySearch(int[] arr,int query){
		int[] arrs = arr.clone();
		int N = arrs.length;
		int s = 0;
		int f = N-1;
		int idx = -1;;
		
		while(f-1>s){
			idx = (int) (f+s)/2;
			if(arrs[idx] == query) return idx;
			
			if(arrs[idx]>query){
				f = idx;
			}
			else{
				s = idx;
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,5,5,5,5,6,7,8,9,10,12};
		long startTime = System.nanoTime();
		
		int id = binarySearch(a,7);
		
		long endTime = System.nanoTime();
		long duration  = (endTime - startTime)/1000;
		System.out.println("That took " +  duration + " time units");
	}
}

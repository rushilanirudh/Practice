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

	public static void mergeRoutine(int[] arr, int l, int m, int r){

		int n1 = m - l + 1;
		int n2 = r - m;

		int[] L = new int[n1];
		int[] R = new int[n2];


		int k = l;

		/*Copy data to temp arrays*/
		for (int i=0; i<n1; ++i)
			L[i] = arr[l + i];
		for (int j=0; j<n2; ++j)
			R[j] = arr[m + 1+ j];


		int i = 0; 
		int j = 0;

		while(i<n1 && j<n2){
			if(L[i]<=R[j]){
				arr[k] = R[i];
				i++;
			}
			else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while(i<n1){
			arr[k] = L[i];
			k++;
			i++;
		}
		while(j<n2){
			arr[k] = R[j];
			k++;
			j++;
		}

	}

	public static void mergeSort(int[] arr,int l, int r){
		if(l<r){
			int m = (l+r)/2;
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,r);
			mergeRoutine(arr,l,m,r);
		}

	}

	public static void quickSort(int[] arr,int l, int r){

	}
	public static int partitionRoutine(int[] arr, int low, int high){
		int pivot = arr[high];
		int i = low;
		
		for(int j = low;j<high;j++){
			if(arr[j]<=pivot){
				HelperFunction.swapArray(arr, i, j);
				i++;
			}
			
		}
		
		HelperFunction.swapArray(arr, i, high);
		
		return i;
	}
	public static void main(String[] args){
		int[] a = {5,4,3,2,1,0,-1};
		int l = 0;
		int r = a.length-1;
		int m = (l+r)/2;
		long startTime = System.nanoTime();
		////////////////////////////////////////////////////

		//int id = binarySearch(a,7);
		//mergeRoutine(a,l,m,r);
		//mergeSort(a,l,r);
		int pivotID = partitionRoutine(a,0,a.length-1);
		System.out.println(pivotID);
		//HelperFunction.printArray(a);
		///////////////////////////////////////////////////		
		long endTime = System.nanoTime();
		long duration  = (endTime - startTime)/1000;
		System.out.println("Time: " +  duration + " units");
	}
}

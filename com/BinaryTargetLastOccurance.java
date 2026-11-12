package main.dsa.com;

public class BinaryTargetLastOccurance {



	public static int firstoccurance(int arr[], int target) {		
		int low=0;
		int high=arr.length-1;
		int occurplace=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) {
			    low=mid+1;
			    occurplace=mid;
			}else if(arr[mid]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return occurplace;
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		int[] arr= {1,2,2,2,3,5};
		int target=2;
		int result=firstoccurance(arr,target);
		System.out.println(result);
	}

}

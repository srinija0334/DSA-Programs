package main.dsa.com;

public class BinaryTragetInsertPosition {
	public static int searchInsert(int[] arr,int target) {
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]>=target) {
				ans=mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
			
		}
		return ans;
	}
public static void main(String[] args) {
	int[] arr= {1,3,4,5};
	int target=2;
	int result=searchInsert(arr,target);
	System.out.println("insert position:"+result);
}
}

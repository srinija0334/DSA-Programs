package main.dsa.com;

public class FloorNumber {
	public static int floor(int[] arr,int target) {
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]<=target) {
				ans=arr[mid];
				low=mid+1;
				
				
			}else {
				high=mid-1;
			}
		}return ans;
	}
		public static void main(String[] args) {
			int[] arr= {2,4,6,8,10};
			int target=9;
			int result=floor(arr,target);
			if(result!=-1) {
				System.out.println("found: "+result);
			}else {
				System.out.println("not found");
			}
			
		
	}

}

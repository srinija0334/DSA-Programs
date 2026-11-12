package main.dsa.com;

public class BinarySearchProgram {
	
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int target=50;
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				System.out.println("found: "+mid);
				return;
				
			}else if(target<arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		System.out.println("not found");
	
	}	
	
	


//	public static void main(String[] args) {
//		int[] binary= {10,20,30,40,50};
//		int target=50;
//		int low=0;
//		int high=binary.length-1;
//		int mid=(low+high)/2;
//		for(int i=0;i<binary.length;i++) {
//			if(mid==target) {
//				target=mid;
//				break;
//			}else if(mid>target){
//				low=mid+1;
//				mid=(low+high)/2;
//				if(mid==target) {
//					target=mid;
//				}
//				
//			}
//			
//		}
//	}

}

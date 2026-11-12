package main.dsa.com;
//
//public class LinearFirstEvenNumber {
//
//	public static void main(String[] args) {
//		int[] arr= {7,8,3,6,9};
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==0) {
//				System.out.println("found"+" "+arr[i]);
//				break;
//			}
//		}
//		
//
//	}
//
//}





import java.util.Scanner;
class LinearFirstEvenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
          boolean found=false;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
            
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(i+ " "+arr[i]);
                found=true;
                break;
            }
        }
       System.out.println(found==true?"value found":"value not found");
       
    }
}
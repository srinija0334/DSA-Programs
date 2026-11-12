package main.dsa.com;

public class BinaryStringTarget {

	public static void main(String[] args) {
		String[] names = {"hhh", "nnn", "ppp", "uuu"};
		String target="ppp";
		int low=0;
		int high=names.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			int compare=names[mid].compareTo(target);
			if(compare==0) {
				System.out.println("found: "+mid);
				return;
				
			}else if(compare>0) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		System.out.println("not found");
	
	}	
	
		// TODO Auto-generated method stub

	
	}

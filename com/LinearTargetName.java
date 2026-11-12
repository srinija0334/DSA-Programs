package main.dsa.com;

import java.util.Scanner;
class LinearTargetName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] names={"ooo","ppp","uuu","ttt"};
        String target="ttt";
        int index=-1;
        boolean found=false;
        for(int i=0;i<names.length;i++){
            if(names[i].equals(target)){
                index=i;
                found=true;
                break;
            }
        }
        System.out.println(found?index:"not found");







    }}





















//public class LinearTargetName {
//
//	public static void main(String[] args) {
//		String[] names= {"bahu","kali","iiii","uuu"};
//		String target="kali";
//		boolean found=false;
//		for(String name:names) {
//			if(name.equals(target)) {
//				found=true;
//				break;
//			}
//			
//		}
//		System.out.println(found?"present":"absent");
//	
//
//	}
//
//}

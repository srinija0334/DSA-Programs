package main.dsa.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearTargetInArraylist {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("pen","pencil","kkk","pppp");
		String target="pencil";
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals(target)) {
				System.out.println("found index :"+i+" "+list.get(i));
				return;
			}
		}
		System.out.println("not found");
		

	}

}

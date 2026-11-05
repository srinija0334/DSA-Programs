package com.java.dsa;

public class DuplicateElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20};

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                System.out.println("Duplicate: " + arr[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicate elements");
        }
    }
}
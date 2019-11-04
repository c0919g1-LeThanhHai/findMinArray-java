package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhập vào kích thước mảng: ");
            size = scanner.nextInt();
        } while(size > 20);
        findMin(createArray(size));
    }

    public static int[] createArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào phần tử thứ %d: ", (i + 1));
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void findMin(int[] arr) {
        int min = arr[0];
        for(int item: arr) {
            if(item < min) {
                min = item;
            }
        }
        System.out.printf("Số nhỏ nhất trong mảng là %d", min);
    }
}

package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp số muốn thêm vào mảng: ");
        int number = scanner.nextInt();
        System.out.println("Nhập vị trí muốn thêm vào mảng");
        int index = scanner.nextInt();


        if (index >= 0 && index <= arr.length - 1) {
            int[] newArr = themPhanTu(arr, index, number);
            System.out.println("Mảng sau khi chèn số " + number + " là: " + "\t");
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + "\t");
            }
        } else {
            System.out.println("Không chèn được số " + number + " vào mảng tại vị trí " + index);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
        }
    }

    public static int[] themPhanTu(int[] array, int index, int num) {
        int newArray[] = new int[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = num;
        for (int j = index + 1; j <= array.length; j++) {
            newArray[j] = array[j - 1];
        }
        return newArray;
    }
}

package vigen_hovhannisyan.arrays;
import java.io.*;

public class Array {
        /*
        todo# find maximum value in array
         */;
    public void maximumArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > min) {
                    min = arr[i];

                }
            }

        }
        System.out.println(min);
    }

    /*
    todo# find minimum element in array
     */
    public void minimum(int[]min){
        int minimum = min[0];
        for (int i = 0; i < min.length; i++) {
            if (min[i]<minimum){
                minimum=min[i];
            }
        }
        System.out.println(minimum);
    }

    /*
    todo# sort elements in array to odd and even
     */

    public void sortOddAndEven(int[]ints) {
        for (int i = 0; i < ints.length; i ++) {
            for (int j = 0; j < i; j ++) {
                if (ints[i] % 2 == 1 && ints[j] % 2 != 1||ints[i] % 2 != 1 && ints[j] % 2 == 1) {
                    swap(ints, i, j + 1);
                }
            }
        }
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }

    public void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

}

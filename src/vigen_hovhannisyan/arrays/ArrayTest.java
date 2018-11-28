package vigen_hovhannisyan.arrays;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArrayTest implements Serializable {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 6, 8, 9, 13, 12, 22, 24, 77, 75, 99};
        Array array = new Array();
        array.maximumArray(arr);
        array.minimum(arr);
        array.sortOddAndEven(arr);

        }

    }


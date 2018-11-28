package vigen_hovhannisyan.wordReverse;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input word:if your word will be readable your result have be true");
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        String str1 = "";
        for (int i = chars.length-1; i>=0; i--) {
            str1+=chars[i];
            if (str1.equals(str)){
                System.out.println(true);
            }
        }
        if (!str1.equals(str)){
            System.out.println(false);
        }




    }
}

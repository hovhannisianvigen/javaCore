package vigen_hovhannisyan.boobleSort;

public class Main {

    public static void main(String[] args) {
        int[]ints = {1,2,5,4,7,9,8,6,3,11,13,12,10,15,16,14,17};
        int temp=0;
        for (int i = ints.length-1; i>=0; i--) {
            for (int j = 0; j < i; j++) {
                if (ints[j]<ints[j+1]){
                    temp = ints[j];
                    ints[j]=ints[j+1];
                    ints[j+1]=temp;
                }

            }
        }
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

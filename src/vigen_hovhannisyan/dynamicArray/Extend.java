package vigen_hovhannisyan.dynamicArray;

public class Extend {

   private static int[]ints = new int[1];

   public void addValue(int value){
       int size = 0;
       if (size==ints.length){
           extend();
       }
       ints[size]=value;
       size++;
       print(ints);
   }

   private void extend(){
       int[]temp = new int[ints.length+1];
       for (int i = 0; i < ints.length; i++) {
           temp[i]=ints[i];
       }
       ints=temp;
   }

   private void print(int[] arr){
       for (int i : arr) {
           System.out.println(i);
       }
   }
}

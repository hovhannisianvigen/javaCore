package vigen_hovhannisyan.figure_pointer;

public class FigurePointer {

    /*
    todo# point this triangle
    *
    * *
    * * *
    * * * *

     */

    public void triangleOne(int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    /*
    todo# point this triangle
                  *
                * *
              * * *
            * * * *
     */
    public void triangleTwo(int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 4; j >= 4 - i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    /*
    todo# point this triangle
      * * * *
      * * *
      * *
      *

     */
    public void triangleTree(int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    todo# point this triangle
        * * * *
          * * *
            * *
              *

     */
    public void triangleFor(int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = count-i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    todo# point this triangle
        *
       * *
      * * *
       * *
        *
     */

    public void triangleFive(int count) {
        for (int i = count; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < count-i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = count-i; j >0 ; j--) {
                System.out.print(" *");
            }
            System.out.println();

        }

    }



    }


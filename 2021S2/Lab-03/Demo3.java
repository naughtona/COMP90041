/*
 * For loop
 */

public class Demo3 {

    public static void main(String[] args) {
        int i = 0;
        for (; i < 5; ++i) {
            System.out.println(i);
        }

        System.out.println(i);
        
        // equivalently:
        // int i = 0;
        // while (i < 5) {
        //     System.out.println(i);
        //     ++i;
        // }
        // System.out.println(i);
    }

}

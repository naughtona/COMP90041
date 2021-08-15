/*
 * use-case and benefit of while 
 */

public class Demo4 {

    public static void main(String[] args) {
        int x = 10, nIterations = 0;

        while (x > 0) {
            if (Math.random() > 0.2) {
                --x;
            }
            ++nIterations;
        }

        System.out.println(nIterations);
    }

}

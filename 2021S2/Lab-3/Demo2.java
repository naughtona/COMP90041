/*
 * switch quiz
 */

public class Demo2 {

    public static void main(String[] args) {
        // cast input to int
        int n = Integer.parseInt(args[0]);        
        
        // call method and store returned value in `result`
        String result = customTestMethod(n);

        // print result
        System.out.println(result);
    }

    static String customTestMethod(int n) {
        String r = "None";

        switch (n) {
            case 1:
                r = "one";
            case 2:
                r = "two";
            case 3:
                r = "three";
        }

        return r;
    }

}

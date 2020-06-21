/*
Explanation: In switch I gave an expression,
you can give variable also. I gave num+2, where num value is 2 and after addition the expression resulted 4.
Since there is no case defined with value 4 the default case got executed.
This is why we should use default in switch case, so that if there is no catch that matches the condition,
the default block gets executed.
 */

public class SwitchSimple {

    public static void main(String[] args) {

        int num = 2;
        switch(num + 2) {

            case 1:
                System.out.println("case1: Value is: " + num);
            case 2:
                System.out.println("case2: Value is: " + num);
            case 3:
                System.out.println("case3: Value is: " + num);
            default:
                System.out.println("Value is: " + num);

        }

    }

}

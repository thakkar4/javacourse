/*
Note: The most important point to note here is that in if-else-if statement,
as soon as the condition is met,
the corresponding set of statements get executed,
rest gets ignored.
If none of the condition is met then the statements inside “else” gets executed.
 */

public class IfElseIfStatement {

    public static void main(String[] args) {

        int num = 1234;

        if (num < 100 && num >= 1) {
            System.out.println("its a two digit number");
        } else if (num < 1000 && num >= 100) {
            System.out.println("its a three digit number");
        } else if (num < 10000 && num >= 1000) {
            System.out.println("its a four digit number");
        } else if (num < 100000 && num >= 10000) {
            System.out.println("its a five digit number");
        }
        else {
            System.out.println(" number is not bettween 1 & 99999");
        }
    }

}

public class IfStatement {

    public static void main(String[] args) {

        int num = 70;
   /*     if(num < 100) {

            System.out.println("Number is less than 100");
        } */


        // NESTED IF STATEMENTS//  ** The first condition has to be a true


         if(num < 100) {

            System.out.println("number is less than 100");

            if (num > 50) {

                System.out.println("number is greater than 50");

                if (num == 70) {

                    System.out.println("number is equal to 70");
                }
            }
        }



    }
}

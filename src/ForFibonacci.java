public class ForFibonacci {

    public static void main(String[] args) {


        int count = 7 , num1 = 0,  num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers: ");


        for (int i=1; i<=count; i=i+1) {
            System.out.print(num1+ " ");

            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;

        }

    }

}

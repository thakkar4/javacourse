public class WhileFibonacci {
    public static void main(String[] args) {
        int count = 7, num1=0, num2=1;

        int i=1;
        while (i<=count) {

            System.out.print(num1+" ");
          int sum = num1+num2;
          num1 = num2;
          num2 = sum;
            i++;
        }
    }
}

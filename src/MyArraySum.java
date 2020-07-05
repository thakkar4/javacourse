public class MyArraySum {
    public static void main(String[] args) {
        int bucky [] = {4, 6, 8 , 12};
        int sum = 0;
        for(int counter=0; counter<bucky.length; counter++) {
            sum = sum + bucky[counter];
          /*  System.out.println("sum is: "+ sum); */
        }
        System.out.println("sum is: "+ sum);
    }
}

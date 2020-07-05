public class VariableLengthArguments {
    public static void main(String[] args) {

        System.out.println(average(40, 50, 60, 80));

    }

    public static int average(int... numbers) {
        int total = 0;
        for (int x : numbers)
            total = total + x;
            return total / numbers.length;
        }
    }




public class ConstParameterized {
    private int var;

    // default constructor

    ConstParameterized() {
        this.var = 10;
    }

    ConstParameterized(int num) {
        this.var = num;
    }

    public static void main(String[] args) {
        ConstParameterized obj = new ConstParameterized();
        ConstParameterized obj1 = new ConstParameterized(200);
        System.out.println("num: "+obj.var);
        System.out.println("num "+obj1.var);
    }
}

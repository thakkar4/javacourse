public class MyArray {
    public static void main(String[] args) {
        String Thakkar [] = new String[10];
        Thakkar[0] = "Hitesh";
        Thakkar[1] = "Bhavina";
        Thakkar[2] = "Aadi";
        Thakkar[3] = "Ragunath";
        Thakkar[4] = "Chandrika";
        Thakkar[5] = "Hema";
        Thakkar[6] = "Hina";
        Thakkar[7] = "Sonal";
        System.out.println(Thakkar.length);
        System.out.println(Thakkar[3]);

        for(int counter=0; counter<Thakkar.length; counter++){
            System.out.println(Thakkar[counter]);
        }


      /*  int Number[] = {2,4,5,7,9};   // Array initializer - Do not have to do as above
        System.out.println(Number[3]);  */
    }
}

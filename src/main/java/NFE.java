import static java.lang.Integer.parseInt;

public class NFE {
    // null format Exception
    public static void main(String[] args) {
        //String str = "Ankit";
        String str ="1234454";
        // string convert into integer
        try {
            int a = Integer.parseInt(str);
            System.out.println(a);
            //System.out.println("NUmber format exception");
        } catch (NumberFormatException n) {

            System.out.println("String " + str + " can't be converted into integer");
        }
        System.out.println("Main method ended");
    }
}

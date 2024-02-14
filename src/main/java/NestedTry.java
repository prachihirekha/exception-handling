public class NestedTry {
    public static void main(String[] args) {
        try{
            try{
                int a[] = {10,223,34,56};
                System.out.println(a[7]);
            }catch (ArrayIndexOutOfBoundsException a ){
                System.out.println(a);
            }
            int a =10;
            int b =0;
            int c=a/b;
            System.out.println(c);
        }catch (ArithmeticException ar){
            System.out.println(ar);
        }
        System.out.println("method ended");
    }
}

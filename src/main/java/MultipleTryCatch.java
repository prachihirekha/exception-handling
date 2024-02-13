public class MultipleTryCatch {
    public static void main(String[] args) {
        try{
           int a =10,b=2,c;
           c=a/b;
            System.out.println("division method "+c);
        }catch(ArithmeticException e){
            System.out.println("can't divided by 0");
        }
        try{
            int a[] ={10,20,30,40};
            System.out.println("For Array "+a[1]);

        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Array out of bound");
        }
    }
}

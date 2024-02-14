public class TestByThrow {
    void  div(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }else {
            int c =a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args)throws ArithmeticException {
        TestByThrow ts = new TestByThrow();
       // try{
            ts.div(20,0);
      //  }catch (Exception e){
         //   System.out.println("The Value of b is zero");
       // }
    }
}

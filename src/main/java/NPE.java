public class NPE {
    // full form of NPE null pointer exception
    public static void main(String[] args) {
        //string s =null;
        String s ="null";
     try{
         System.out.println(s.toUpperCase());
     }catch (NullPointerException e){
         System.out.println("null can't be casted");
     }
    }
}

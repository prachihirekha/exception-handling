public class NestedCatch {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (Exception e){
        try{
            String str = "null";
            System.out.println(str.toUpperCase());
        }catch (NullPointerException ne){
            System.out.println("null value can't change");
        }
            System.out.println(e);
        }
        System.out.println("main method is ended");
    }
}

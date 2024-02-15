class DifferentTCT {
    // different between try catch and throws
    public static void raja() throws InterruptedException{
        for(int i=0;i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args)  {
        //DifferentTCT t = new DifferentTCT();
        // if we want to handel the exception than use try catch block
        try{
            raja();
            System.out.println(10/0);
        }catch (Exception e ){
            System.out.println("Exception handled !");
        }
        System.out.println("main method ended");
    }
}

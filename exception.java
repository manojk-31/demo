public class exception{


 public static void main(String[] args) {

    int a =10;
    int b = 0;
    try{
        int result = a/b;
    }
    catch(Exception e){
        System.out.println("It is an error");
    }
    finally{
        System.out.println("Exception handled");
    }
}

}

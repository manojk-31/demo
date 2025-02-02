
public class Nullpointer{
    public static void main(String[] args) {
        
        try {
            String str = null;
            System.out.println(str.length()); 
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        } finally {
            System.out.println("Finally block for NullPointerException executed");
        }

        
        System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException");
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        } finally {
            System.out.println("Finally block for ArrayIndexOutOfBoundsException executed");
        }
    }
}

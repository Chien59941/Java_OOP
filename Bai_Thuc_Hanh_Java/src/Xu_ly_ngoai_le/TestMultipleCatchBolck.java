package Xu_ly_ngoai_le;

public class TestMultipleCatchBolck {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30/0;

        } catch(ArithmeticException e) {
            System.out.println("task1 is completed");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("task2 completed");
        } catch(Exception e) {
            System.out.println("Common task completed");
        }
        System.out.println("rest of the code ...");
    }
}

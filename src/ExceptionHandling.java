public class ExceptionHandling {

    public static void main(String[] args) {
        System.out.println(nestedTryCatchFinallyReturn());
    }

    public static String nestedTryCatchFinallyReturn() {

        int[] arr = {1, 2, 3, 4};

        try {
            int x = arr[4];
        } catch (Exception e) {
            return "returned from catch block";
        } finally {
            return "returned from finall block";
        }
    }
}

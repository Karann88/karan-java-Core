public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896 };
        int ans = findNumbers(arr);
        System.out.println(ans);
    }

    private static int findNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            // int n = arr[i];
            int countDigits = 0;
            while (arr[i] != 0) {
                arr[i] = arr[i] / 10;
                countDigits++;
            }
            if (countDigits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

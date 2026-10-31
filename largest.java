public class largest {
    public static int max(int[] m) {
        int n = m.length;
        int catalyst = m[0];
        for (int i = 1; i < n; i++) {
            if (catalyst < m[i]) {
                catalyst = m[i];
            }
        }
        return catalyst;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        int num = max(numbers);
        System.out.println("The largest number in the array is " + num);
    }
}
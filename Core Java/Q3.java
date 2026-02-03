public class Q3 {
    public static void main(String[] args) {
        int numbers[] = { 45, 22, 89, 16, 90, 33 };
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // USING ENHANCED FOR LOOP

        // for (int i : numbers) {
        //     if (i < min) {
        //         min = i;
        //     }
        //     if (i > max) {
        //         max = i;
        //     }
        // }

        System.out.println("Smallest:" + min);
        System.out.println("Largest:" + max);

    }
}

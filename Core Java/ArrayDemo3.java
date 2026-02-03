import java.util.Scanner;
//JAGGED ARRAY
public class ArrayDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1, size2;
        System.out.println("Enter number of rows:-");
        size1 = sc.nextInt();
        int nums[][] = new int[size1][];

        for (int i = 0; i < size1; i++) {
            System.out.println("Enter the size of row " + (i + 1));
            size2 = sc.nextInt();
            nums[i] = new int[size2];

            System.out.println("Enter " + size2 + " elements for row " + (i + 1));
            for (int j = 0; j < size2; j++)
                nums[i][j] = sc.nextInt();
        }
        System.out.println("OUTPUT:-");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}
import java.util.Scanner;

public class TinhTrungBinhCong {
    public static void main(String[] args) {
        final int n = 5;
        float avg;

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
            sum += array[i];
        }

        avg = (float) sum / array.length;

        System.out.println("trung bình cộng là: " + avg);
    }
}

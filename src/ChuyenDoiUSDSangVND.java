import java.util.Scanner;

public class ChuyenDoiUSDSangVND {
    public static void main(String[] args) {
        final int VND = 23500;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap gia tri USD: ");
        var USD =  Float.parseFloat(scanner.nextLine());

        var change =  USD * VND;

        System.out.println(String.format("%.2f",USD) + " USD = " + String.format("%.0f",change) + " VND");
    }
}

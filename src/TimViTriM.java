import java.util.Scanner;

public class TimViTriM {
    public static void main(String[] args) {
        float xC, yC, R, xM, yM;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hoành độ tâm C: ");
        xC = Float.parseFloat(scanner.nextLine());

        System.out.print("Nhập tung độ tâm C: ");
        yC = Float.parseFloat(scanner.nextLine());

        System.out.print("Nhập bán kình đường tròn: ");
        R = Float.parseFloat(scanner.nextLine());

        System.out.print("Nhập hoành độ điểm M: ");
        xM = Float.parseFloat(scanner.nextLine());

        System.out.print("Nhập tung độ điểm M: ");
        yM = Float.parseFloat(scanner.nextLine());

        float d = (float) Math.sqrt((Math.pow((xM - xC),2)) + (Math.pow((yM - yC),2)));

        if(d < R){
            System.out.println("M nằm trong đường tròn");
        } else if (d > R) {
            System.out.println("M nằm ngoài đường tròn");
        }else {
            System.out.println("M nằm trên đường tròn");
        }
    }
}

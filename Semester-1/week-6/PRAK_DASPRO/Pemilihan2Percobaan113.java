import java.util.Scanner;

public class Pemilihan2Percobaan113 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        int tahun = input13.nextInt();
        if ((tahun % 2) == 0) {
            if ((tahun % 100) != 0)
                System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
        input13.close();
    }
}
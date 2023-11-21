public class Ambatuloli {

    public static void main(String[] args) {

        int hasil;
        hasil = 0;
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                hasil = j + hasil;
            }
        }
        System.out.println("Total => " + hasil);
    }
}

import java.util.Scanner;
public class BioskopWithScanner19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris = 0, kolom = 0;
        String nama, text;
        String [][]penonton = new String [4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();


            penonton[baris-1][kolom-1] = nama;
            sc.nextLine();

            System.out.print("Input penonton lainnya? (y/n): ");
            text = sc.nextLine();

            if (text.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
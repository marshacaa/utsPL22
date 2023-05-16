import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PenomoranUnik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inputkan 20 macam angka dengan spasi :");
        String input = scanner.nextLine();

        String[] listAngka = input.split(" ");
        if (listAngka.length != 20) {
            System.out.println("Input harus terdiri dari 20 macam angka.");
            return;
        }

        boolean duplikat = cekDuplikat(listAngka);

        System.out.println("Output: " + duplikat);
    }

    private static boolean cekDuplikat(String[] listAngka) {
        Set<String> penomoranUnik = new HashSet<>();

        for (String angka : listAngka) {
            if (penomoranUnik.contains(angka)) {
                return true;
            }
            penomoranUnik.add(angka);
        }

        return false;
    }
}

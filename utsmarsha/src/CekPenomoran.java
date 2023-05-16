import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CekPenomoran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inputkan 20 angka dengan spasi :");
        String input = scanner.nextLine();

        String[] listAngka = input.split(" ");
        if (listAngka.length != 20) {
            System.out.println("Input harus terdiri dari 20 angka.");
            return;
        }

        Map<String, Integer> daftarAngka = hitungAngkaUnik(listAngka);
        tampilkanDaftarAngka(daftarAngka);
    }

    private static Map<String, Integer> hitungAngkaUnik(String[] listAngka) {
        Map<String, Integer> daftarAngka = new HashMap<>();

        for (String angka : listAngka) {
            if (daftarAngka.containsKey(angka)) {
                int jumlah = daftarAngka.get(angka);
                daftarAngka.put(angka, jumlah + 1);
            } else {
                daftarAngka.put(angka, 1);
            }
        }

        return daftarAngka;
    }

    private static void tampilkanDaftarAngka(Map<String, Integer> daftarAngka) {
        System.out.println("Output:");
        for (Map.Entry<String, Integer> entry : daftarAngka.entrySet()) {
            System.out.println(entry.getKey() + " ada " + entry.getValue());
        }
    }
}


import java.util.Scanner;

public class Deret {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Input jumlah bilangan 
        int jumlahBilangan = scanner.nextInt();
        
        // Input angka awal
        int angkaAwal = scanner.nextInt();
        
        // print Hasil
        System.out.print("Hasil = ");
        
        // melakukan perulangan sebanyak isi variabel jumlahBilangan
        for (int i = 0; i < jumlahBilangan; i++) {
            int angka = angkaAwal + i;
            
            // menghitung kuadrat
            int kuadrat = angka * angka; 
            
            // Print Nilai Kuadrat
            System.out.print(kuadrat + " ");
        }
        
        scanner.close();
    }
}

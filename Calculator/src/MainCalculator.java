public class MainCalculator {

    private static int nilaiA;
    private static int nilaiB;

    public static void main(String[] args) {


//        Inisialisasi Variabel
        nilaiA = 10;
        nilaiB = 10;

//        Buat Objek
        Calculator calculator = new Calculator();

//        Penjumlahan
        System.out.println("Hasil dari "+nilaiA+" + "+nilaiB+" = "+calculator.tambahNilai(nilaiA,nilaiB));
//        Pengurangan
        System.out.println("Hasil dari "+nilaiA+" - "+nilaiB+" = "+calculator.kurangNilai(nilaiA,nilaiB));
//        Pembagian
        System.out.println("Hasil dari "+nilaiA+" / "+nilaiB+" = "+calculator.bagiNilai(nilaiA,nilaiB));
//        Perkalian
        System.out.println("Hasil dari "+nilaiA+" * "+nilaiB+" = "+calculator.kaliNilai(nilaiA,nilaiB));

    }
}

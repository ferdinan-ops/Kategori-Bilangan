import javax.swing.JOptionPane;

public class No2 {
    public static void main(String[] args) {
        String kategori = "";
        String i = JOptionPane.showInputDialog("Masukkan Angka");
        int angka = Integer.parseInt(i);
        System.out.println("");

        if (angka >= 1) {
            kategori = "Bilangan Positif";
        } else if (angka < 0) {
            kategori = "Bilanagan Negatif";
        } else {
            kategori = "Bilangan Nol";
        }
        System.out.println("Angka " + angka + " adalah " + kategori);
    }
}

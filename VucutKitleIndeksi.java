import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
      double kilo,boy;

      Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu (metre cinsinden )Giriniz: ");
        boy=inp.nextDouble();

        System.out.print("Kilonuzu Giriniz: ");
        kilo = inp.nextDouble();

        double indeks=kilo / (boy*boy);

        System.out.println("Vücut Kitle İndeksiniz: "+indeks);
    }
}

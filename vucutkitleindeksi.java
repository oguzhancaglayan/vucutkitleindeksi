import java.util.Scanner;
public class vucutkitleindeksi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu kg cinsinden giriniz");

      double kilo=inp.nextDouble();

       System.out.println("Lütfen boyunuzu metre cinsinden giriniz");
       double boy = inp.nextDouble();

       double indeks = kilo/(boy*boy);
       System.out.println("Vücut Kitle İndeksiniz:"+" "+indeks);

    }
}

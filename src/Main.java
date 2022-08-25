import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input=new Scanner(System.in);

        System.out.println("Matematik Notunu Giriniz :" );
        mat = input.nextInt();

        System.out.println("Fizik Notunu Giriniz :");
        fizik = input.nextInt();

        System.out.println("Kimya Notunu Giriniz :");
        kimya = input.nextInt();

        System.out.println("Türkçe Notunu Giriniz");
        turkce = input.nextInt();

        System.out.println("Tarih Notunu Giriniz : ");
        tarih= input.nextInt();

        System.out.println("Müzik Notunu Giriniz : ");
        muzik= input.nextInt();
        int toplam = mat + fizik + kimya + tarih + turkce + muzik;
        double ortalama =toplam/6.0;
        System.out.println("Ortalamanız : "+ ortalama);

        String sonuc = ortalama>60 ? "Sınıfı Geçti ":"Sınıfta Kaldı";
        System.out.println(sonuc);




    }
}

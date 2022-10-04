import java.util.Scanner;

public class NotOrt {
    public static void main(String[] args) {
        int mat, trk, fzk, kmy, trh, mzk;

        Scanner ortalamaHesap= new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat=ortalamaHesap.nextInt();

        System.out.print("Turkce Notunuz: ");
        trk=ortalamaHesap.nextInt();

        System.out.print("Fizik Notunuz: ");
        fzk=ortalamaHesap.nextInt();

        System.out.print("Kimya Notunuz: ");
        kmy=ortalamaHesap.nextInt();

        System.out.print("Tarih Notunuz: ");
        trh=ortalamaHesap.nextInt();

        System.out.print("Muzik Notunuz: ");
        mzk=ortalamaHesap.nextInt();

        int Toplam= mat+trk+fzk+kmy+trh+mzk;
        float Ortalama= Toplam/6;
        System.out.println("Not Ortalamaniz: "+Ortalama);
        String Sonuc= Ortalama>=50? "Gecti": "Kaldi";
        System.out.println(Sonuc);



    }
}
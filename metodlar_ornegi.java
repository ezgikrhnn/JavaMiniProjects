
//DERS39 - METOTLARIN HEPSİNİ İÇEREN BİR ORNEK

import java.util.Scanner;

public class ders39 {

    public static void main(String[] args) {
        
        int kullaniciSecimi = -1;  //diye varsayilan deger atıyoruz. 0 atayamayız cunku while dongusundeki kısıtlamadan dolayı    
       
        for(;;){
            kullaniciSecimi = menuGoster();
            if(kullaniciSecimi == 0){
               break; // kullanici menuden cıkmak istemiştir.
            }
            
            
            
            Scanner tara = new Scanner(System.in);
            System.out.println("birinci sayiyi giriniz: ");
            int birinciSayi = tara.nextInt();
            System.out.println("ikinci sayiyi giriniz: ");
            int ikinciSayi = tara.nextInt();

            switch(kullaniciSecimi){
                case 1: 
                   ikiSayiyiCarp(birinciSayi,ikinciSayi);
                   break;
                case 2: 
                   ikiSayiyiTopla(birinciSayi,ikinciSayi);
                   System.out.println("iki sayinin toplami: ");
                   break;
                case 3: 
                    ikiSayininKuvvetiniBul(birinciSayi,ikinciSayi);
                break;
            }
        } 
        

    }
    
    public static void ikiSayiyiCarp(int a, int b) {
        
        System.out.println("iki sayinin carpimi: "+(a*b));
    }

    public static int ikiSayiyiTopla(int a, int b) {
        int toplam = a+b;
        return toplam;

    }

    public static void ikiSayininKuvvetiniBul(int a, int b) {
       double sonuc =  Math.pow(a,b); // pow double deger dondurdugu için double sonuc yazıyoruz.
       System.out.println("sayilarin kuvveti: " +sonuc);
    }


    public static int menuGoster(){
        System.out.println("********MENU********");
        System.out.println("1- iki sayinin carpimini bul: ");
        System.out.println("2- iki sayinin toplamini bul: ");
        System.out.println("3- iki sayinin kuvvetini bul: ");
        System.out.println("4- cikmak icin 0'i tuslayiniz. ");

        Scanner tara = new Scanner(System.in);  //kullanicidan veri isteyelim
        System.out.println("lutfen seciminizi giriniz: ");
        int secim = tara.nextInt();

        return secim; // return kullanıgımız için metodun void kısmını int yaptık




    }
    
}

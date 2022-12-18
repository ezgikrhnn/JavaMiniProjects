//DERS43 DİZİ ORNEK SORULAR
/*
soru1: 10 elemanlı bir diziye eleman olarak dizi indeksinin karesini atayan uygulama
soru2: kullanıcıdan hangi ayda oldugu bilgisini alıp ilgili ay degerini yazdırın.
ay adlarını bir dizide saklayın,
soru3: kullanıcıdan kaç tane sayının ortalamasını bulmasını istedigini sorun. ve buna 
bağlı olarak aldıgınız degerleri bir dizide saklayın. veri alma işlemi bittikten sonra tum 
sayıları ve ortalamasını ekrana yazdırın.
 */

import java.util.Scanner;
public class ders44 {

    public static void main(String[] args) {

        // COZUM1:
        int sayilar[]=new int[10]; // sayilardan hemen once veya intdan hemen sonra da [] koyabilirdik fark etmiyor.
        // yukarıdaki işlemde new diyerek bellekten bir yer verdik.
        
        for(int index=0; index<10; index++){
           sayilar[index]=(int)Math.pow(index,2); //math.pow double dondurdugu için int cevirdik.
           System.out.println("eleman: " +sayilar[index]);
        }

        //COZUM2:
        
        //String[] aylar =new String[12] diye ya da direk aşagıdaki gibi diziyi tanımlayabiliriz.
        String[] aylar = {"ocak", "subat", "mart", "nisan", "mayis", "haziran", "temmuz", "agustos", "eylul", "ekim", "kasim", "aralik"};

        Scanner tara = new Scanner(System.in);
        System.out.println("lutfen kacinci ayda oldugunuzu giriniz: ");
        int secim = tara.nextInt();

        System.out.println("sectiginiz ay: " +aylar[secim-1]);
        


        //COZUM3:
        Scanner input = new Scanner(System.in);
        System.out.println("kac tane sayinin ortalamasini bulmak istiyorsunuz: ");
        int sayi = input.nextInt();

        int kullaniciSayilari[] = new int[sayi];
        double toplam =0;
        double ortalama = 0;
        for(int i=0; i<sayi; i++){
            System.out.println("sayi giriniz: \n");
            kullaniciSayilari[i] = input.nextInt();
            toplam = toplam + kullaniciSayilari[i];
        ortalama = toplam/sayi;
        System.out.println("ortalama: "+ortalama);
        }

    
       
        

        
    }
    
}

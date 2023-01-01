//DERS68 - KOMPOZİSYON İLE SINIFLARIN TEKRAR KULLANILMASI
/*
KOMPOZİSYON: daha önceden yazılmış sınıfı yeni sınıf içinde kullanmak.
KALITIM(INHERİTANCE): yeni oluşturacagımız sınıfı daha onceden yazılmış sınıftan türetmek.
boylece yeni sınıf eski sınıfın ozelliklerine sahip olacagı gibi, kendine ait ek ozellikrleri
de içerebilir. iki sınıf arasında kalıtım uygulnanacaksa sorulması gereken soru şudur:
* yeni sınıf bir eski sınıf mıdır?
(kaplan bir kedi midir? --> kaplan kedi sınıfından türetilebilir.)
kopek balığı > balık> hayvan ----> kalıtıma uygundur.

 */
package bolum8;

public class ders68_kompozisyon {
    public static void main(String[] args) {
        araba myAraba = new araba();
        myAraba.hareketeGec();
        myAraba.durmayaBasla();
    }
}

class motor{
    private String isim;
    private int beygirGucu;

    public motor(){
        isim = "honda";
        beygirGucu = 135;
        System.out.println(isim+ " isimli " +beygirGucu+ " beygirguclu motor oluşturuldu ");
    }

    public void calistir(){
        System.out.println("motor calistirildi");
    }

    public void durdur(){
        System.out.println("motor durduruldu");
    }
}

class araba{

    private motor arabaMotoru;
    private String renk;
    private String marka;
    private int uretimYili;

    public araba(){ //constructor oluşturuyorum
        arabaMotoru = new motor();
        renk = "kirmizi";
        marka = "toyota";
        uretimYili = 2019;
        System.out.println(renk+ " renkli " +uretimYili+ " model " +marka+ " markali araba oluşturuldu");
    }

    public void hareketeGec(){
        System.out.println("araba harekete geciyor");
    }

    public void durmayaBasla(){
        System.out.println("araba durmaya basladı");
    }
}














// KALITIM ÖRNEK:
/*
geometrik şekil kare dikdortgen ornegı yapacagım.
 */

package bolum8;

public class kalitimCalismasi {
    public static void main(String[] args) {

        dikdortgen d1 = new dikdortgen(10,20); //bu şekilde oluşturabiliriz dikdortgen() diyerek
        d1.ozellikleriYazdir();
        System.out.println("d1'in ozellikleri " +d1); //kalıtımın içindeki tostring yapısı sayesinde yazdırdı

        geometrikSekil gs1 = new geometrikSekil(15,45);
        System.out.println(gs1); //class geometrikSekil içindeki tostring yapısı sayesinde yazdırdı

        kare k1 = new kare(20,20);
        k1.cevreHesapla();


    }
}

class geometrikSekil{
    //karede dikdortgende ne gibi ozellikler vardır?
    private int en;
    private int boy;


    //bu alanlara erişmek için en ve boyu alan const. oluşturuyorum:
    public geometrikSekil(int en, int boy) {
        this.en = en;
        this.boy = boy;
    }
    //sadece en değeri kullanılacak olabilir, const yazalım:
    public geometrikSekil(int en) {
        this.en = en;
    }
    //boy deger icin const. yazamam cunku java ikisini aynı gorup izin vermez.
    //son olarak parametresiz const yazıyorum
    public geometrikSekil() {
    }

    //bu degeerleri başka sınıfların kullanabilmesi için getter setter eklemesi yapıyorum:
    //public olmaları dışarıdan kullanılabilmesi için:
    public int getEn() {
        return en;
    }
    public void setEn(int en) {
        this.en = en;
    }
    public int getBoy() {
        return boy;
    }
    public void setBoy(int boy) {
        this.boy = boy;
    }

    //getter ve setterlardan sonra bir geometrik şeklin alanı ve cevresi vardır.
    public void alanHesapla(){
        System.out.println("geometrik seklin alani: " +(en*boy));
        //aynı sınıfta oldukları için +(getEn()*getBoy()) da yazılabilirdi
    }
    public void cevreHesapla(){
        System.out.println("geometrik seklin cevresi: " +((en+boy)*2));
    }

    @Override
    public String toString(){
        return "en: " +en+ " boy: " +boy;
    } // nesneyi yukarıda direkt olarak yazdırmak istiyorsak kullanacagımız yapı

}

class dikdortgen extends geometrikSekil{
    //simdi dikdortgen sınıfını düşünüyoruz. dikdortgen de ene boya cevreye ve alana sahiotir.
    //geometrikSekil sınıfından hiçbir farkı olmadıgını far ediyorum.
    //o zaman buara kalıtım mı uygulasam? kompozisyon mu?
    //dikdortgen bir geometrik şelik midir EVET ---> 0 ZAMAN KALITIM UYGULUYORUM:
    // class dikdortgen extends geometrikSekil yazarak başlıyoruz.

    //en yukarıda psvm içinde e boy yazabilmek için buraya const. tanımlamalıyım
    public dikdortgen(int en, int boy){ //cont oluştur.
        //en ve boya deger atamak için setterlarımız vardı:
        setEn(en);
        setBoy(boy);
        //psvmdeki türettiğim geometrik şekile parametre olarak gelen 10,20 degerlerini burasıyla sagladım

    }


    public void ozellikleriYazdir(){
        System.out.println("geometrik seklin eni: " +getEn()+ " geomeyrik seklin boyu: " +getBoy());
        alanHesapla();
        cevreHesapla();
        //bu iki metodu sout içinde cagırmıyorum cunku zaten onların içlerinde sout vardı.
    }

    //nesneyi direkt sout içinde yukarıda cagırabilmek için de tostring yazalım:
    @Override
    public String toString(){
        return "dikdortgenin eni: " +getEn()+ " dikdortgenin boyu: " +getBoy();
    }



}

class kare extends dikdortgen{  //kare eni ve boyu eşit olan bir dikdortgendır.
    public kare(int en, int boy) { // java benden bir super yapısı istedi? niye?
        super(en, boy); //super bir ust sınıf anlamına geliyor. karenin bir ust sınıfı dikdortgendir.
        
    }
}

/*
bir alt sınıf aslında üst sınıfın ozelleştirilmiş halidir. alt sınıf üst sınıfın
tüm ozelliklerini ve kendin ozgu alanlarını barındırır.
class kopek extends hayvan ornegınde kopek sınıfının her nesnesi aslında hayvan
sınıfı nesnesidir.
bundan dolayı üst sınıf tipine alt sınıf referansı bağlayabiliriz:
hayvan h = new kopek();
geometrikSekil x = new dikdortgen();

kısacası alt sınıf nesnesı, üst sınıfın nesnesinin kullanıldıgı her yerde
kullanılabilir. bu duruma polymorphism denir

 */


public class polymorphizmCalismasi{
  
    public static void main(String[] args) {

        hayvan h1 = new hayvan();
        kopek kopek1 = new kopek("golden");
        kedi kedi1 = new kedi("disi");

        System.out.println("h1: ");
        adiniSoyle(h1);
        System.out.println("kedi1: ");
        adiniSoyle(kedi1);
        System.out.println("kopek1: ");
        adiniSoyle(kopek1);
    }


    //metot oluşturalım
    public static void adiniSoyle(hayvan k){ //bu demektir ki sana hayvan sınıfından bir nesne gelecek.
    //ayrı ayrı kedi kopek parametreli metodu yazmak yerine tek seferde hayvan yazdım
        k.adiniSoyle();

    }
}

class hayvan{
   private int ayakSayisi;

    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }


    //bir tane de metot oluşturalım
    public void adiniSoyle(){
        System.out.println("ben hayvan sinifi nesnesiyim: " );
    }
}

class kopek extends hayvan{ // her kopek hayvan oldugu için kalıtım yaptım

    private String tur;

    //const. oluşturalım:
    public kopek(String tur){
        setAyakSayisi(4); //sesAyakSayisi diyerel ust sınıftaki metota eriştim
        setTur(tur);
    }
    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public void adiniSoyle(){
        System.out.println("ben bir kopek nesnesiyim");

    }
}

//bir tane de kedi sınıfı yapalı
class kedi extends hayvan{

    private String cinsiyet;

    //const. yazdım
    public kedi(String cinsiyet){
       setAyakSayisi(4);
       setCinsiyet(cinsiyet);

    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Override
    public void adiniSoyle() {
        System.out.println("ben bir kedi nesnesiyim");
    }
}

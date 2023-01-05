
public class kalitimOrnegi_okulPersonel {
    public static void main(String[] args) {
        personel mudur = new personel("ahmet", 12243565, 40, "mudur");
        System.out.println(mudur);

        ogrenci ezgi = new ogrenci("ezgi", 23, 2138, 32454324);
        System.out.println(ezgi);
    }
}

class kisi{ //ogrenci de bir kişidir personel de bir kişidir.
    private String isim;
    private long tcKimlik; //en buyuk int deger tutan yapılar longdur.
    private int yas;

    //const. oluşturuyorum, parametrsiz olsun:
    public kisi(){
        isim = "henuz atanmadi.";
        tcKimlik =0;
        yas = 18; //yas en az 18 olacagı için boyle yazdım
    }

    public kisi(String isim, long tcKimlik, int yas){
        this.isim = isim;
        this.tcKimlik = tcKimlik;
        setYas(yas); // yasta bir ef else durumu oldugu için once setyas cagırılsın


    }



    //kullanıcı mesela ki yas bilgisini okumak, guncellemek istiyorsa;
    //herkesin ulaşabilecegi getter setterları oluşturuyorum.
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public long getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(long tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas>= 18){
            this.yas = yas;
        }else{
            this.yas =18;
        }
    }

    @Override
    public String toString() {
        return "ad: " +isim+ " tckimlik: " +tcKimlik+ " yas: " +yas;
    }
}

class personel extends kisi{  //extends diyip kişi sınıfından personel türetecegim.

    private String pozisyon;

    //nesne uretebilmem için constructor yazıyorum
    // alt sınıftan bir nesne turetildiginde ve bu bir sınıftan üretilmişse oncelikle onun onstrctoru cagırılıyordu.
    public personel(String isim, long tcKimlik, int yas, String pozisyon) { //personel const. cagırıldı.
        //  setYas(yas);
        // setIsim(isim);
        // setTcKimlik(tcKimlik); bunlar yerine super kullanalım daha temiz kod yazalım:
        // super. ust sınıftaki metotlara erişir. super() ust sınıfın constructoruna erişir.
        super(isim,tcKimlik,yas);
        this.pozisyon = pozisyon;
    }
    



    //pozisyon private oldugu için getter setter oluşturdum
    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    @Override
    public String toString() {
        return "personel adı: " +getIsim()+ " tc kimlik: " +getTcKimlik()+ " yas: " +getYas()+ " pozisyon: " +getPozisyon();
    }

    @Override
    public long getTcKimlik() {
        return super.getTcKimlik();
    }
}


//simdi personel için yaptıgım seyin aynısını ogrenci için yapıyorum.
//ogrenci bir personel değil kişidir.
class ogrenci extends kisi{
    //ogrencide kiside bulunan isim, tc, yas ortak farklı olan okulno vardı
    private int ogrenciNo;

    public ogrenci(String isim, long tcKimlik, int yas, int ogrenciNo) {
        super(isim, tcKimlik, yas);
        this.ogrenciNo = ogrenciNo;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return "ogrenc adi: " + getIsim() + " tc kimlik: " + getTcKimlik() + " yas: " + getYas() + " ogrenci no: " + ogrenciNo;
    }
}

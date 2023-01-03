/*
bu calışmada bir okuldaki insanların (ogrenci, hademe, ogretmen, müdür...)
bilgisini tutacak bir yapı olusturacagım.
 */

package bolum8;

public class kalitimsizOrnek {
    public static void main(String[] args) {
        personel mudur = new personel("ahmet", 123499, -8 );
        System.out.println(mudur.getYas()); //yasi 18 olarak yazdırır
        System.out.println(mudur);

        ogrenci emre = new ogrenci("emre", 18, 2030494, 8526);
        System.out.println(emre);


    }
}


class personel{
    private String isim;
    private long tcKimlik; //en buyuk int deger tutan yapılar longdur.
    private int yas;

    //const. oluşturuyorum, parametrsiz olsun:
    public personel(){
        isim = "henuz atanmadi.";
        tcKimlik =0;
        yas = 18; //yas en az 18 olacagı için boyle yazdım
    }

    public personel(String isim, long tcKimlik, int yas){
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


//bu okulda sadece personel yokk ogrenciler de var:
class ogrenci{

    private String isim;
    private int yas;
    private long tcKimlik;
    private int okulNo;

    //constructor olusturuyorum:
    public ogrenci(String isim, int yas, long tcKimlik, int okulNo) {
        this.isim = isim;
        this.yas = yas;
        this.tcKimlik=tcKimlik;
        this.okulNo = okulNo;
    }

    //olur da lazım olursa diye bos const. olusturdum.
    public ogrenci() {
        isim = "henuz atanmadi";
        tcKimlik = 0;
        setYas(yas);
        okulNo = 5000;
    }

    //getter setter olusturuyorum:
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
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
        if(yas>= 7){
            this.yas = yas;
        }else{
            this.yas =7;
        }
    }

    @Override
    public String toString() {
        return "ad: " +isim+ " tckimlik: " +tcKimlik+ " yas: " +yas+ " okulNosu: "+okulNo;
    }
}

//DERS61 - ENCAPSULATİON VİDEONUN ORTASINDAKİ ÖRNEKTEN BAŞLADIM:
/*
encapsulation şu anlama geliyor, sizin sınıfınızda bulunan değişkenler sadece sınıfınıza özgü olsun, yani ben
bu sınıfın istediğim her yrinde buradaki degerleri kullanabileyim ama
 */

package oop_giris;

public class encapsulation {
    public static void main(String[] args) {

        televizyon tv = new televizyon();
        tv.ac();
        tv.kapat();
        tv.setSesSeviyesi(15);
        tv.setKanal(20);
        tv.goster();


    }
}

/*
hesap makinesi sınıfı oluşturun. bı sınıfta 4 işlem yapabilmek için
metotlarınız olsun. bu metotlara istenilen sayıda parametre gecilebilmeli
Bölme işlemindeki 0 degeri için gerekli kontolu yazın.
 */

package bolum7_sorular;

public class hesapMakinesi_miniProje {
    public static void main(String[] args) {
        System.out.println("topla: " +hesapMakinesi.topla(10,12,15));
        System.out.println("fark: " +hesapMakinesi.cikar(10,12,15));
        System.out.println("carpim: " +hesapMakinesi.carp(10,12,15));
        System.out.println("bolum: " +hesapMakinesi.bol(1,5,2));

    }
}

class hesapMakinesi{
    //buraya int sayi1 int sayi2 diye deger tutmama gerek yok (sayısını bilmiyorum)
    //buradaki işlemler her bir nesneye ozgu olmayacak (public-static kullanıyorum)
    public static int topla(int... parametreler){
        int toplam =0;
        for(int parametre :parametreler){
            toplam = toplam + parametre;
        }
        return toplam;
    }

    public static int cikar(int... parametreler){
        int fark = parametreler[0];
        for(int i=1; i<parametreler.length; i++){
            fark = fark - parametreler[i];
        }
        return fark;
    }
    public static int carp(int... parametreler){
       int carpim = 1;
       for(int parametre:parametreler){
           carpim = carpim * parametre;
       }
       return carpim;
    }

    public static double bol(double... parametreler){
        double bolum = parametreler[0];

        for(int i =1; i<parametreler.length; i++){
            if(parametreler[i] != 0){
                bolum = bolum / parametreler[i];
            }else{
                System.out.println("parametrelersen biri sıfır, bolme yapilamadi");
                return -1;
            }
        }
        return bolum;
    }
}

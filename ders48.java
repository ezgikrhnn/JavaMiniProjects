// DERS48- DİZİ ELEMANLARININ YER DEĞİŞTİRİLMESİ
/*bu ornekte diziyi metot çağırarak yazdırma, dizi elemanlarının yerlerini değiştirme,
selectionsort kullanarak diziyi sıralama çalışması yaptım.
 */




public class ders48 {
    public static void main(String[] args) {

        int[] sayilar = {1,8,5,2,7,9,60,120,5,-9};
        diziYazdir(sayilar); // metodu çağırarak bu şekilde önce diziyi yazdırdık.
        diziyiDegistir(sayilar );
        System.out.println("\nyer degistirme metodundan sonra dizi: ");
        diziYazdir(sayilar);

        selectionSortSiralama(sayilar);
        System.out.println("siralama metodundan sonra dizi: ");
        diziYazdir(sayilar);

    }



    public static void diziYazdir(int[] dizi) {
        for(int i: dizi){
            System.out.print(i +",");    //****print yapınca alt alta değil yanyana yazdırıyor. *****
        }
    }

    public static void diziyiDegistir(int[] dizi) {
        for(int i = dizi.length-1; i>0; i--){  //son elemandan başlayıp geriye dogru yer değiştirelim
            int rastgeleIndex = (int)(Math.random() * (i+1)); // random metot 0-0.999 arasında rastgele bir sayi uretiyordu. bu sayiyi i+1 ile çarpalım
            
            // simdi yer degistirme islemi yapalım
            int gecici = dizi[i]; // gecici elemanı kaybetmemek için bir yerde saklıyoruz
            dizi[i] = dizi[rastgeleIndex];
            dizi[rastgeleIndex]=gecici;  // en son rastgele indexe geciciyi koyuyoruz
            // SAGDAN SOLA ATAMA YAPIYORUZ DİKKAT ET!!! KONU ANLATIMINI İZLE YENİDEN ANLAMAZSAN 
        }   
    }

    // bazen de bir dizideki elemanları sıralamak isteriz: bircok sıralama tipi var . selection sort ornegi yapalım
    public static void selectionSortSiralama(int[] dizi){
   /*selection sort en soldaki elemanı ek küçük kabul eder. 
   sağa doğru taramaya başlar, eger kendisinden daha küçük 
   bir eleman görürse onunla yer değiştirir.*/
     for(int i=0; i<dizi.length; i++){
        // en kucuk elemanın indexinin bulunması:
        int oankiEnKucukSayi = dizi[i];
        int oankiEnKucukElemaninIndexi = i;
        
          //simdi baska bir for dongusuyle acaba ondan sonraki elemanlar sectiğim elemandan kucuk mu kontrolunu yapalım.
        for(int j=i+1; j<dizi.length; j++){
            if(oankiEnKucukSayi > dizi[j]){
                oankiEnKucukSayi =dizi[j];
                oankiEnKucukElemaninIndexi = j;
            }
        }
        if(oankiEnKucukElemaninIndexi != i){
            dizi[oankiEnKucukElemaninIndexi] = dizi[i];
            dizi[i] = oankiEnKucukSayi;
        }

     }
    
        
    }
    
}

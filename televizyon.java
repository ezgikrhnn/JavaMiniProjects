//yeni ornekl yapalım ders 61 devam

package oop_giris;

public class televizyon {

    private int kanal;
    private int sesSeviyesi;
    private boolean acik;

    public void ac() {
        if (acik == false) {
            System.out.println("televizyon aciliyor");
            acik = true;
        } else {
            System.out.println("televizyon zaten acik");
        }

    }

    public void kapat() {
        if (acik) {
            System.out.println("televizyon kapatiliyor");
            acik = false;
        } else {
            System.out.println("televi<yon zaten kapalı");
        }
    }

    public void setKanal(int yeniKanal) { // 500 kanallık bir televizyon olsun
        if (acik && yeniKanal > 0 && yeniKanal < 500) {
            kanal = yeniKanal;
        } else{
            System.out.println("tv kapalı veya yanlis bir kanal degeri yazdiniz!!");
        }
    }

    public int getKanal() {
        return kanal;
    }

    public int getSesSeviyesi() {
        return sesSeviyesi;
    }

    public void setSesSeviyesi(int sesSeviyesi) { //20 seviyeli bir tv olsun
        if (acik && sesSeviyesi > 0 && sesSeviyesi < 20) {
            this.sesSeviyesi = sesSeviyesi;
        }else{
            sesSeviyesi =1;       // varsayılan olarak bir degerini atadım
        }
    }

    public void goster() {
        System.out.println("tv acik: " + acik + " kanal: " + kanal + " ses seviyesi :" + sesSeviyesi);
    }

}
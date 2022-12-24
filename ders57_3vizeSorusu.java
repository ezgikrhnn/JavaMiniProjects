// DERS57 - 3 VİZE SORUSU
/*
SORU1: 5*5 bir matris oluşturun ve bu matrisin elemanları 0-9 arasında rastgele sayilar olsun.
bu matrisi ekrana yazdıran ve çapraz elemanların toplamını gosteren programı yazınız.

 */
public class ders57_3vizeSorusu {
    public static void main(String[] args) {
        
        int[][] matrix = new int[5][5];
        int genelToplam=0;
          
        
        
        for(int i =0; i<5; i++){
           for(int j=0; j<5; j++){
              
            matrix[i][j] = (int)(Math.random()*10); // math.random 0-0.99 arasında ssyılar urettiği için *10.
            System.out.print(matrix[i][j]+ " ");   
        }
            System.out.println(); // dısarıdaki for'un içine bu ifadeyi yazarsak satırlar alt alta gelir.
           
            //capraz elemanların 1. satir 1. sutun, 2. satır 2. sutun.. oldugunu fark ettik.
            genelToplam = genelToplam + matrix[i][i]; 
            
            
        } 
        System.out.println("capraz elemanlarin toplami: " +genelToplam);
        
    
}
}
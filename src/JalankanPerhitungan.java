import model.*;


public class JalankanPerhitungan {
    

    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4,5,0);


        System.out.println("----------");
        System.out.println("Hasil pertambahan :");
        int hasiltambahnya = s.hsltmbh(3, 7);
        System.out.println(hasiltambahnya);



        System.out.println("----------");
        System.out.println("Hasil Perkalian :");
        int hasilkalinya = s.hslkli(4,2);
        System.out.println(hasilkalinya);  
    }
}

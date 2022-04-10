package tgas;
public class Main {
    public static void main(String[] args) {
        
        BangunDatar bangunDatar = new BangunDatar();
        
        Persegi persegi = new Persegi();
        persegi.sisi = 4;
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 10;
        persegiPanjang.lebar = 4;
        
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 3;
        segitiga.tinggi = 8;
        
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
                
        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("keliling persegi: " + persegi.keliling());
        System.out.println("Luas persegi panjang: " + persegiPanjang.luas());
        System.out.println("keliling persegi panjang: " + persegiPanjang.keliling());
        System.out.println("Luas segitiga: " + segitiga.luas());
        }
}
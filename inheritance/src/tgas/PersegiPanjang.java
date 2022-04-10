package tgas;
public class PersegiPanjang extends BangunDatar{
    float panjang;
    float lebar;
    @Override
    float luas(){
        float luas = panjang * lebar;
        return luas;
        }
    @Override
    float keliling(){
        float keliling = 2*panjang + 2*lebar;
        return keliling;
        }
    }
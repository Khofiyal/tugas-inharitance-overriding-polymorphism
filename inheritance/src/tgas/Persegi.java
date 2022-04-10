package tgas;
public class Persegi extends BangunDatar{
    float sisi;
    @Override
    float luas(){
        float luas = sisi * sisi;
        return luas;
        }
    @Override
    float keliling(){
        float keliling = 4 * sisi;
        return keliling;
        }
    }
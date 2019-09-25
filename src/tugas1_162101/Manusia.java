package tugas1_162101;

public class Manusia 
{
    public String nama,
                  jkl,
                  alamat,
                  ttl,
                  tinggiBadan,
                  warnaKulit,
                  goldar;
    public int energi=100, beratBadan=0;
    private int umur=0;//encaptulasi
    
    public Manusia()//constructor
    {
        nama = "abdi Massimpuang";
        jkl = "laki-Laki";
        alamat = "BTN Antara";
        ttl = "tobaku, 11 April 1999";
        tinggiBadan = "168";
        warnaKulit = "hitam";
        goldar = "B";
    }
    
    public int getUmur(int age)//polymorphism
    {
        return age;
    }
    
    void makan()//method
    {
        energi += 5;
        beratBadan += 2;
    }
    
    void minum()
    {
        energi += 1;
        beratBadan += 1;
    }
    
    void berjalan()
    {
        energi -= 1;
    }
    
    void berlari()
    {
        energi -= 2;
    }
}

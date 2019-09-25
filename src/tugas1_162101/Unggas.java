package tugas1_162101;

public class Unggas 
{
    private String nama,keahlian,warna,jenis;//encaptulasi
    
    public Unggas(String nama, String warna)//constructor
    {
        this.nama = nama;
        this.warna = warna;
    }
    
    public String kemampuan(String kmp)//polymorphism
    {
        return keahlian = kmp;
    }
    
    public void printInfo()
    {
        System.out.println("\nnama : " + nama + "\nkeahlian : " + keahlian+ "\njenis : "+ warna);
    }
    
}

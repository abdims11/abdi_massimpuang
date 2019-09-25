package tugas1_162101;

public class Lansia extends Manusia
{
    private String pekerjaan;
    private int gaji;
    
    public Lansia()//constructor
    {
        System.out.println("Manusia Lnjut Usia");
    }
    
    public String Pekerjaan()//polymorpism
    {
        return "pegawai";
    }
    
    void bekerja()//method
    {
        gaji = 10000;
    }
    
    public static void main(String[] args) 
    {
        Manusia lansia1 = new Manusia();//object 1
        lansia1.nama = "aji baco";
        System.out.println("nama saya : " + lansia1.nama + "\numur saya : " + lansia1.getUmur(70));
        
        Manusia lansia2 = new Manusia();//object 2
        lansia2.nama = "dg ziga";
        System.out.println("nama saya : " + lansia2.nama + "\numur saya : " + lansia2.getUmur(66));
        
        Manusia lansia3 = new Manusia();//object 2
        lansia3.nama = "hj tajri";
        System.out.println("nama saya : " + lansia3.nama + "\numur saya : " + lansia3.getUmur(68));
    }
}

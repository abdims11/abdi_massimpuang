package tugas1_162101;

public class Bayi extends Manusia
{
    private String namaIbu = "BECCE";//encaptulasi
    private int energi = 100;
    
    public Bayi()//constructor
    {
        System.out.println("Aku adalah Bayi");
    }
    
    public String toString()//polymorphism
    {
        return "bayi kecil";
    }
    
    void minumSusu()//method
    {
        energi += 1;
    }
    
    public static void main(String[] args) 
    {
        Manusia bayi1 = new Manusia();//object 1
        bayi1.nama = "agung";
        System.out.println(bayi1.nama);
        
        Manusia bayi2 = new Manusia();//object 2
        bayi1.nama = "ani";
        System.out.println(bayi1.nama);
        
        Manusia bayi3 = new Manusia();//object 3
        bayi1.nama = "aco";
        System.out.println(bayi1.nama);
        
    }
}

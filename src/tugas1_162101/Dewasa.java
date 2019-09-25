package tugas1_162101;

public class Dewasa extends Manusia
{
    private String status;//encaptulasi
    private int nilai=0;
    
    public Dewasa()//construktor
    {
        System.out.println("manusia dewasa");
    }
    
    public String Status(String sts)//polymorphism
    {
        return status = sts;
    }
    
    void kerjaTugas()//method
    {
        nilai += 80;
    }
    
    public static void main(String[] args) 
    {
        Manusia dewasa1 = new Manusia();//object 1
        dewasa1.nama = "baco";
        System.out.println("nama saya : " + dewasa1.nama + "\numur saya : " + dewasa1.getUmur(20));
        
        
        Manusia dewasa2 = new Manusia();//object 2
        dewasa2.nama = "becce";
        System.out.println("nama saya : " + dewasa2.nama + "\numur saya : " + dewasa2.getUmur(21));
        
        Manusia dewasa3 = new Manusia();//object 3
        dewasa3.nama = "LISA";
        System.out.println("nama saya : " + dewasa3.nama + "\numur saya : " + dewasa3.getUmur(19));
    }
    
}

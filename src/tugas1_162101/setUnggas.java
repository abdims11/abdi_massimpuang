package tugas1_162101;

public class setUnggas
{
    public static void main(String[] args) 
    {
        Unggas unggas1 = new Unggas("kutilang", "Hitam");//object 1
        unggas1.kemampuan("Bisa Terbang");
        unggas1.printInfo();
        
        Unggas unggas2 = new Unggas("gereja", "biru");//object 2
        unggas2.kemampuan("Bisa terbang");
        unggas2.printInfo();
        
        Unggas unggas3 = new Unggas("ayam", "coklat");//object 3
        unggas3.kemampuan("Tidak Bisa Terbang");
        unggas3.printInfo();
    }
}

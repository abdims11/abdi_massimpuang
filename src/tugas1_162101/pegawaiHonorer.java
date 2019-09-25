package tugas1_162101;

public class pegawaiHonorer extends Pegawai
{
    int gajiTambahan,totalGajiPokok;//attribut
    
    public pegawaiHonorer()//contructor
    {
        System.out.println("Pegawa Honorer");
    }
    
    public void Absen()//polymorphism
    {
        System.out.println("Nama : Nonorer");
    }
    
    void gajiPegawaiHonorer(int gajiTambahan)//method
    {
        totalGajiPokok = gajiTambahan * gajiPokok;
        System.out.println("gaji pegawai honorer : " + totalGajiPokok);
    }
}

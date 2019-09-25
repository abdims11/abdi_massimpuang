package tugas1_162101;

public class pegawaiTetap extends Pegawai
{
    int gajiLembur = 500, gajiTunjangan = 1000, totalGajipt,jumlahLembur;//atribut
    
    public pegawaiTetap()//constructor
    {
        System.out.println("pegawai tetap");
    }
    
    public void Absen()//polymorphism
    {
        System.out.println("Nama : Pegawai tetap");
    }
    
    void gajiPegawaiTetap(int jumlahLembur)//method
    {
        gajiLembur = gajiLembur*jumlahLembur;
        totalGajipt = gajiTunjangan+gajiLembur+gajiPokok;
        System.out.println("Gaji Pegawai tetap : " + totalGajipt);
    }
}

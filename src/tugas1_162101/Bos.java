package tugas1_162101;

public class Bos extends Pegawai
{
    int gajiBonus,gajiLembur,total,jumlahLembur;//attribut
    
    public Bos()//constructor
    {
        System.out.println("Boss");
    }
    
    public void Absen()//polymorphism
    {
        System.out.println("Nama : BOSS");
    }
    
    void gajiBoss(int jumlahLemburBoss)//method
    {
        gajiLembur = gajiLembur*jumlahLemburBoss;
        total = gajiBonus + gajiLembur + gajiPokok;
        System.out.println("Gaji Boss : " + total);
    }
}

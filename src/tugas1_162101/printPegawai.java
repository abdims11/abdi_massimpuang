package tugas1_162101;

public class printPegawai 
{
    public static void main(String[] args) 
    {
        Pegawai objSuper = new Pegawai();
        
        Bos objSubA = new Bos();
        pegawaiHonorer  objSubB = new pegawaiHonorer();
        pegawaiTetap objSubC = new pegawaiTetap();
        
        System.out.println("Gaji Pokok");
        objSuper.Absen();
        objSuper.gaji();
        System.out.println("\n\n");
        
        System.out.println("Gaji Pokok");
        objSubA.Absen();
        objSubA.gajiBoss(5);
        System.out.println("\n\n");
        
        System.out.println("Gaji Pokok");
        objSubB.Absen();
        objSubB.gajiPegawaiHonorer(4);
        System.out.println("\n\n");
        
        System.out.println("Gaji Pokok");
        objSubC.Absen();
        objSubC.gajiPegawaiTetap(5);
        System.out.println("\n\n");
        
    }
}

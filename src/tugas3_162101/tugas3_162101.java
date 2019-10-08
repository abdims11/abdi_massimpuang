package tugas3_162101;
import java.util.Scanner;

public class tugas3_162101 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int a = 1;
        
        String[] nim = new String[4];
        String[] nama = new String[4];
        String[] umur = new String[4];
        
        //Character jawab = new Character('Y');
        //Character jawaban = new Character('Y');
        char jawaban;
        boolean jawab = true;
        
        for(int i = 0 ; jawab ; i++)
        {
            System.out.print("Masukkan NIM \t: ");
            nim[i] = input.nextLine();
            System.out.print("Masukkan Nama \t: ");
            nama[i] = input.nextLine();
            System.out.print("Masukkan Umur \t: ");
            umur[i] = input.nextLine();
            
            
            System.out.print("Masih Ingin menginput data [Y/N]");
            jawaban = input.nextLine().charAt(0);
            
            jawab = jawaban == 'y' || jawaban == 'Y' ? true : false ; 
            System.out.println("");
        }
        
        for(int j = 0 ; j < nama.length; j++)
        {
            int c = j + a;
            System.out.println("Data Mahasiswa ke-" + c);
            System.out.println(nim[j]);
            System.out.println(nama[j]);
            System.out.println(umur[j]);
            System.out.println("");
        }   
        
        
    }
}

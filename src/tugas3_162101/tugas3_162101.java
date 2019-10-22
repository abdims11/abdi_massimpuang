package tugas3_162101;
import java.util.Scanner;

public class tugas3_162101 
{
    public static void getData(String nim1[], String nama1[], String parodi1[], String umur1[])
    {    
        if(nama1.length < 5)
        {			
            throw new StringIndexOutOfBoundsException("data kurang di input data harus diinput 5 kali");
        }
        else
        {
            int a = 1;

            for(int j = 0 ; j < nama1.length ; j++)
            {
                int c = j + a;
                System.out.println("Data Mahasiswa ke-" + c);
                System.out.println("NIM \t: " + nim1[j]);
                System.out.println("NAMA \t: " + nama1[j]);
                System.out.println("PARODI \t: " + parodi1[j]);
                System.out.println("UMUR \t: " + umur1[j] + " TAHUN");
                System.out.println("");
            }
        }
        
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        String[] nim = new String[5];
        String[] nama = new String[5];
        String[] umur = new String[5];
        String[] parodi = new String[5];
        
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
            
            if (nim[i].charAt(2) == '1') 
            {
                parodi[i] = "Sistem Informasi";
            }
            else if(nim[i].charAt(2) == '2')
            {
                parodi[i] = "Teknik Informatika";
            }
            else if (nim[i].charAt(2) == '3')
            {
                parodi[i] = "Manajemen Informatika";
            }
            else
            {
                parodi[i] = "parodi tidak terdaftar";
            }
            
            System.out.print("Masih Ingin menginput data [Y/N] : ");
            jawaban = input.nextLine().charAt(0);
            
            jawab = jawaban == 'y' || jawaban == 'Y' ? true : false ; 
            System.out.println("");
        } 
        
        try{
            getData(nim, nama, parodi, umur);
        }

        catch (StringIndexOutOfBoundsException exception){
            System.out.println("Exception: data kurang di input data harus diinput 5 kali");
        }
        finally{
            System.out.println("Eksekusi program dilanjutkan ...");
        }
    }
}

package PBO;
    import java.util.Scanner;
public class DosenBeraksi {
    
    public static void main(String[] args) {
        //objek
        //DataDosen biodata = new DataDosen("63052304200304","Rafi");
        
        //System.out.println(biodata.displayInfo());
        //System.out.println(biodata.displayInfo("Tabalong"));
        
        //error headling
        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
       DosenDetail[] dosen = new DosenDetail[2];
        
        //perulangan
        for(int i =0; i<dosen.length;i++){  
        System.out.print(" Masukkan NIDN "+(i+1)+" = ");
        String nidn = scanner.nextLine();
        System.out.print(" Masukkan NAMA  "+(i+1)+" = ");
        String nama = scanner.nextLine();
        
        //objek
        dosen[i] = new DosenDetail(nidn,nama);
        }
        
        //perulangan
        for(DosenDetail data : dosen) {
            System.out.println("====================");
            System.out.println("Data Diri = ");
            System.out.println(data.displayInfo());
        }
    }   catch(NumberFormatException e ) {
            System.out.println("Kesalahan Format Nomor "+e.getMessage());
    }   catch(StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format NIDN"+e.getMessage());
    }
        catch (Exception e){
        System.out.println("Kesalahan Umum"+e.getMessage());
    }
  }    
}


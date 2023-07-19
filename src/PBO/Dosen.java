package PBO;
//class
public class Dosen {//atribut dan encapculation
    private String nidn;
    private String nama;

    //construktor
    public Dosen(String nidn, String nama) {
        this.nidn= nidn;
        this.nama = nama;
    }

    //setter
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

 
    //getter
    public String getNidn() {
        return nidn;
    }

    public String getNama() {
        return nama;
    }
    
    
    public String displayInfo() {
        return "Nidn = "+getNidn()+ "\nNama = "+getNama();
    }
    
    //polymortisme(overloding)
    public String displayInfo(String alamat){
        return displayInfo()+"\nAlamat = "+alamat;
    }
    
}


 package PBO;//inheritance
public class DosenDetail extends Dosen{
     //overriding
    public DosenDetail(String nidn, String nama) {
        super(nidn, nama);
    }
    
    public String getTempatLahir(){
        String kodeKabupaten = getNidn().substring(0, 4);
        //seleksi swicth
        switch(kodeKabupaten) {
            case "6306":
                return "Kandangan";
            case "6305":
                return "Tapin";
            case "6307":
                return "Barabai";
            default:
                return "Kabupaten Lain";
        }
    }
    
    public int getTanggalLahir(){
          return Integer.parseInt(getNidn().substring(4, 12));   
    }
    
    public String getKeluarga(){
        String urutankeluarga = getNidn().substring(12, 14);
        //seleksi swicth
        switch(urutankeluarga) {
            case "01":
                return "Ayah";
            case "02":
                return "Ibu";
            case "03":
                return "Anak Pertama";
            case "04":
                return "Anak Kedua";
            case "05":
                return "Anak Ketiga";
            default:
                return "Dan Seterusnya";
         }
    }
   //polymortisme(override)
    @Override
    public String displayInfo(){
            return super.displayInfo()+
            "\nKabupaten = "+getTempatLahir()+
            "\nTangga Lahir = "+getTanggalLahir()+
            "\nUrutan Keluarga = "+getKeluarga();
        }
    }


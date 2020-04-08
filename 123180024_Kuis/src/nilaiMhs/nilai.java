package nilaiMhs;

public class nilai {

    public nilai(String nim, String nama, String matkul1, String matkul2, double Nilai1, double Nilai2) {


        hitungRata rerata=new hitungRata();
       
        System.out.println("NIM             : " + nim);
        System.out.println("Nama            : " + nama);
        System.out.println("Mata Kuliah 1   : " + matkul1);
        System.out.println("Mata Kuliah 2   : " + matkul2);
        System.out.println("Rata - rata     : " + rerata.Rata( Nilai1, Nilai2));
        System.out.println("Nilai Huruf     : " + convertNilaiRerataKeHuruf( Nilai1, Nilai2));
    }


    private String convertNilaiRerataKeHuruf(double Nilai1, double Nilai2) {
        hitungRata rerata=new hitungRata();
        if (rerata.Rata(Nilai1,Nilai2) >= 80 && rerata.Rata(Nilai1,Nilai2) <= 100) return "A";
        else if (rerata.Rata(Nilai1,Nilai2) >= 75 && rerata.Rata(Nilai1,Nilai2) < 80) return "B+";
        else if (rerata.Rata(Nilai1,Nilai2) >= 65 && rerata.Rata(Nilai1,Nilai2) < 75) return "B";
        else if (rerata.Rata(Nilai1,Nilai2) >= 60 && rerata.Rata(Nilai1,Nilai2) < 65) return "C+";
        else if (rerata.Rata(Nilai1,Nilai2) >= 50 && rerata.Rata(Nilai1,Nilai2) < 60) return "C";
        else if (rerata.Rata(Nilai1,Nilai2) >= 20 && rerata.Rata(Nilai1,Nilai2) < 50) return "D";
        else if (rerata.Rata(Nilai1,Nilai2) >= 0 && rerata.Rata(Nilai1,Nilai2) < 20) return "E";
        else return "Error";

    }


}
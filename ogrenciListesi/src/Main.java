import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Ogrenci[] ogreciler = {
                new Ogrenci("Gökhan","Bilgisayar Müh.",3.2,"101",2023,1,7,0),       //Bölüm Kodları: Bil=101,Makine=102,El=103
                new Ogrenci("Ayşe","Makine Müh.",2.6,"102",2022,23,5,1),
                new Ogrenci("Elif","Elektrik-Elektronik Müh.",1.7,"103",2020,43,6,2)
        };

        for (Ogrenci o: ogreciler){
            if (o.getGano()<0 || o.getGano()>4)
                throw new IllegalArgumentException("Geçersiz Gano!!!");
        }

        Ogrenci ogrenci1 = ogreciler[0];
        Ogrenci ogrenci2 = ogreciler[1];
        Ogrenci ogrenci3 = ogreciler[2];

        System.out.println("Cumhuriyet Üniversitesi öğrenci listesi:");
        ogrenci1.proccess();
        ogrenci2.proccess();
        ogrenci3.proccess();


    }

}

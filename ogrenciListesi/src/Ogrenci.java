public class Ogrenci {
    private String ad ;

    private String bolum;

    private double gano;

    private String bolumKodu;

    private int girisYili;

    private int sira;

    private int dersSayisi;

    private int uzatma;


    public Ogrenci(String ad,String bolum){
        this.ad = ad;
        this.bolum = bolum;
    }

    public Ogrenci() {
    }

    public Ogrenci(String ad, String bolum, double gano, String bolumKodu, int girisYili,int sira,int dersSayisi,int uzatma) {
        this.ad = ad;
        this.bolum = bolum;
        this.gano = gano;
        this.bolumKodu = bolumKodu;
        this.girisYili = girisYili;
        this.sira = sira;
        this.dersSayisi = dersSayisi;
        this.uzatma = uzatma;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public String getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(String bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public int getSira() {
        return sira;
    }

    public void setSira(int sira) {
        this.sira = sira;
    }

    public int getDersSayisi() {
        return dersSayisi;
    }

    public void setDersSayisi(int dersSayisi) {
        this.dersSayisi = dersSayisi;
    }

    public int getUzatma() {
        return uzatma;
    }

    public void setUzatma(int uzatma) {
        this.uzatma = uzatma;
    }

    public String ogrenciNo(){
         String no;
         no = String.valueOf(girisYili)+bolumKodu+String.valueOf(String.format("%03d",sira));
                 return no;
    }

    public double harcHesapla(int dersSayisi,int uzatma){
        double harc = (dersSayisi*57.3)+(uzatma*150);
        return harc;
    }
    public double harcHesapla(int dersSayisi){
        double harc = dersSayisi*52.5;
        return harc;
    }

    public void proccess() {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Geçersiz Gano!!!");
        }
        System.out.println(getAd() + " " + getBolum() + " " + ogrenciNo() + ", Ödeyeceği Harç : " + harcHesapla(dersSayisi)+"tl");

    }
}

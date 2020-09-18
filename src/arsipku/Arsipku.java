package arsipku;
public class Arsipku implements Biodata, Nilai{
    public static void main(String[] args) {
        Arsipku ar = new Arsipku();
        ar.nama();
        ar.tempatLahir();
        ar.hobi();
        ar.agama();
        ar.bahasaIndonesia();
        ar.matematika();
    }

   public void nama(){
       System.out.println("Namaku = Lutfian Ali Putra");
   }
   
   public void tempatLahir(){
       System.out.println("Tempat Lahir = Jember");
   }
   
   public void hobi(){
       System.out.println("Hobi = Play Game");
   }
   
   public void agama(){
       System.out.println("Agama = 100");
   }
   
   public void bahasaIndonesia(){
       System.out.println("Bahasa Indonesia = 80");
   }
   
   public void matematika(){
       System.out.println("Matematika = 90");
   }
    
}

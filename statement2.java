package profileschool;

public class newthing {
    public static void main(String[] args) {
        //initial value
        int semangka = 7, jambu = 3;
      
        //price
        double harga_semangka, harga_jambu;
        harga_semangka = 3000.2;
        harga_jambu = 2340.2;
      
        //total semangka and jambu
        double total;
        total=semangka+jambu;
      
        //update initial value
        jambu-=2; 
        semangka-=3;
      
        System.out.println("jumlah barang yang tersedia =" + semangka + "+" + jambu + "=" + total); //output total overall
        
        double bayar = (total*harga_jambu)+(total*harga_semangka); //total overall price
        System.out.println("total aset yang dimiliki  = Rp" + bayar); //output total overall price
    }
}

package programming;

public class anotherone {

    public static void main(String[] args) {
        int mawar = 10, melati = 2;
        double harga; //we use double for decimal number
        harga = 4500.5;
        double total, bayar;

        melati += 2; //you see "+="? that's call assignment operator. we use it to add 'melati' by 2
        int matahari = 5;

        total = mawar + melati + matahari;
        bayar = total * harga;

        boolean banding = mawar > melati; //we use boolean to check whether the variable value is correct or not
        boolean banding2 = mawar > matahari + melati;

        //display
        System.out.println("jumlah barang yang dibeli = " + mawar + "+" + melati + "=" + total); //19.0 not 19
        System.out.println("total yang dibayar  = Rp" + bayar); //same with this line
        System.out.println("Bunga Mawar > Bunga Melati = " + banding); //true
        System.out.println("pembelian bunga mawar lebih banyak dari matahari dan malati = " + banding2); //true
    }
}

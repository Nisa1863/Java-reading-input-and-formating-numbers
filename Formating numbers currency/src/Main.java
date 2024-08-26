import java.text.NumberFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* java da sayilarin nasil formatlanacagini
        gosterelim
         metin paketine sahibiz bu degiskene ad para birimi verelim//

        NumberFormat currency = new NumberFormat() ;

        // baska bir method var//

         */
        NumberFormat currency =NumberFormat.getCurrencyInstance();
        /* bir nesneden bir sayi aliyoruz ve bunu degiskende
        sakliyoruz
         */
        // bu nesnenin degerleri bicimlendirmek icin bir yontemi var//
        String result = currency.format(1234567.891);
        /* bu yontemin amaci para birimi olarark
        bicimlrndirmis bir dize temsilini dondurecek
        result degiskeninde de tsnimlsyslim
         */
        System.out.println(result);
        /* tam anlasilmadigini biliyorum bu konuda
        bilgiler topladikca ve sistemi tam cozunce
        ekleme yapacagimi bildirmek isterim
         */
    }
}
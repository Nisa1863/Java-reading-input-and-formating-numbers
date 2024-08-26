import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* java da kullanicidan gelen girdiyi
        nasil okuyacagimizi gosterecegim bir tarayici
        sinifimiz var arayici sinif kullanicidan
        giris almak icin kullanilan siniftir kullanicidan
        klavye dosya gb kaynaklardan veri okumak icin
        yeni bir tarayici nesnesi olusturalim
         */
        Scanner scanner =new Scanner(System.in);
        /*evet terminalde / cikti artik ordayiz peki
        oraya bir seyler yazip nasil okutturacagiz
         */

        /* calismaz nedne neden nextten sonra kullanacagimiz
      degiskeni yaziyoruz cunku kullanicidan istedigimiz
      gibi bir byte degeri almak istiyoruz

        byte age = scanner.next();
        String ad = scanner.next();

         */
        /* kullanici girecegi yasi nerden bilsin yasini
        sordugunu belirt*/
        System.out.println("what is your age :");
        byte age = scanner.nextByte();
        System.out.println("you are age = " + age);

        // string deniyelim kelime yazalim//
        /* ve string dedik ama mesela ben oraya Nisa nur
        dersem sadece nisayi alir ve cozumu nedir next.Line
        dir
            String name = scanner.next();
         */
        System.out.println("what is your name:");
        String name = scanner.next();
        System.out.println("you are name =" + name);
        /*

        System.out.println("what is your name:");
        String name = scanner.next();
        System.out.println("you are name =" + name); tek
        oluyorsa sorunsuz nisa nur yazabilir

        eger fazla bosluk var ve sadece satir sonu degil
        satir basinda da varsa ne yapmaliiz
        String name = scanner.nextLine().trim();
        yani sadece next line kullanmak yetmiyor
        trim de satir sonu bosluklari siliyor
         */

    }
}
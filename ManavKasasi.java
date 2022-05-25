import java.util.Scanner;
public class ManavKasasi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;
        int armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        double sonuc=0;

        System.out.print("Armut kac kilo? ");
        armutKg=inp.nextInt();
        System.out.print("Elma kac kilo? ");
        elmaKg=inp.nextInt();
        System.out.print("Domates kac kilo? ");
        domatesKg=inp.nextInt();
        System.out.print("Muz kac kilo? ");
        muzKg=inp.nextInt();
        System.out.print("Patlıcan kac kilo? ");
        patlicanKg=inp.nextInt();

        if (armutKg>0)
            sonuc+=(armut*armutKg);
        if (elmaKg>0)
            sonuc+=(elma*elmaKg);
        if (domatesKg>0)
            sonuc+=(domates*domatesKg);
        if (muzKg>0)
            sonuc+=(muz*muzKg);
        if (patlicanKg>0)
            sonuc+=(patlican*patlicanKg);

        System.out.println("Toplam Tutar: "+sonuc);
    }
}

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int iloscRuchow = 0;
        PomocnikGry pomocnik = new PomocnikGry();
        ProstyPortal prostyPortal = new ProstyPortal();
        ArrayList <Integer> polozenia = new ArrayList<>();
        String wynik;
        String wybranePole;
        boolean czyIstnieje = true;

        for (int i=0;i<3;i++){
            if (i==0){
                polozenia.add((int) (Math.random() * 5));
            } else {
                polozenia.add(polozenia.get(i - 1) + 1);
            }
        }

        for (Integer pol: polozenia) {
            System.out.println(pol);
        }

        prostyPortal.setPolaPolozenia(polozenia);
        while (czyIstnieje){

            wybranePole = pomocnik.pobierzDaneWejsciowe();
            wynik = prostyPortal.sprawdz(wybranePole);
            System.out.println(wynik);
            iloscRuchow++;
            if (wynik.equals("zatopiony")){
                czyIstnieje = false;
                System.out.println(iloscRuchow+ "ruchow");
            }
        }

    }
}

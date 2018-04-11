public class Main {

    public static void main(String[] args) {
        //poprawic blad z podaniem tych samych liczb!! -  flaga true/false?!
        int iloscRuchow = 0;
        PomocnikGry pomocnik = new PomocnikGry();
        ProstyPortal prostyPortal = new ProstyPortal();
        int[] polozenia = new int[3];
        String wynik;
        String wybranePole;
        boolean czyIstnieje = true;

        for (int i=0;i<polozenia.length;i++){
            if (i==0){
                polozenia[i] = (int)(Math.random()*5);
            } else {
                polozenia[i] = polozenia[i-1]+1;
            }
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

        //System.out.println("Laczna ilosc ruchow: "+iloscRuchow);

        /*ProstyPortal prostyPortal = new ProstyPortal();
        int[] polozenia = {2, 3, 4};
        prostyPortal.setPolaPolozenia(polozenia);

        String wybranePole = "2";

        String wynik = prostyPortal.sprawdz(wybranePole);

        String wynikTestu = "niepowodzenie";
        if (wynik.equals("trafiony")) {
            wynikTestu = "zakonczony pomyslnie";
        }
        System.out.println(wynikTestu);*/


    }
}

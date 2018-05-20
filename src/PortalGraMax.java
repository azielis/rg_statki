import java.util.ArrayList;

public class PortalGraMax {
    PomocnikGry pomocnikGry = new PomocnikGry();
    ArrayList <Portal> listaPortali = new ArrayList<>();
    int iloscRuchow = 0;

    void przygotujGre(){
        Portal onet = new Portal();
        onet.setNazwa("Onet.pl");
        Portal wykop = new Portal();
        wykop.setNazwa("Wykop.pl");
        Portal fb = new Portal();
        fb.setNazwa("facebook.pl");

        listaPortali.add(onet);
        listaPortali.add(wykop);
        listaPortali.add(fb);

        System.out.println("Twoim celem jest zatopienie trzech portali.");

        for (Portal portal:listaPortali){
            ArrayList<String> nowePolozenie = pomocnikGry.rozmieszczPortal(3);
            portal.setPolaPolozenia(nowePolozenie);
        }

    }

    void rozpocznijGre() {
        while (!listaPortali.isEmpty()){
            String ruch = pomocnikGry.pobierzDaneWejsciowe("Podaj pole");
            sprawdzRuchGracza(ruch);
        }
        zakonczGre();
    }

    void sprawdzRuchGracza(String ruch){
        iloscRuchow++;
        String wynik = "pudlo";
        for (Portal portal:listaPortali) {
           wynik = portal.sprawdz(ruch);
            if (wynik.equals("trafiony")){
                break;
            }
           if (wynik.equals("zatopiony")) {
               listaPortali.remove(portal);
               break;
           }
        }
        System.out.println(wynik.toUpperCase());

    }

    void zakonczGre(){
        System.out.println("Konec gry! Liczba ruchow: "+iloscRuchow);

        if (iloscRuchow <= 18) {
            System.out.println("Sprawnie wszysko zatopiles!!!");
        }
        else {
            System.out.println("Bardzo kiepsko!!");
        }
    }

    public static void main(String[] args) {
        PortalGraMax portalGraMax = new PortalGraMax();
        portalGraMax.przygotujGre();
        portalGraMax.rozpocznijGre();
    }
}

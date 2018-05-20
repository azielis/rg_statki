import java.util.ArrayList;

public class Portal {

    private String nazwa;
    private ArrayList<Integer> polaPolozenia;

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    void setPolaPolozenia(ArrayList<Integer> polaPolozenia) {
        this.polaPolozenia = polaPolozenia;
    }

    String sprawdz(String ruch) {

        String wynik = "pudlo";
        int indeks = polaPolozenia.indexOf(ruch);

        if (indeks >= 0) {
            polaPolozenia.remove(indeks);
            if (polaPolozenia.isEmpty()) {
                wynik = "zatopiony";
                System.out.println("Zatopiles portal o nazwie: " + nazwa);
            } else {
                wynik = "trafiony";
            }
        }
        return wynik;
    }
}

import java.util.ArrayList;

public class ProstyPortal {
    private ArrayList<Integer> polaPolozenia;
    private int iloscTrafien;

    public ArrayList<Integer> getPolaPolozenia() {
        return polaPolozenia;
    }

    public int getIloscTrafien() {
        return iloscTrafien;
    }

    void setPolaPolozenia(ArrayList<Integer> polaPolozenia) {
        this.polaPolozenia = polaPolozenia;
    }

    public void setIloscTrafien(int iloscTrafien) {
        this.iloscTrafien = iloscTrafien;
    }


    String sprawdz (String stringPole){
        int strzal = Integer.parseInt(stringPole);
        String wynik = "pudlo";
        for (Integer pole : polaPolozenia){
            if (pole.equals(strzal) ){
                polaPolozenia.remove(pole);
                wynik = "trafiony";
                iloscTrafien++;
                break;
            }
        }
        if (polaPolozenia.isEmpty()) {
            wynik = "zatopiony";
        }
        return wynik;
    }
}

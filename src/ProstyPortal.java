public class ProstyPortal {
    private int [] polaPolozenia;
    private int iloscTrafien;

    public int[] getPolaPolozenia() {
        return polaPolozenia;
    }

    public int getIloscTrafien() {
        return iloscTrafien;
    }

    void setPolaPolozenia(int[] polaPolozenia) {
        this.polaPolozenia = polaPolozenia;
    }

    public void setIloscTrafien(int iloscTrafien) {
        this.iloscTrafien = iloscTrafien;
    }


    String sprawdz (String stringPole){
        int strzal = Integer.parseInt(stringPole);
        String wynik = "pudlo";
        for (int pole : polaPolozenia){
            if (pole == strzal){
                wynik = "trafiony";
                iloscTrafien++;
                break;
            }
        }
        if (iloscTrafien == polaPolozenia.length) {
            wynik = "zatopiony";
        }
        return wynik;
    }
}

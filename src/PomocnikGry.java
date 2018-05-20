import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class PomocnikGry {
    public static final String alfabet = "abcdefg";
    private int dlugoscPlanszy = 7;
    private int wielkoscPlanszy = 49;
    private int[] plansza = new int [wielkoscPlanszy];
    private int iloscPortali = 0;

    String pobierzDaneWejsciowe(String komunikat){
        String daneWejsciowe = null;
        System.out.print(komunikat+" ");

        try {
            BufferedReader sw = new BufferedReader(new InputStreamReader(System.in));
            daneWejsciowe = sw.readLine();
            if(daneWejsciowe.length() == 0) return null;

        }catch (IOException e){
            System.out.println("IO Exception: "+e);
        }
    return daneWejsciowe.toLowerCase();
    }

    public ArrayList rozmieszczPortal (int wielkoscPortalu){
        ArrayList<String> zajetePola = new ArrayList<String>();
        String []wspolrzedneLnc = new String[wielkoscPortalu];
        String pomoc = null;
        int [] wspolrzedne = new int[wielkoscPortalu];
        int prob = 0;
        boolean powodzenie = false;
        int polozenie =0;

        iloscPortali++;
        int inkr =1;
        if ((iloscPortali%2)==1){
            inkr = dlugoscPlanszy;
        }

        while (!powodzenie & prob++ <200){
            polozenie = (int) (Math.random()*wielkoscPlanszy);
            System.out.print(" sprawdz "+polozenie);
            int x =0;
            powodzenie = true;

            while (powodzenie && x <wielkoscPortalu){
                if (plansza[polozenie] ==0){
                    wspolrzedne[x++] = polozenie;
                    polozenie += inkr;
                    if (polozenie>=wielkoscPlanszy){
                        powodzenie = false;
                    }

                    if (x>0 & (polozenie%dlugoscPlanszy ==0)){
                        powodzenie = false;
                    }
                } else {
                    System.out.println(" juz zajete " + polozenie);
                    powodzenie = false;
                }
            }
        }

        int x =0;
        int wiersz = 0;
        int kolumna = 0;

        while (x<wielkoscPortalu){
            plansza[wspolrzedne[x]] = 1;
            wiersz = wspolrzedne[x]/dlugoscPlanszy;
            kolumna = wspolrzedne[x]%dlugoscPlanszy;
            pomoc = String.valueOf(alfabet.charAt(kolumna));
            zajetePola.add(pomoc.concat(Integer.toString(wiersz)));
            x++;
            System.out.println(" wspolrzedne "+x+ " = " + zajetePola.get(x-1));
        }
        return zajetePola;
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PomocnikGry {
    String pobierzDaneWejsciowe(){
        String wierszWej = null;
        System.out.print("Podaj liczbe" + " ");
        try {
            BufferedReader sw = new BufferedReader(new InputStreamReader(System.in));
            wierszWej = sw.readLine();
            if(wierszWej.length() == 0) return null;

        }catch (IOException e){
            System.out.println("IO Exception: "+e);
        }
    return wierszWej;
    }
}


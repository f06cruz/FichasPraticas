package teste;

import java.io.File;
import java.io.FileNotFoundException;

import static teste.bibliotecaAdmin.*;
import static teste.funcoesGlobais.*;

public class inicio {
    public static void main(String[] args) throws FileNotFoundException {
        String[][] bilhetes = transformarFileMatriz(new File("files/Festival_Bilhetes.csv"),";",false);
        melhorFes(bilhetes);

    }
}

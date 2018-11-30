package WriteFiles;

import DAO.Caminhos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteFiles {

    File arquivo = new File("C:\\Users\\gioto\\Documents\\NetBeansProjects\\TDE\\src\\doc\\");

    public void gravarText(String Texto) throws FileNotFoundException {
        int aux = 0;
        File[] arquivos = arquivo.listFiles();

        if (arquivos != null) {
            int length = arquivos.length;
            for (int i = 0; i < length; ++i) {
                File f = arquivos[i];
                if (f.isFile()) {
                    aux++;
                }
            }

        }
        aux = aux + 1;
        FileOutputStream fos = new FileOutputStream("C:\\Users\\gioto\\Documents\\NetBeansProjects\\TDE\\src\\doc\\doc" + aux + ".txt", true);
        PrintStream ps = new PrintStream(fos);
        ps.print(Texto);
    }
    Caminhos c = new Caminhos();
    //String caminho = c.getCaminho();
    //String nomeDoArquivo = c.getNomeArquivo();
    //private static String c.caminho, nomeDoArquivo;

    public void ler(String caminho, String nomeDoArquivo, String texto) throws FileNotFoundException {

    }

    public void modificar(String Texto) throws FileNotFoundException {

    }
}

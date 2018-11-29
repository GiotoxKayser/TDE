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
    int aux = 0;
    File arquivo = new File("C:\\Users\\gioto\\Documents\\NetBeansProjects\\TDE\\src\\doc\\");
    public void gravarText(String Texto) throws FileNotFoundException {
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
        
        FileOutputStream fos = new FileOutputStream("C:\\Users\\gioto\\Documents\\NetBeansProjects\\TDE\\src\\doc\\doc"+ aux +".txt", true);
        PrintStream ps = new PrintStream(fos);
        ps.print(Texto);
	}
    Caminhos c = new Caminhos();
    //String caminho = c.getCaminho();
    //String nomeDoArquivo = c.getNomeArquivo();
    //private static String c.caminho, nomeDoArquivo;
    private static BufferedReader reader;
    public void ler(String caminho, String nomeDoArquivo, String texto) throws FileNotFoundException  {
          try {
            InputStreamReader arquivoInStream;
            FileInputStream entradaInStream;
            entradaInStream = new FileInputStream(caminho + nomeDoArquivo);
            arquivoInStream = new InputStreamReader(entradaInStream);
            reader = new BufferedReader(arquivoInStream);
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
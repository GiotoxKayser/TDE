package WriteFiles;

import DAO.Caminhos;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
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
}
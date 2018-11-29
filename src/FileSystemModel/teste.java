package FileSystemModel;
import java.io.*;

public class teste {
    public static void main(String[] args) {
		File arquivo = new File("C:\\Users\\gioto\\Documents\\NetBeansProjects\\TDE\\src\\doc\\");
		// Carrega todos os arquivos em um vetor
		File[] arquivos = arquivo.listFiles();	
		int aux = 0;
		// Se há arquivos, entra nesta rotina
		if (arquivos != null) {
				int length = arquivos.length;
				for (int i = 0; i < length; ++i) {
					File f = arquivos[i];
					if (f.isFile()) {
						aux++;
					}
				}
				System.out.println("Quantidade de Arquivos: "+ aux);
		}
	}
    
}

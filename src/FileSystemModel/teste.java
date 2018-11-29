/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileSystemModel;
import java.io.*;
/**
 *
 * @author gioto
 */
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

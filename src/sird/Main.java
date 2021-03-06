package sird;

import DAO.Caminhos;
import dicionario.Dicionario;
import indexador.Indexador;
import java.io.File;
import static java.lang.System.out;
import recuperador.Recuperador;

public class Main {
    
    public static void main(String[] args) {
        String [] bd = {"doc1.txt","doc2.txt","doc3.txt",
                        "doc4.txt","doc5.txt","doc6.txt"};
        
        String pasta = "C:\\Users\\gioto\\Documents\\NetBeansProjects\\TDE\\src\\doc\\";
        //String pasta = "C:\\Users\\PROJETO\\Documents\\SIRD\\src\\doc\\" ;
        String separador = " ";
        
        Dicionario dico = new Dicionario();
        dico.montar(pasta, bd, separador);
        dico.mostrar();
        
        Indexador idx = new Indexador(dico);
        idx.indexa(pasta, bd, separador);  
        
        int [][] TF = idx.getTF();
        out.println("\nTF");
        idx.mostrarMatriz(TF);
        double [] DF = idx.getDF();
        out.print("\n\nDF");
        idx.mostrarVetor(DF);
        double [] IDF = idx.getIDF();
        out.print("\n\nIDF");
        idx.mostrarVetor(IDF);
        double [][] TFIDF = idx.getTFIDF();
        out.print("\n\nTFIDF");
        idx.mostrarMatriz(TFIDF);
        
        // continuar com as funcionalidades para 
        // encontrar o documento foco
        String consulta = "aa cc";
        
        Recuperador r = new Recuperador(separador, dico, IDF);
        double [] cTFIDF = r.tfidf(consulta);
        out.print("\n\nTFIDF da consulta");
        r.mostrarVetor(cTFIDF);  
        
    }
    public static void comeco() {
           Caminhos c = new Caminhos();
        File file = new File("C:\\Users\\gioto\\Documents\\NetBeansProjects\\TDE\\src\\doc\\");
        File[] arquivos = file.listFiles();   
        int i;
        String [] bd = new String[arquivos.length];
        for (i= 0; i < arquivos.length; i++) {
            bd[i] = (arquivos[i].getName());
        }
        
        String pasta = "C:\\Users\\gioto\\Documents\\NetBeansProjects\\TDE\\src\\doc\\";
        //String pasta = "C:\\Users\\PROJETO\\Documents\\SIRD\\src\\doc\\" ;
        String separador = " ";
        
        Dicionario dico = new Dicionario();
        dico.montar(pasta, bd, separador);
        dico.mostrar();
        
        Indexador idx = new Indexador(dico);
        idx.indexa(pasta, bd, separador);  
        
        int [][] TF = idx.getTF();
        out.println("\nTF");
        idx.mostrarMatriz(TF);
        double [] DF = idx.getDF();
        out.print("\n\nDF");
        idx.mostrarVetor(DF);
        double [] IDF = idx.getIDF();
        out.print("\n\nIDF");
        idx.mostrarVetor(IDF);
        double [][] TFIDF = idx.getTFIDF();
        out.print("\n\nTFIDF");
        idx.mostrarMatriz(TFIDF);
        
        // continuar com as funcionalidades para 
        // encontrar o documento foco
        String consulta = "aa cc";
        
        Recuperador r = new Recuperador(separador, dico, IDF);
        double [] cTFIDF = r.tfidf(consulta);
        out.print("\n\nTFIDF da consulta");
        r.mostrarVetor(cTFIDF);  
        
    }
}

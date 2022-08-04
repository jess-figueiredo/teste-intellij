package br.com.dio;

import br.com.dio.model.Gato;
import jdk.swing.interop.SwingInterOpUtils;

public class PrimeiroPrograma {
        public static void main(String[] args) {//crtl+shiftq+f10
            Gato gato = new Gato();

            System.out.println(gato);

            Livro livro1 = new Livro("O problema das mentes fechadas", 309);
            System.out.println(livro1);
        }
}

class Livro {
    private String titulo;
    private Integer numPage;

    //contrutor

    public Livro(String titulo, Integer numPage) {
        this.titulo = titulo;
        this.numPage = numPage;
    }

    //getter nd setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumPage() {
        return numPage;
    }

    public void setNumPage(Integer numPage) {
        this.numPage = numPage;
    }
}

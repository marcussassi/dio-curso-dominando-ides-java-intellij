package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /* int a = 5;
         int b = 6;
        System.out.println("Hello, Dio & BancoPan " + (a+b));*/

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("o problema dos 3 corpos", 300);
        System.out.println(livro1);
    }

}

class Livro {
    public String nome;
    public Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}



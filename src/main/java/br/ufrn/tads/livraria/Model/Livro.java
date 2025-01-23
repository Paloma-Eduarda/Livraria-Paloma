package br.ufrn.tads.livraria.Model;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private String genero;
    private int ano;

    public Livro() {}
    public Livro(int id, int ano, String autor, String editora, String genero, String titulo) {
        this.id = id;
        this.ano = ano;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "ano=" + ano +
                ", id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", editora=" + editora +
                ", genero='" + genero + '\'' +
                '}';
    }
}

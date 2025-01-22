package br.ufrn.tads.livraria.Model;

public class Livro {
    private int id;
    private String titulo;
    private Autor autor;
    private Editora editora;
    private int isbn;
    private String genero;
    private int ano;

    public Livro() {}
    public Livro(int id, int ano, Autor autor, Editora editora, String genero, String titulo, int isbn) {
        this.id = id;
        this.ano = ano;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
        this.titulo = titulo;
        this.isbn = isbn;
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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
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
                ", isbn=" + isbn +
                ", genero='" + genero + '\'' +
                '}';
    }
}

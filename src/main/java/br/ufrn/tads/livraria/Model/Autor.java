package br.ufrn.tads.livraria.Model;

public class Autor {

    private int id;
    private String autor;

    public Autor() {}

    public Autor(String autor, int id) {
        this.autor = autor;
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "autor='" + autor + '\'' +
                ", id=" + id +
                '}';
    }
}

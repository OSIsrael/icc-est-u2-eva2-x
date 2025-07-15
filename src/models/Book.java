package models;

public class Book implements Comparable<Book>{
    private String titulo;
    private String autor;
    private int anio;

    public Book() {
    }
    
    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    

    @Override
    public String toString() {
        return "[Titulo=" + titulo + ", Autor=" + autor + ", Anio=" + anio + "]\n";
    }
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + anio;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (anio != other.anio)
            return false;
        return true;
    }

    @Override
    public int compareTo(Book o) {
        int cmp=o.titulo.compareTo(this.titulo);
        if (cmp!=0) {
            return cmp;
        }
        cmp=this.autor.compareTo(o.autor);
        if (cmp!=0) {
            return cmp;
        }
        return Integer.compare(this.anio, o.anio);
    
      
      
    }
    
    
}

package entities;

public class Livro {
        private String titulo;
        private String nomeAutor;
        private String idioma;
        private String genero;

        public Livro() {
        }

        public Livro(String titulo, String nomeAutor, String genero, String idioma) {
            this.titulo = titulo;
            this.nomeAutor = nomeAutor;
            this.genero = genero;
            this.idioma = idioma;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getNomeAutor() {
            return nomeAutor;
        }

        public void setNomeAutor(String nomeAutor) {
            this.nomeAutor = nomeAutor;
        }

        public String getIdioma() {
            return idioma;
        }

        public void setIdioma(String idioma) {
            this.idioma = idioma;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }
    }



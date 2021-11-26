package dio;

import model.gato;

public class teste8 {
    public static void main(String[] args) {
        int a = 9;
        gato Gato = new gato();
        Gato.setNome("lucas");
        Gato.setCor("preto");
        Gato.setIdade(21);
        System.out.println("Hello word " + a + " " + Gato);
        livros livro = new livros();
        System.out.println(livro);
    }
    static class livros{
        public livros(String nome, Integer numPagians) {
            this.nome = nome;
            this.numPagians = numPagians;
        }

        private String nome;
        private Integer numPagians;

        public livros() {

        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumPagians() {
            return numPagians;
        }

        public void setNumPagians(Integer numPagians) {
            this.numPagians = numPagians;
        }

        @Override
        public String toString() {
            return "livros{" +
                    "nome='" + nome + '\'' +
                    ", numPagians=" + numPagians +
                    '}';
        }
    }
}

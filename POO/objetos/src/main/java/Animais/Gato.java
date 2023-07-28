
package Animais;

public class Gato extends Animais {
    static int numeroDeGatos;

    public Gato(String nome, String cor, double altura, int peso, boolean akumaNoMi, String estado) {
        super(nome, cor, altura, peso, akumaNoMi, estado);
    }

    @Override
    public String toString() {
        return "Gato{" + "nome=" + nome + ", cor=" + cor + ", altura=" + altura + ", peso=" + peso + ", estado=" + estado + '}';
    }
    
    
    
}

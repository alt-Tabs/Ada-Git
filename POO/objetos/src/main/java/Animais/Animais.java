
package Animais;


abstract public class Animais {
    static int total;
    protected String nome;
    protected String cor;
    protected double altura;
    protected int peso;
    protected boolean akumaNoMi;
    protected String estado;

    public Animais(String nome, String cor, double altura, int peso, boolean akumaNoMi, String estado) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.akumaNoMi = akumaNoMi;
        this.estado = estado;
    }

        
    protected void comer(){}
    
    void dormir() {}
    
    protected boolean isAkumaNoMi() {
        return akumaNoMi;
    }
    
    public boolean possuiAkumaNoMi(String acao) {
        if (acao.equals("sim")) {
            this.akumaNoMi = true;
            
        }
        return isAkumaNoMi();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    


    
}

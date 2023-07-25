package Animais;

public class Cachorro {
    private String nome;
    private String cor;
    private double altura;
    private int peso;
    private boolean akumaNoMi;
    private String estado;

    public Cachorro(String nome, String cor, double altura, int peso, boolean akumaNoMi, String estado) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.akumaNoMi = akumaNoMi;
        this.estado = estado;
    }
    public Cachorro(){}; 
    
    public String getNome(){
        return this.nome;
    }
    public void comer(){}
    
    public void latir(){
        System.out.println("Mestre ODENNN");
    }
    
    public String pegar(){
        return "Espada";
    }
    
    public boolean possuiAkumaNoMi (String acao){
        if(acao.equals("sim")){
            this.setAkumaNoMi(true);
        }
        return isAkumaNoMi();
    }
    
    public String atacar(String origemInimigo){
        switch(origemInimigo){
            case "East Blue": this.setEstado("Espadachim");break;
            case "Alabasta": this.setEstado("Electro");   break;
            default: this.setEstado("Atento");break;
        }return getEstado();
        
        
//        if(origemInimigo.equals("East Blue")){
//            this.estado = "Espadachim";
//        } else if (origemInimigo.equals("Alabasta")){
//            this.estado = "Electro";
//        }return estado;
        }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the akumaNoMi
     */
    public boolean isAkumaNoMi() {
        return akumaNoMi;
    }

    /**
     * @param akumaNoMi the akumaNoMi to set
     */
    public void setAkumaNoMi(boolean akumaNoMi) {
        this.akumaNoMi = akumaNoMi;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}

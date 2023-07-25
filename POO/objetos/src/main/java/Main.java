
import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Rex", "Azul",1.70, 8, false, "wano");
        
        cachorro1.setNome("Inuarashi");
        cachorro1.setCor("Caramelo");
        cachorro1.setAltura(1.77);
        cachorro1.setPeso(200);
        
        cachorro2.getNome();
        cachorro2.getAltura();
        
        //System.out.println(cachorro1);
        cachorro1.latir();
        System.out.println(cachorro1.pegar());
        System.out.println("Este usuário comeu alguma fruta do diabo? "
                +cachorro1.possuiAkumaNoMi("Não"));
        System.out.println("Inuarashi atacará em modo "+ cachorro1.atacar("Alabasta"));
        
        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());
    }
    
}

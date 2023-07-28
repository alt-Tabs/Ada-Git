import Animais.Animais;
import Animais.Cachorro;
import Animais.Gato;
import Loja.Petshop;

public class Main {
    public static void main(String[] args) {
        
        Cachorro cachorro1 = new Cachorro("Inuarashi", "Caramelo",1.77,200,false, "Zou");;
//        
//        System.out.println(cachorro1.getTotal());
//        
        Cachorro cachorro2 = new Cachorro("Rex", "Azul",1.70, 8, false, "Dressrosa");
//
//        System.out.println(cachorro1.getTotal());
//
//        cachorro2.getNome();
//        cachorro2.getAltura();
//        
//        //System.out.println(cachorro1);
//        cachorro1.latir();
//        System.out.println(cachorro1.pegar());
//        System.out.println("Este usuário comeu alguma fruta do diabo? "
//                +cachorro1.possuiAkumaNoMi("Não"));
//        System.out.println("Inuarashi atacará em modo "+ cachorro1.atacar("Alabasta"));
//        
//        System.out.println(cachorro1.toString());
//        System.out.println(cachorro2.toString());
//        
        Animais gato = new Gato("Nekomamushi","Amarelo",1.70, 200, false,"Zou");
//        
//        System.out.println(gato);

        Petshop petshop = new Petshop();
        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstado());
        
        petshop.deixarNoHotel(gato);
        System.out.println(gato.getEstado());

        petshop.tosar(cachorro2);
        System.out.println(cachorro2.getEstado());

                  
        
    }
    
}

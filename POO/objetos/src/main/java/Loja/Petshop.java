
package Loja;
import Animais.Animais;
import Animais.Cachorro;

public class Petshop {
    
    public void darBanho(Animais animal){
        animal.setEstado("Limpo");
         
    }
    
    public void tosar(Cachorro cachorro){
        cachorro.setEstado("Tosado");
    }
    
    public void deixarNoHotel(Animais animal){
        animal.setEstado("Saudades");
    }
    
    
}



package herencia.EJercicios.Ejercicio1;


public class MainHerenciaEj1 {

    
    public static void main(String[] args) {
        Animal perro = new Perro ("Stich","Carne",15,"Doberman");
        
        perro.Alimentarse();
        
        Perro perro1 = new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro1.Alimentarse();
        
       Animal gato = new Gato("Pelusa","Galletas",15,"Siames");
       gato.Alimentarse();
       
       Animal caballo = new Caballo ("Spark","Pasto",25,"Fino");
       caballo.Alimentarse();
       
    }

}

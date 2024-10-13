package automovil;

public class Automovil {
      private String marca;
    private String modelo;
    private int año;
   
    public Automovil(String marca, String modelo, int año){
         this.marca = marca;
         this.modelo = modelo;
         this.año = año;
     }
    
    public void encender(){
        System.out.println("El automovil esta encendido. ");
        
    }
    public void acelerar(int velocidad){
        System.out.println("El automovil esta acelerado a "+velocidad+ "Km/h.");
    }
    public void frenar(){
        System.out.println("El automovil esta frenando. ");
    }
    public void mostrarInfo(){
        System.out.println("Marca: "+marca+"Modelo: "+modelo+"Año: "+año);
    }
    public static void main(String[]args){
       Automovil auto1 = new Automovil("Toyota","TXL",2022) ;
       Automovil auto2 = new Automovil("Ford", "Mustang", 2021);

        auto1.mostrarInfo();
        auto1.encender();
        auto1.acelerar(50);

       
       auto2.mostrarInfo();
       auto2.encender();
       auto2.acelerar(150);
    }
}


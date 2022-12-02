package Ejercicios;


public class Main {
    public static void main(String[] args) {
      
        Perro perro = new Perro();

       

        perro.establece_color("Blanco y negro");
        perro.establece_largo("Largo");
        perro.establece_chip(1232324);

       

        System.out.println(perro.color_pelo());
        System.out.println(perro.largo_pelo());
        System.out.println(perro.numero_chip());


     

        Perro Pastor_aleman = new Perro();
        Perro Labrador = new Perro();
        Perro Caniche = new Perro();

        Perro[]mascotas = {Pastor_aleman,Labrador,Caniche};

      
        Pastor_aleman.establece_peso(40);
        Pastor_aleman.establece_altura(78);
        System.out.println(Pastor_aleman.peso()+ " para el Pastor aleman");
        System.out.println(Pastor_aleman.alto()+ " para el Pastor aleman");

     
        Labrador.establece_peso(28);
        Labrador.establece_altura(68);
        System.out.println(Labrador.peso() + " para el Labrador");
        System.out.println(Labrador.alto() + " para el Labrador");

      

        Caniche.establece_peso(8);
        Caniche.establece_altura(40);
        System.out.println(Caniche.peso()+ " para el Caniche");
        System.out.println(Caniche.alto()+ " para el Caniche");

    
            System.out.println("El Pastor Aleman hace " + Pastor_aleman.ladrar(Pastor_aleman.establece_peso(40),Pastor_aleman.establece_altura(78)));
            System.out.println("El labrador hace " + Labrador.ladrar(Labrador.establece_peso(28),Labrador.establece_altura(68)));
            System.out.println("El caniche hace " + Caniche.ladrar(Caniche.establece_peso(8),Caniche.establece_altura(40)));
        }





















    }

 }
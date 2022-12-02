package Ejercicios;




public class Perro {



    private String pelo="Corto";
    private String color="Marron";
    private int chip=52542;
    private int peso;
    private int altura;


    public String color_pelo(){
        return "El color del pelo es "+ color;
    }

    public String largo_pelo(){
        return "El tipo de pelo es "+ pelo;
    }

    public String numero_chip(){
        return "El numero de identificación es: "+ chip;
    }

    

    public void establece_color(String valor_color){
        color=valor_color;
    }

    public void establece_largo(String valor_pelo){
        pelo=valor_pelo;
    }

    public void establece_chip(int valor_chip){
        chip= valor_chip;
    }


    public String peso(){
        return "El peso es "+ peso + " Kg";
    }
    public String alto(){
        return "El alto es "+ altura + " cm";
    }

  
    
    public int establece_altura (int valor_altura){
        altura = valor_altura;
        return altura;
    }
public int establece_peso (int valor_peso){
       peso = valor_peso;
       return peso;
    }


    public String ladrar(int num1, int num2){
        String ladrido="";
     
        peso = num1;
        altura = num2;

        if(peso>35 && altura>70){
            ladrido = "waw,waw,waw";
        } else if (peso>15 && altura>50) {
            ladrido ="Guauuu,guauuu";
        } else if (peso<=15 && altura<=50) {
            ladrido="Auuuuuuu";
        }
        return ladrido;
    }


}

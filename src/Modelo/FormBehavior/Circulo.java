package Modelo.FormBehavior;

import Modelo.ColorBehavior.Color;

public class Circulo implements Forma{
    public Color color;
    
    public Circulo(Color color){
        this.color = color;
    }

    //*Metodo para pintar la forma */
    @Override
    public void dibujar(){
        System.out.println("Circulo");
        color.aplicarColor();
    }

    //*Metodo para cambiar el color de la forma */
    @Override
    public void setColor(Color color) {
        this.color = color;
        System.out.println("Color cambiado");
    }
}

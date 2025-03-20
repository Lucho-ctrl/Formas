package Modelo.FormBehavior;

import Modelo.ColorBehavior.Color;

public class Cuadrado implements Forma{ 
    public Color color;
    
    public Cuadrado(Color color){
        this.color = color;
    }
    
    //*Metodo para pintar la forma */
    @Override
    public void dibujar(){
        System.out.println("Cuadrado");
        color.aplicarColor();
    }

    //*Metodo para cambiar el color de la forma */
    @Override
    public void setColor(Color color) {
        this.color = color;
        System.out.println("Color cambiado");
    }
}

package Modelo.FormBehavior;

import Modelo.ColorBehavior.Color;

public interface Forma {
    //*Metodo para pintar la forma */
    public void dibujar();
    //*Metodo para cambiar el color de la forma */
    public void setColor(Color color);
}

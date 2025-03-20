package Control;

import Modelo.ColorBehavior.Color;
import Modelo.ColorBehavior.Green;
import Modelo.ColorBehavior.Red;
import Modelo.FormBehavior.Circulo;
import Modelo.FormBehavior.Cuadrado;
import Modelo.FormBehavior.Forma;

public class Control {
    public Forma forma;
    public Color color;

    public Control (){
        pintarCirculo();
        System.out.println();
        System.out.println("Cambio de figura");
        System.out.println();
        pintarCuadrado();
    }

    public void pintarCirculo(){
        color = new Red();
        forma = new Circulo(color);
        forma.dibujar();
        
        color = new Green();
        System.out.println();
        forma.setColor(color);

        forma.dibujar();
    }

    public void pintarCuadrado(){
        color = new Green();
        forma = new Cuadrado(color);
        forma.dibujar();

        color = new Red();
        System.out.println();
        forma.setColor(color);

        forma.dibujar();
    }
}

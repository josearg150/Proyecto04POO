/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_18131273_proyecto_04;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.color.ColorSpace;

/**
 *
 * @author Jose angel
 */
class Circulo {
    //Atributos
    private String identificador;//Identificador romano
    private int color;//Color del relleno del circulo
    private int tamanio;//Tamaño
    private int x;//Coordenada x
    private int y;//Coordenada y
    
    //Constructor por defecto
    public Circulo(){
        identificador = "NA";
        color = 1;
        tamanio = 100;
        x = 50;
        y = 10;
                
    }
    //Getters y setters
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    //Metodo para dibujar
    public void dibujar(Component c){
        Graphics dibujar = c.getGraphics();//Obtenemos los graficos para dibujar
        Color col = Color.white;//Inicializamos la variable
        switch(color){//Establecer el color escogido en base a los mostrados en el frame
            case 1: col = Color.red; break;
            case 2: col = Color.blue; break;
            case 3: col = Color.green; break;
            case 4: col = Color.yellow; break;
            case 5: col = Color.magenta; break;  
            case 6: col = Color.gray; break;
          
        }            
        
        dibujar.setColor(col);
        dibujar.fillOval(x, y, tamanio, tamanio);//Se dibuja el circulo relleno con el color, coordenadas y tamaño deseado
        dibujar.drawRoundRect(x, y, 50, 50, 30, 30);
        dibujar.setColor(Color.black);//Establecemos el color en negro para el identificador
        dibujar.setFont(new Font("Arial", Font.ITALIC,18));//Letra para identificador
        dibujar.drawString(identificador, x+(tamanio/2-9), y+(tamanio/2));//Escribimos el identificador en el centro
    }
}

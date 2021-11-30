/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepattern;

/**
 *
 * @author MIHAN
 */
public class Rectangle extends Shape {
    Color color;
    public Rectangle(Color color){
        super(color);
        this.color = color;
      
    }
    @Override
    public String draw(){
        return "Rectangle is drawn "+ color.fillColor();
    }
}

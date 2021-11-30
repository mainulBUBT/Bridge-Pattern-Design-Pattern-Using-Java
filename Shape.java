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
public abstract class Shape {
    protected Color color;
    
    public Shape(Color color){
        this.color = color;
    }
    public abstract String draw();
}

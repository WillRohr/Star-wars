/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star.wars;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 805598
 */
public class Characters {
     //Fields (Variables)
    private int x;
    private int y;
    private int dx;
    private int dy;
    private Color color;
    private int size; 
    String name;
    
    //Constructor
    public Characters() {
        x = 0;
        y = 0;
        dx = 0;
        dy = 0;
        color = Color.BLUE;
        size = 20;
        name = "enemy";
    }
     public Characters(int x, int y, Color color, int size, String name) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.size = 20;
        this.name = "name";
        dx = 0;
        dy = 0;
    }
    
    //Getters 
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Color getColor() {
        return color;
    }
    public int getSize() {
        return size;
    }
    public String getName() {
        return name;
    }
 
    
    //Setters
     public void setDX(int dx) {
        this.dx = dx;
    }
    
    public void setDY(int dy) {
        this.dy = dy;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setName(String name) {
        this.name = name;
    }
     
    
    
    
    //Public Methods
    public void draw (Graphics g) {
        g.setColor(color);
        g.fillRect (x,y,size,size);
    }
    public void kill() {
       
        grow();
    }
                           //1      -1
    public void move(int dx, int dy) {
    
        x +=dx * 3;
        y +=dy * 3;
    }
      public void update() {
        move(dx, dy);     
        
    }
          /**
     * Makes the character "bounce" and reverse direction on X axis 
     */
    public void reverseX() {
        //TODO Implement this method
        x += size; 
    }
    
    /**
     * Makes the character "bounce" and reverse direction on Y axis 
     */
    public void reverseY() {
        //TODO Implement this method
        x += size;
    }
    
    //Private Methods
    private void grow() { 
        
        //size = (int) (Math.random()*10) - 4 ;
        size *= 1.05;
    }
        
    }


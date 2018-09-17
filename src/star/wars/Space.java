/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star.wars;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author 805598
 */

public class Space extends JPanel {
   
    final int marginX;
    final int marginY;
    private Hero hero;
    private Enemy enemy;
    private Timer timer;
    
    public Space()  {
        super();
        
        marginX= 10;
        marginY= 10;
        hero = new Hero(600,480, Color.GREEN, 20, "Dude");
        enemy = new Enemy(50, 50, Color.RED, 20, "Enemy");
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 100);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
                
       g.setColor(Color.RED);
       g.setColor(Color.WHITE);
       drawStars(g);
       hero.draw(g);
       enemy.draw(g);
       //g.dispose();
}
    private class ScheduleTask extends TimerTask {
    
        @Override
        public void run() {
            
            hero.update();
            enemy.update();
            repaint();
}
    }
public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
         hero.setDX(1);
    }
    else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        hero.setDX(-1);
    }
    else if (e.getKeyCode() == KeyEvent.VK_UP) {
        hero.setDY(-1);
    }
    else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        hero.setDY(1);
    }
}

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            hero.setDX(0);
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            hero.setDX(0);
        if (e.getKeyCode() == KeyEvent.VK_UP)
            hero.setDY(0);
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            hero.setDY(0);
    }
    
public void drawStars (Graphics g) {
            int x = 0;
            int y = 0;
            for (int i = 0; i < 1000; i++) {
       x = (int) (Math.random() *3000)+ 1;
       y = (int) (Math.random() *960)+ 1;
       g.fillOval(x,y,3,3);
      
       System.out.println(x+" "+y);
       //if( x > 1280 || y > 720) {
           //  break;
           
          //}
        }
}
    
}
    

     
                   
    

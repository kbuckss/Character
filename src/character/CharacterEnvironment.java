/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Katherine
 */
class CharacterEnvironment extends Environment {
    
    private PatrickStarr patty;
    
    public CharacterEnvironment() {
        patty = new PatrickStarr(100, 100);
    }

    @Override
    public void initializeEnvironment() {
        
    }

    @Override
    public void timerTaskHandler() {
        
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
        
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
        
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (patty != null) {
            patty.draw(graphics);
        }
    }
    
}

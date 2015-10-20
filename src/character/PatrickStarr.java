
package character;

import java.awt.Graphics;

public class PatrickStarr {
    
    public PatrickStarr(int x, int y) {
        this.x = x;
        this.y = y;
    }   
    
    public void draw(Graphics graphics) {
        graphics.drawRect(x, y, 200, 200);
    }
    
    private int x;
    private int y;
    
}

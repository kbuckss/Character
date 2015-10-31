//WE ARE ACTUALLY DRAWING TWEETY BIRD, DO NOT LET THE NAME CONFUSE YOU IT IS TWEETY BIRD 100%
package character;

import java.awt.Color;
import java.awt.Graphics;

public class PatrickStarr {

    public PatrickStarr(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public void draw(Graphics graphics) {
        graphics.drawRect(x, y, width, height);

        //head
        graphics.drawRect(x, y, 200, 200);
        graphics.setColor(new Color(255, 200, 100));
        graphics.fillOval(x + (width * 93 / 400), y + (height * 93 / 400), 214, 214);
        graphics.setColor(new Color(255, 255, 0));
        graphics.fillOval(x + (width * 100 / 400), y + (height * 100 / 400), 200, 200);
        graphics.setColor(new Color(255, 200, 100));
        graphics.fillOval(x + (width * 100 / 400), y + (height * 260 / 400), 200, 70);
        graphics.setColor(new Color(255, 255, 0));
        graphics.fillOval(x + (width * 107 / 400), y + (height * 267 / 400), 186, 56);
        graphics.fillRect(x + (width * 120 / 400), y + (height * 260 / 400), 160, 20);

      //this is where I try to rotate things, but haven't actually done it
//      graphics.setColor(new Color(255, 200, 100));
//      graphics.fillOval(x + (width * 100 / 400), y + (height * 250 / 400), 30, 100);
//      graphics.setColor(new Color(255, 255, 0));
//      graphics.fillOval(x + (width * 100 / 400), y + (height * 250 / 400), 44, 114);
        
//        so the way this works. the number you're dividing by 400 is the height relative to the box which is (btw) an excellent landmark
//        the numbers at the end are the dimensions, but the reason you're doing it like this is so it can be scaled
//        excellent let's go
        
        //left eye
        graphics.setColor(Color.white);
        graphics.fillOval(x + (width * 140 / 400), y + (height * 175 / 400), 50, 100);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(x + (width * 140 / 400), y + (height * 175 / 400), 50, 100);
        graphics.setColor(new Color(0, 150, 255));
        graphics.fillOval(x + (width * 145 / 400), y + (height * 220 / 400), 40, 50);

        //right eye
        graphics.setColor(Color.white);
        graphics.fillOval(x + (width * 210 / 400), y + (height * 175 / 400), 50, 100);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(x + (width * 210 / 400), y + (height * 175 / 400), 50, 100);
        graphics.setColor(new Color(0, 150, 255));
        graphics.fillOval(x + (width * 215 / 400), y + (height * 220 / 400), 40, 50);

        //mouth
        graphics.setColor(new Color(250, 100, 0, 190));
        graphics.fillRect(x + (width * 190 / 400), y + (height * 280 / 400), 20, 20);
        
        //fun with arcs, possibly eyebrow 
        //(?) how does this WORK
        //what the F
        //UGH
        //??????????????????????????????????????????????????????????????????????????????????????????????????????????????
        //HOW DO I MAKE IT MOVE HOW DO ARCS WORK I AM STRUGGLING TO FIGURE THIS OUT
        //UYGUHGHSHGHhhhhhhhhhhhhhhhhhhh
        graphics.setColor(Color.black);
        graphics.drawArc(x + (width * 5 / 400), y + (height * 90 / 400), width, height, height, 8);
       
    }

    private int x;
    private int y;
    private int height;
    private int width;

}



class Snowflake {
     /** The sketch that the ball is inside */
     private Sketch s;
     /** the radius of the ball */
     private float radius;
     private float x;
     private float y;
     /** The number of pixels the ball moves right per frame */
     private float xSpeed;
     /** The number of pixels the ball moves down per frame */
     private float ySpeed;
     /** The color of the inside of the ball */
     private int fillColor;
     /** The color of the outside of the ball */
     private int borderColor;
 
     /** Same constructors as the ball ones */
     public Snowflake(Sketch sketch) {
         s = sketch;
         radius = 20;
         x = 100;
         y = 100;
         xSpeed = 2;
         ySpeed = -1;
         fillColor = s.color(255, 100, 100);
         borderColor = s.color(0, 0, 0);
     }
 
     /** Fully specified constructor to allow changes to size, position, speed */
     /** Does NOT allow changing color! Need to use setColors() for that. */
     public Snowflake(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
         this.s = sketch;
         this.radius = radius;
         this.x = x;
         this.y = y;
         this.xSpeed = xspeed;
         this.ySpeed = yspeed;
     }
 
     // Accessors (getters) go here
 
     public float getRadius() {
         return radius;
     }
 
     public float getDiameter() {
         return radius * 2;
     }
 
     public float getX() {
         return x;
     }
 
     public float getY() {
         return y;
     }
 
     // Setters that you need go here - by default, only colors
 
     public void setColors( int r, int g, int b) {
         fillColor = s.color( r, g, b);
     }
 
     /**
      * Moves the snowflake so that the next time it draws it will be in a different place
      * I used the ball code but made it so that instead of bouncing, upon reaching the bottom it goes back to the top
      */
 
      public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
        if (x > s.width - radius) {
            x=0;
        }
        if (y > s.height - radius) {
            y = 0;
        }
    }

  
/** just draws the flake of snow every frame*/
    public void draw() {
        s.line(x+radius,y,x-radius,y);
        s.line(x,y+radius,x,y-radius);
        s.line(x+radius*.707f,y+radius*.707f,x-radius*.707f,y-radius*.707f);
        s.line(x+radius*.707f,y-radius*.707f,x-radius*.707f,y+radius*.707f);
    }
}


    
class Ball {

    /*
     * In Processing, the Sketch works a lot like the World in the turtles. You
     * can't
     * draw a ball without knowing which sketch to draw it on, so you always need to
     * specify the sketch for a Ball object.
     */
    
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
   
    /** Empty constructor to keep the defaults. Only sets up our link. */
    public Ball(Sketch sketch) {
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
    public Ball(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
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
        return x; // this decides where on the graph the ball starts
    }

    public float getY() {
        return y;
    }

    // I called on a predefined method. I input the values of r,g,b in sketch and they are then run through this method.

    public void setColors( int r, int g, int b) {
        fillColor = s.color( r, g, b);
    }

    /**
     * Draws the ball on the given sketch
     */
    public void draw() {
        s.stroke(borderColor);
        s.fill(fillColor);
        s.circle(x, y, radius * 2);
    }

    /**
     * Moves the ball so that the next time it draws it will be in a different place.
     * i only got help from Mr. Griwold in this, a lot of help.
     */
    public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
        if (x > s.width - radius || x < radius) {//if the x value is in the wall it goes in opposite direction
            xSpeed = -xSpeed;
            x = x + xSpeed;
            if (xSpeed > 0) {
                xSpeed -= xSpeed/1.2;
            }else if (xSpeed < 0){
                xSpeed += xSpeed/1.2;
            }
        }
        ySpeed += 0.1; //this acts as a gravitational constant
        if (y > s.height - radius) {
            ySpeed = -ySpeed;
            y = y + ySpeed; 
           
        }
        if (y < radius) {
            ySpeed = -ySpeed/2;
            y = y + 2*ySpeed;
        }/** this makes it so when the mouse is over the ball it stops */
        if (Sketch.dist(s.mouseX, s.mouseY, x, y)< radius) {
            xSpeed=0;
            ySpeed=0;
        }
    }

}
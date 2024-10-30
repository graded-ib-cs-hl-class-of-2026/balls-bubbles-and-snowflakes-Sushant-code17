
class Bubble {

private float radius;
private float x;
private float y;
private int borderColor;
private int fillColor;
private float xSpeed;
private float ySpeed;
private Sketch s;
    //MISSING CONSTRUCTORS
    public Bubble(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
        this.s = sketch;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
        this.fillColor= s.color(255, 255, 255, 36);
    }
    // accessors for the radius, diameter, x, and y values 
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

    public void draw() {
        s.stroke(borderColor);
        s.fill(fillColor);
        s.circle(x, y, radius*2);
    }

    public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
        if (x > s.width - radius) {
            x = radius;
        } else if(x < radius) {
            x = s.width - radius;
        } else if (y > s.height - radius) {
            y = radius;
        } else if (y < radius) {
            y = s.height - radius;
        }
    }

}
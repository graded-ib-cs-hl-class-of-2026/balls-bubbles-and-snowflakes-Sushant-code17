import processing.core.PApplet;

public class Sketch extends PApplet {

    /** Represents one ball */
    private Ball ball1;
    private Ball ball2;   
    private Ball ball3;
    private Ball ball5;

    private Bubble bub1;
    private Bubble bub2;
    private Bubble bub3;
    private Bubble bub4;

    private Snowflake flake1;
    private Snowflake flake2;
    private Snowflake flake3;
    private Snowflake flake4;



    /**
     * This method can only be used to change the window size. It runs before the
     * window is created.
     */
    public void settings() {
        size(500, 500);
    }

    /**
     * Runs once at the beginning of the program, after the window is created. Use
     * this to initialize the sketch.
     */
    public void setup() {
        ball1 = new Ball(this);
        ball2= new Ball(this, 10, 5,3,10, 13 );
        ball2.setColors(35, 229, 80);
        ball3= new Ball(this, 30, 320, 190, 3, 3);
        ball3.setColors(45, 120, 240);
    
        ball5= new Ball(this, 30, 450, 500, 2, 2); // I know this ball is weird, thats on purpose
        ball5.setColors(30, 240, 30);

        bub1= new Bubble(this, 38, 500, 400, 0.0899f, -0.8f);
        bub2= new Bubble(this, 8f, 150, 200f, 0.0597f, -1.823f);
        bub3= new Bubble(this, 32, 200, 100, 0.088534f, -1.4f);
        bub4= new Bubble(this, 20, 400, 25, -0.0090032f, -1);

        flake1= new Snowflake(this, 15, 100, 20, 0.99f, 1);
        flake2= new Snowflake(this, 30, 200, 0, 0.090f, 2);
        flake3= new Snowflake(this, 28, 300, 50, 0.089f, 1.5f);
        flake4= new Snowflake(this, 38, 480, 80, 0.0789f, 2);


    }

    /**
     * This method runs over and over and over, approximately 60 times per second!
     * By moving objects a tiny bit each frame, you can get the appearance of
     * movement.
     */
    public void draw() {
        background(180, 180, 255);
        ball1.draw();
        ball1.move();
        ball2.draw();
        ball2.move();
        ball3.draw();
        ball3.move();
        ball5.draw();
        ball5.move();

        bub1.draw();
        bub1.move();
        bub2.draw();
        bub2.move();
        bub3.draw();
        bub3.move();
        bub4.draw();
        bub4.move();

        flake1.draw();
        flake1.move();

        flake2.draw();
        flake2.move();

        flake3.draw();
        flake3.move();

        flake4.draw();
        flake4.move();

       
    }

    /** All processing sketches have to use this main method. Don't touch this! */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}

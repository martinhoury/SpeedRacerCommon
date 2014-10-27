
import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Represents a car, which is a CollidableRectangle with effect 1 (bounce)
 * @author Sam
 * @version 1.0
 */
public class Car extends CollidableRectangle implements Serializable{
    
    /**
     * The Car speed on the x-axis (positive means on the right, negative on the left) ([-8,8])
     */
    public double xSpeed;

    /**
     * The Car speed on the y-axis ([0.5,2] for civilans, [0.5,3.58] for racers, [0.5,4.64] for player. Can be 0 if blocked or greater than the max if pushed. Multiply by 50 to obtain the speed in Km/h.
     */
    public double ySpeed;

    /**
     * The Car acceleration on the x-axis ([-4,4])
     */
    public int xAcc;

    /**
     * The Car acceleration on the y-axis ([-8,4])
     */
    public int yAcc;

    /**
     * The Car type (true = racer, false = civilian)
     */
    public boolean Racer;

    /**
     * The number of 50ms rounds during which the car is busted by the police (default : 0)
     */
    public int bustedTime;

    /**
     * The speed at which the car was busted (default : 0)
     */
    public int bustedSpeed;

    /**
     * Constructor
      * @param x The position of the Rectangle on the x-axis
     * @param y The position of the Rectangle on the y-axis
     * @param width Rectangle width
     * @param height Rectangle height
     * @param id Rectangle id
     * @param effect The effect in case of collision
     * @param xSpeed The speed of the car on the x-axis
     * @param ySpeed The speed of the car on the y-axis
     * @param xAcc The acceleration of the car on the x-axis
     * @param yAcc The acceleration of the car on the y-axis
     * @param Racer The car type
     */
    public Car(double x, double y, int width, int height, int id, int effect, double xSpeed, double ySpeed, int xAcc, int yAcc, boolean Racer)
    {
        super(x,y,width,height,id,effect);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.xAcc = xAcc;
        this.yAcc = yAcc;
        this.Racer = Racer;
        bustedTime = 0;
        bustedSpeed = 0;
    }
    
}

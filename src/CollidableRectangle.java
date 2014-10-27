
import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 * Extends the SpeedRaceSP.Rectangle. This rectangle is taken into account in the collision detection.
 * @author Sam
 * @version 1.0
 */
public class CollidableRectangle extends Rectangle implements Serializable{

    /**
     * Detemines the effect that a collision with this rectangle has:
     *  0 (block), 1 (bounce), 2 (slow down), 3 (finishes the game), 4 (Speed control)
     */
    public int effect;

    /**
     * Constructor
     * @param x The position of the Rectangle on the x-axis
     * @param y The position of the Rectangle on the y-axis
     * @param width Rectangle width
     * @param height Rectangle height
     * @param id Rectangle id
     * @param effect The effect in case of collision
     */
    public CollidableRectangle(double x, double y, int width, int height, int id, int effect)
    {
        super(x,y,width,height,id);
        this.effect = effect;
    }
}

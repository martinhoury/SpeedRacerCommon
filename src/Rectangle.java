
import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 * Represents a Rectangle (different from the java.awt.Rectangle)
 * @author Sam
 * @version 1.0
 */
public class Rectangle implements Serializable{

    /**
     * Rectangle position on the x-axis
     */
    public double x;

    /**
     * Rectangle position on the y-axis
     */
    public double y;

    /**
     * Rectangle width
     */
    public int width;

    /**
     * Rectangle height
     */
    public int height;

    /**
     * Rectangle id which corresponds to:
     *  0 (Grass land),
     *  1 (Road segment),
     *  2 (White separator (or finish line)),
     *  3 (Road border),
     *  4 (Tree),
     *  5 (Concrete Block),
     *  6 (Red car (player)),
     *  7 (White car (opponent)),
     *  8 (Blue car (civilian)),
     *  9 (Camera view),
     *  10 (Red rectangle (for collision warning)),
     *  11 (Speed limitation sign),
     *  12 (Police car),
     *  13 (Speed control zone) or
     *  14 (Speed display sign)
     */
    public int id;

    /**
     * Constructor
     * @param x The position of the Rectangle on the x-axis
     * @param y The position of the Rectangle on the y-axis
     * @param width Rectangle width
     * @param height Rectangle height
     * @param id Rectangle id
     */
    public Rectangle(double x, double y, int width, int height, int id)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.id = id;
    }
}

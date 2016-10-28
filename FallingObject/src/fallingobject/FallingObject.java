/*
 * Michael Swanson
 * 09-02-2016
 * CSC 210-01
 * Compute the distance an object falls under the force of gravity
 */
package fallingobject;

public class FallingObject {

    /**
     * To compute the distance an object travels under free fall we will use the
     * equation d = 0.5*a*t^2+v*t+x in which a= gravity, t = time (seconds), v =
     * initial velocity, and x is equal to initial distance. The solution will
     * be represented as d, for distance traveled (meters). The initial value of
     * v and x will be 0, while the value of d is the equation stated above. All
     * types will remain as a double. After all of the variables are declared, a
     * message will print "The distance traveled by an object falling vertically
     * through the air for t seconds is d meters."
     *
     * @param args
     */
    public static void main(String[] args) {
        double a = -9.8, // force of gravity, -9.8m/s
                t = 8, // time, in this case, 15 seconds
                v = 0, // initial velocity
                x = 675, // initial position
    // the distance traveled, calculated through the equation d = a(t^2)+vt+x            
                d = (0.5) * a * Math.pow(t, 2) + v * t + x;
        System.out.println("The distance traveled by an object falling"
            + " vertically through the air for " + (int) t + " seconds is "
            + d + " meters."); // print statement neatly showing the results
    }
}

package Environment.misc;

import Environment.WorldObject;

/**
 * Created by Akos on 2016. 09. 27..
 */
public class Crosswalk extends WorldObject{

    public Crosswalk(int Id, int[] startPosition, double[] Transform, int Zlevel, int Opacity) {
        super(Id, startPosition, 350, 190, Transform, Zlevel, Opacity, false);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+  " elem adatai:  " + "   Id: " + this.getId() + "   Zlevel: " + this.getZLevel() + "   Opacity: " + this.getOpacity() + "  CanStuckOnIt: " + this.getCanStuckOnIt();

    }
}

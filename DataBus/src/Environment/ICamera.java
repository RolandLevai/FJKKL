package Environment;

import java.util.List;

/**
 * Created by nemet on 2016. 10. 26..
 */
public interface ICamera {

    //left - távolabbi bal pont
    //right - távolabbi jobb pont
    //center - az autón lévő pont
    List<WorldObject> getSeenObjects(int leftpointX, int leftpointY, int rightpointX, int rightpointY, int centerX, int centerY);
}

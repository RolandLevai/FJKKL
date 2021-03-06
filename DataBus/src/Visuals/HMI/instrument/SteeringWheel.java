package Visuals.HMI.instrument;

/**
 * Created by levair on 2016.10.07..
 */
public class SteeringWheel {
    public static final int ANGLE_MODIFICATION_VALUE = 18;
    public static final int MAX_ANGLE = 180;
    public static final int MIN_ANGLE = -180;
    public static final int NEUTRAL_ANGLE = 0;

    private int currentAngle;

    public SteeringWheel () {
        currentAngle = NEUTRAL_ANGLE;
    }

    public int turnRight() {
        if (currentAngle < MAX_ANGLE) {
            this.currentAngle += ANGLE_MODIFICATION_VALUE;
        }
        return this.currentAngle;
    }

    public int turnLeft() {
        if (currentAngle > MIN_ANGLE) {
            this.currentAngle -= ANGLE_MODIFICATION_VALUE;
        }
        return this.currentAngle;
    }

    public int getCurrentAngle()
    {
        return this.currentAngle;
    }
}

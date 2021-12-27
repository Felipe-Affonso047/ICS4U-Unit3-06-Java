
public class Jet extends Airplane {
    /**
     * Constant.
     */
    private static final int MULTIPLIER = 2;

    /**
     * Constructor.
     */
    public Jet() {
        super ();
    }

    /**
     * Method.
     *
     * @param speed ok.
     */
    public void setSpeed(int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    /**
     * Method.
     */
    public void accelerate() {
        super.setSpeed(getSpeed() * 2);
    }

}

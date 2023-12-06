/**
 * @author Olivia McKittrick
 */
public class Planet extends CelestialBody {
    private final double distanceFromSun;

    public Planet(String name, double mass, double size, Vector2D position, Vector2D velocity, double distanceFromSun) {
        super(name, mass, size, position, velocity);
        this.distanceFromSun = distanceFromSun;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }
}

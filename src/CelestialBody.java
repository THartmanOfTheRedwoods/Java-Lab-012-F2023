public class CelestialBody {
    private final String name;
    private final double mass;
    private final double size;
    private Vector2D position;
    private Vector2D velocity;

    public CelestialBody(String name, double mass, double size, Vector2D position, Vector2D velocity) {
        this.name = name;
        this.mass = mass;
        this.size = size;
        this.position = position;
        this.velocity = velocity;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getSize() {
        return size;
    }

    public Vector2D getPosition() {
        return position;
    }

    public Vector2D getVelocity() {
        return velocity;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
    }

    public void setVelocity(Vector2D velocity) {
        this.velocity = velocity;
    }
}

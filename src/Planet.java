public class Planet {
    private String name;
    private double radius;
    private double mass;
    private double distance;
    private double x;
    private double y;
    private double velX;
    private double velY;

    public Planet(String name, double radius, double mass, double distance, double velX, double velY) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.distance = distance;
        this.velX = velX;
        this.velY = velY;
        this.y = 0.0;
        this.x = distance;
    }
    public double getXPos() {
        return this.x;
    }
    public double getYPos() {
        return this.y;
    }
    public void moveTo(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }
    public double getXVel() {
        return velX;
    }
    public double getYVel() {
        return velY;
    }
    public void setXVel(double newVelX) {
        this.velX = newVelX;
    }
    public void setYVel(double newVelY) {
        this.velY = newVelY;

    }
    @Override
    public String toString() {
        return String.format("Name: %s, Position: (%f, %f), Velocity: (%f, %f), Mass: %f", name, x, y, velX, velY, mass);

    }
}

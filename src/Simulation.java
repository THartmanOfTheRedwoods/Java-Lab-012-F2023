//NAQIBULLAH HAIWADPAL
//12/11/2023

import java.util.ArrayList;
import java.util.List;

public class Simulation {

    public static void main(String[] args) {
        // Example usage
        SolarSystem solarSystem = new SolarSystem();
        solarSystem.addSun(new Sun("Sol", 1.0, 1.0, 5778));
        solarSystem.addPlanet(new Planet("Earth", 1.0, 1.0, 1.0, 0.0, 1.0));

        solarSystem.showPlanets();
        solarSystem.movePlanets(); // Move planets according to gravity and time step
        solarSystem.showPlanets(); // Show updated positions
    }
}

class SolarSystem {
    private List<Planet> planets = new ArrayList<>();
    private Sun theSun;

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public void addSun(Sun sun) {
        theSun = sun;
    }

    public void showPlanets() {
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }

    public void movePlanets() {
        double G = 0.1;
        double dt = 0.001;

        for (Planet p : planets) {
            p.moveTo(p.getXPos() + dt * p.getXVel(),
                    p.getYPos() + dt * p.getYVel());

            double rx = theSun.getXPos() - p.getXPos();
            double ry = theSun.getYPos() - p.getYPos();
            double r = Math.sqrt(rx * rx + ry * ry);

            double accX = G * theSun.getMass() * rx / (r * r * r);
            double accY = G * theSun.getMass() * ry / (r * r * r);

            p.setXVel(p.getXVel() + dt * accX);
            p.setYVel(p.getYVel() + dt * accY);
        }
    }
}

class Planet {
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
        // Initialize position based on distance (simple circular orbit assumption for initialization)
        this.x = distance;
        this.y = 0;
    }

    public double getXPos() {
        return x;
    }

    public double getYPos() {
        return y;
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

    public String toString() {
        return "Planet " + name + " [x=" + x + ", y=" + y + ", velX=" + velX + ", velY=" + velY + "]";
    }
}

class Sun {
    private String name;
    private double radius;
    private double mass;
    private double temp;
    private double x;
    private double y;

    public Sun(String name, double radius, double mass, double temp) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.temp = temp;
        this.x = 0.0; // The Sun is at the center
        this.y = 0.0;
    }

    public double getXPos() {
        return x;
    }

    public double getYPos() {
        return y;
    }

    public double getMass() {
        return mass;
    }

    public String toString() {
        return "Sun " + name + " [mass=" + mass + ", x=" + x + ", y=" + y + "]";
    }
}

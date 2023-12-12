import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    private List<Planet> planets;
    private Sun theSun;

    public SolarSystem() {
        this.planets = new ArrayList<>();
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public void addSun(Sun aSun) {
        this.theSun = aSun;
    }

    public void showPlanets() {
        System.out.println("Planets in the Solar System:");
        for (Planet planet : planets) {
            System.out.println(planet);
        }
        System.out.println("The Sun: " + theSun);
        System.out.println();
    }

    public void movePlanets() {
        /*for (Planet planet : planets) {
            double newX = planet.getX() + planet.getXVel();
            double newY = planet.getY() + planet.getYVel();
            planet.moveTo(newX, newY);*/


        double G = 0.1;
        double dt = 0.001;

        for (Planet p : this.planets) {
            p.moveTo(p.getX() + dt * p.getXVel(),
                    p.getY() + dt * p.getYVel());

            double rx = this.theSun.getX() - p.getX();
            double ry = this.theSun.getY() - p.getY();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * this.theSun.getMass() * rx / Math.pow(r, 3);
            double accY = G * this.theSun.getMass() * ry / Math.pow(r, 3);

            p.setXVel(p.getXVel() + dt * accX);
            p.setYVel(p.getYVel() + dt * accY);
        }
    }
}



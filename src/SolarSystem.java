import java.util.ArrayList;
import java.util.List;

class SolarSystem {
    private List<Planet> planets;
    private Sun theSun;

    public SolarSystem() {
        planets = new ArrayList<>();
        theSun = new Sun("Sun", 1.0, 1.0, 5778.0); // Default values for the Sun
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public void addPlanets(List<Planet> planets){
        this.planets = planets;
    }

    public void addSun(Sun sun) {
        theSun = sun;
    }

    public void showPlanets() {
        // Display information about each planet
        for (Planet planet : planets) {
            System.out.println(planet.toString());
        }
        System.out.printf("%n");
    }

    public void movePlanets() {
        // Logic to move planets based on simulation rules
        double G = 0.1;
        double dt = 0.001;

        for(Planet p : this.planets) {
            p.moveTo(p.getXPos() + dt * p.getXVel(),
                    p.getYPos() + dt * p.getYVel());

            double rx = this.theSun.getXPos() - p.getXPos();
            double ry = this.theSun.getYPos() - p.getYPos();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * this.theSun.getMass() * rx / Math.pow(r, 3);
            double accY = G * this.theSun.getMass() * ry / Math.pow(r, 3);

            p.setXVel(p.getXVel() + dt * accX);
            p.setYVel(p.getYVel() + dt * accY);
        }
    }
}

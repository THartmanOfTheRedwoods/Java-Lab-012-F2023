import java.util.ArrayList;
import java.util.List;

// SolarSystem class
class SolarSystem {
    private List<Planet> planets;
    private Sun theSun;

    public SolarSystem() {
        this.planets = new ArrayList<>();
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public void addSun(Sun sun) {
        this.theSun = sun;
    }

    public void showPlanets() {
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }

    public void movePlanets() {
        for (Planet planet : planets) {
            planet.moveTo(planet.getXPos() + planet.getXVel(), planet.getYPos() + planet.getYVel());
        }
    }
}

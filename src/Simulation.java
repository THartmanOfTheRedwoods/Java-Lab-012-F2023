public class Simulation {
    public static void main(String[] args) {
        /*SolarSystem solarSystem = new SolarSystem();
        solarSystem.addSun(new Sun("The Sun", 696340, 1.989 * Math.pow(10, 30), 5778));
        solarSystem.addPlanet(new Planet("Earth", 6371, 5.972 * Math.pow(10, 24), 149.6 * Math.pow(10, 6), 0, 0));

        solarSystem.showPlanets();
        solarSystem.movePlanets();
        solarSystem.showPlanets();*/

        SolarSystem ss = new SolarSystem();
        Sun theSun = new Sun("The Sun", 696340, 1989e30, 5773);
        Planet theEarth = new Planet("Earth", 6371, 5.972e24, 1.496e8, 17000, 25000 );

        ss.addSun(theSun);
        ss.addPlanet(theEarth);

        ss.showPlanets();
        ss.movePlanets();
        ss.showPlanets();

        }
    }


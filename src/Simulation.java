

class Simulation {
    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem();
        Sun theSun = new Sun("The Sun", 696340, 1.989e30, 5773, 0, 0);
        ss.addSun(theSun);
        Planet theEarth = new Planet("Earth", 6371, 5.972e24, 1.496e8, 17000, 25000);
        ss.addSun(theSun);
        ss.addPlanet(theEarth);
        ss.showPlanets();
        ss.movePlanets();
        ss.showPlanets();
    }
}
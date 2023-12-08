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
            // Sun is at the center initially
            this.x = 0.0;
            this.y = 0.0;
        }

        public double getXVel() {
            return 0.0; // Sun doesn't move in this simulation
        }

        public double getYVel() {
            return 0.0;
        }

        public double getMass() {
            return mass;
        }

        @Override
        public String toString() {
            return "Sun{name='" + name + "', radius=" + radius + ", mass=" + mass + ", temp=" + temp + '}';
        }

    public double getYPos() {
            return y;
    }

    public double getXPos() {
            return x;
    }
}



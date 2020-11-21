package practice12;

public enum Planet {
    // in mass and radius of earth
    MERCURY(0.055f, 0.38f),
    VENUS(0.815f, 0.95f),
    EARTH(1, 1),
    MARS(0.107f, 0.53f),
    JUPITER(318, 11.21f),
    SATURN(95, 9.45f),
    URANUS(14, 4.01f),
    NEPTUNE(17, 3.88f);

    final float mass;
    final float radius;

   private Planet(float mass, float radius) {
        this.mass = mass;
        this.radius = radius;

    }

    public float getMass() {
        return mass;
    }

    public float getRadius() {
        return radius;
    }
}

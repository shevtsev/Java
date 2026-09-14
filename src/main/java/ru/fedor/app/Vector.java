package ru.fedor.app;

public final class Vector {
    private final double x, y, z;
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void print() {
        System.out.printf("(%.3f, %.3f, %.3f)\n", x, y, z);
    }
    public double dist() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public double multiplication(Vector v) {
        return x * v.x + y * v.y + z * v.z;
    }
    public Vector product(Vector v) {
        return new Vector(y * v.z - z * v.y, z * v.x - x * v.z, x * v.y - y * v.x);
    }
    public double angle(Vector v) {
        return Math.acos(multiplication(v) / (dist() * v.dist()));
    }
    public Vector sum(Vector v) {
        return new Vector(x + v.x, y + v.y, z + v.z);
    }
    public Vector difference(Vector v) {
        return new Vector(x - v.x, y - v.y, z - v.z);
    }
    public static Vector[] random_vectors(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++)
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        return vectors;
    }
}
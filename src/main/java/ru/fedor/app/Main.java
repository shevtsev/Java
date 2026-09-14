package ru.fedor.app;

public class Main {
    public static void main(String[] args) {
        Vector v1 = new Vector(2.5, 3.2, 4.5);
        Vector v2 = new Vector(1.7, 2.6, 3.4);
        System.out.printf("|v1| = %.3f\n",v1.dist());
        System.out.printf("|v2| = %.3f\n",v2.dist());
        System.out.printf("v1 * v2 = %.3f\n",v1.multiplication(v2));
        System.out.printf("v1 x v2 = ");
        v1.product(v2).print();
        System.out.printf("cos(v1, v2) = %.3f\n",v1.angle(v2));
        System.out.printf("v1 + v2 = ");
        v1.sum(v2).print();
        System.out.printf("v1 - v2 = ");
        v1.difference(v2).print();
        int n = Integer.parseInt(System.console().readLine("Enter N: "));
        Vector[] randomVectors = Vector.random_vectors(n);
        for (Vector v : randomVectors) {
            v.print();
        }
    }
}

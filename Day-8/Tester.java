public class Tester {

    public static void main(String[] args) {

        int a = 1;
        int b = 4;
        int c = 4;

        double d = (b * b) - (4 * a * c);

        if (d == 0) {
            double root = (-b) / (2.0 * a);
            System.out.println("The root is " + root);
        }
        else if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(d)) / (2.0 * a);

            System.out.println("Root 1 is " + root1);
            System.out.println("Root 2 is " + root2);
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }
}
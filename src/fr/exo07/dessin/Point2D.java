package fr.exo07.dessin;

public class Point2D {
    // Attributs
    private int x, y;
    private static int compteur;

    // Constructeurs
    public Point2D() {
        this.x = 10;
        this.y = 50;
    };

    public Point2D( int x, int y) {
        this.setX(x);
        this.setY(y);
        Point2D.compteur++;
    }

    // Getters  && setters


    public int getX() {
        return x;
    }

    public void setX(int x) {
            this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static int getCompteur() {
        return Point2D.compteur;
    }

    // methodes

    public void afficher(){
        System.out.println("[" + this.x + ", " + this.y + "]");
    }

    public void translater (int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

package fr.exo07.dessin;

import fr.exo05.Point;

public class Run {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D();
        Point2D p3 = new Point2D(5, 3);
        Point2D p4 = new Point2D(6,7);


        System.out.println(p1);
        System.out.println("Nb Point2D : " + Point2D.getCompteur());


    }
}

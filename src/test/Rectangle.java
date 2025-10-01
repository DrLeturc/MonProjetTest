package test;

/**
 * La classe &lt;code&gt;Rectangle&lt;/code&gt; représente un rectangle
 * avec une largeur et une hauteur.
 * @author Auteur
 * @version 1.0
 */
public class Rectangle {
    /**
     * Largeur du rectangle
     */
    private double largeur;
    /**
     * Hauteur du rectangle
     */
    private double hauteur;

    /**
     * Constructeur pour créer un rectangle avec des dimensions spécifiques.
     * @param largeur la largeur du rectangle
     * @param hauteur la hauteur du rectangle
     */
    public Rectangle(double largeur, double hauteur) {
        largeur = largeur;
        hauteur = hauteur;
    }

    /**
     * Méthode pour calculer l'aire du rectangle.
     * @return l'aire du rectangle
     */
    public double calculerAire() {
        return largeur * hauteur;
    }

    public void afficher() {
        System.out.println("Largeur = " + largeur + ", Hauteur = " + hauteur);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        r.afficher();
    }
}

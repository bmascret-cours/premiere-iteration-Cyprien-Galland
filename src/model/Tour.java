package model;

/**
 * 
 */

/**
 * @author cypri
 *
 */
public class Tour extends AbstractPiece {
	Couleur Couleur;
	Coord Coord;
	
	public Tour(){
		super ();
		this.Couleur = model.Couleur.NOIRBLANC;
		this.Coord = new Coord(0,0);
	}
	
	public Tour(Couleur Couleur, int x, int y) {
		super();
		this.Couleur = Couleur;
		this.Coord = new Coord(x,y);
	}
	
	public int getX() {
		return this.Coord.X();
	}
	public int getY() {
		return this.Coord.Y();
	}
	
	public boolean capture() {
		//retourne true si la pièce est capturée, et positionne x et y à -1
		// On suppose qu'elle est appelée à la capture de la pièce, et pas en dehors.
		this.Coord = new model.Coord(-1,-1);
		return true;
	}
	
	public boolean isMoveOk(int xFinal, int yFinal) {
		if (xFinal > 8)
			return false; //On vérifie qu'on reste sur l'échiquier
		else if (yFinal > 8)
			return false;
		else if (xFinal == this.Coord.X())
			return true;
		else if (yFinal == this.Coord.Y()) 
			return true;
		else 
			return false;
	}
	
	public Couleur getCouleur() {
		return this.Couleur;
	}
	
	
	public String toString() {
		return "Cette pièce est de couleur " + this.Couleur + " en position " + this.Coord;
	}
	


}

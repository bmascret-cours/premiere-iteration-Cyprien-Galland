package model;

/**
 * 
 */

/**
 * @author cypri
 *
 */
public class Tour extends AbstractPiece{
	Couleur Couleur;
	Coord Coord;
	
	public Tour(){
		super ();
	}
	
	public Tour(Couleur Couleur, int x, int y) {
		this.Couleur = Couleur;
		this.Coord = new Coord(x,y);
	}

	public boolean isMoveOk(int xFinal, int yFinal) {
		if (xFinal == this.Coord.X()) 
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

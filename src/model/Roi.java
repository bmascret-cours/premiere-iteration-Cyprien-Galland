/**
 * 
 */
package model;

/**
 * @author cypri
 *
 */
public class Roi extends AbstractPiece {

	/**
	 * 
	 */
	Couleur Couleur;
	Coord Coord;
	
	public Roi(){
		super ();
		this.Couleur = model.Couleur.NOIRBLANC;
		this.Coord = new Coord(0,0);
	}
	
	public Roi(Couleur Couleur, int x, int y) {
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
		//retourne true si la pi�ce est captur�e, et positionne x et y � -1
		// On suppose qu'elle est appel�e � la capture de la pi�ce, et pas en dehors.
		this.Coord = new model.Coord(-1,-1);
		return true;
	}
	
	public boolean isMoveOk(int xFinal, int yFinal) {
		if (xFinal > 8)
			return false; //On v�rifie qu'on reste sur l'�chiquier
		else if (yFinal > 8)
			return false;
		else if (xFinal - this.Coord.X() <= 1)
			if (yFinal - this.Coord.Y() <= 1)
				return true;
			else
				return false;
		else 
			return false;
	}
	
	public Couleur getCouleur() {
		return this.Couleur;
	}
	
	
	public String toString() {
		return "Cette pi�ce est de couleur " + this.Couleur + " en position " + this.Coord;
	}

}

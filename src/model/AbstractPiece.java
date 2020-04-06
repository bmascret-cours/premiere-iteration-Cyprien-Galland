package model;

/**
 * 
 */

/**
 * @author cypri
 *
 */
public class AbstractPiece implements Pieces{
	Couleur Couleur;
	Coord Coord;
	
	public AbstractPiece() {
		this.Couleur = model.Couleur.NOIRBLANC;
		this.Coord = new Coord(0,0);
	}
	
	public int getX() {
		return this.getCoord().X();
	}
	public int getY() {
		return this.getCoord().Y();
	}
	public Couleur getCouleur() {
		return this.Couleur;
	}
	
	public boolean isMoveOk(int xFinal, int yFinal) {
		//retourne true si le déplacement est possible
		//dépends de la pièce : non codée ici
		return true;
	}
	
	public boolean move(int xFinal, int yFinal) {
		//return true si le déplacement à été fait
		if (this.Coord.X() == xFinal) {
			if (this.Coord.Y() == yFinal) {
				return true;
			}
			else {
				return false;
			}
		}
		else { 
			return false;
		}
	}
	
	public boolean capture() {
		//retourne true si la pièce est capturée, et positionne x et y à -1
		// On suppose qu'elle est appelée à la capture de la pièce, et pas en dehors.
		this.setCoord(new model.Coord(-1,-1));
		return true;
	}
	
	public Coord getCoord() {
		return this.Coord;
	}

	public void setCoord(Coord coord) {
		this.Coord = coord;
	}

	public String toString() {
		return "Cette pièce est de couleur " + this.Couleur + " en position " + this.Coord;
	}
	
	/*public static void main() {
		Pieces maTour = new Tour(model.Couleur.NOIR, new Coord(4, 8));
		maTour.toString();
		maTour.isMoveOk(6, 8);
		maTour.isMoveOk(4, 6);
		maTour.isMoveOk(8,4);
		maTour.getCouleur();
		maTour.getX();
		maTour.getY();
		maTour.move(5, 5);
		maTour.capture();
		maTour.toString();
		
		Pieces maTourBis = new Tour();
		maTourBis.toString();
	}*/

}

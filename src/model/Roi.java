/**
 * 
 */
package model;

/**
 * @author cypri
 *
 */
public class Roi extends AbstractPiece {

	public Roi(Couleur couleur,Coord coord) {
		super(couleur, coord);
	}
	
	public boolean isMoveOk(int xFinal, int yFinal) {
		if (xFinal > 8)
			return false; //On vérifie qu'on reste sur l'échiquier
		else if (yFinal > 8)
			return false;
		else if (xFinal - this.coord.X() <= 1)
			if (yFinal - this.coord.Y() <= 1)
				return true;
			else
				return false;
		else 
			return false;
	}
	
}

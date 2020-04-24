package model;

/**
 * 
 */

/**
 * @author cypri
 *
 */


public class Tour extends AbstractPiece {

	public Tour(Couleur couleur,Coord coord) {
		super(couleur, coord);
	}
	
	public boolean isMoveOk(int xFinal, int yFinal) {
		if (xFinal > 8)
			return false; //On vérifie qu'on reste sur l'échiquier
		else if (yFinal > 8)
			return false;
		else if (xFinal == this.coord.X())
			return true;
		else if (yFinal == this.coord.Y()) 
			return true;
		else 
			return false;
	}
	


}

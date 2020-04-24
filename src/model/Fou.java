package model;

public class Fou extends AbstractPiece {

	public Fou(Couleur couleur,Coord coord) {
		super(couleur, coord);
	}
	
	public boolean isMoveOk(int xFinal, int yFinal) {
		if (xFinal > 8)
			return false; //On vérifie qu'on reste sur l'échiquier
		else if (yFinal > 8)
			return false;
		else if (Math.abs(xFinal - this.coord.X()) == Math.abs(yFinal - this.coord.Y())) 
			return true;
		else 
			return false;
	}
	


}

package model;

public class Cavalier extends AbstractPiece {

	public Cavalier(Couleur couleur,Coord coord) {
		super(couleur,coord);
	}
	
	public boolean isMoveOk(int xFinal, int yFinal) {
		if (xFinal > 8)
			return false; //On vérifie qu'on reste sur l'échiquier
		else if (yFinal > 8)
			return false;
		else if (Math.abs(xFinal - this.coord.X()) == 2)
			if (Math.abs(yFinal - this.coord.Y()) == 1)
				return true;
			else
				return false;
		else if (Math.abs(xFinal - this.coord.X()) == 1)
			if (Math.abs(yFinal - this.coord.Y()) == 2)
				return true;
			else
				return false;
		else 
			return false;
	}
	

}

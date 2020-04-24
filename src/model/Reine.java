package model;

public class Reine extends AbstractPiece {

	public Reine(Couleur couleur,Coord coord) {
		super(couleur, coord);
		
	}
	
	public boolean isMoveOk(int xFinal, int yFinal) {
		if (xFinal > 8)
			return false; //On vérifie qu'on reste sur l'échiquier
		else if (yFinal > 8)
			return false;
		else if (xFinal == this.coord.X()) // les deux déplacements selon x et y
			return true;
		else if (yFinal == this.coord.Y()) 
			return true;
		else if (Math.abs(xFinal - this.coord.X()) == Math.abs(yFinal - this.coord.Y())) // déplacement en diagonale
			return true;
		else 
			return false;
	}
	

}

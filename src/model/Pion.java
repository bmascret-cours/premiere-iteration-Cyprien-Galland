package model;

public class Pion extends AbstractPiece implements Pions {
	boolean T1;

	public Pion(Couleur couleur,Coord coord) {
		super(couleur, coord);
		this.T1=true;
	}
	
	public boolean isMoveOk(int xFinal, int yFinal) {
		if (xFinal > 8)
			return false; //On vérifie qu'on reste sur l'échiquier
		else if (yFinal > 8)
			return false;
		else if (xFinal == this.coord.X()) 
			if (yFinal == this.coord.Y() + 1)
				return true;
			else 
				return false;
		else 
			return false;
	}
	
	@Override
	public boolean isMoveDiagOk(int xFinal, int yFinal) {
		// TODO Auto-generated method stub
		return false;
	}
}

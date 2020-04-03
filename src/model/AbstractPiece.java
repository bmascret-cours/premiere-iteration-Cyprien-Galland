/**
 * 
 */

/**
 * @author cypri
 *
 */
public class AbstractPiece extends java.lang.Objetct implements Pieces{
	Couleur Couleur;
	Coord Coord;
	
	public AbstractPiece() {
		super()
		this.Couleur = NOIRBLANC;
		this.Coord = (0,0);
	}
	
	public int getX() {
		return this.Coord.x;
	}
	
	public int getY() {
		return this.Coord.y;
	}
	
	public Couleur getCouleur() {
		return this.Couleur;
	}
	
	public boolean isMoveOk(int xFinal, int yFinal) {
		//retourne true si le déplacement est possible
		//dépends de la pièce : non codée ici
	}
	
	public boolean move(int xFinal, int yFinal) {
		//return true si le déplacement à été fait
		if getX() == xFinal :
			if getY() == yFinal :
				return True
		else :
			return False
	}
	
	public boolean capture() {
		//TODO
		//retourne true si la pièce est capturée, et positionne x et y à -1
		/*
		 * if la pièce est capturée :
		 * 	x = -1
		 * 	y = -1
		 * 	return True
		 * else :
		 * 	return False
		 */
	}
	
	public String toString() {
		return "Cette pièce est de couleur " + this.Couleur + " en position " + this.Coord.;
	}

}

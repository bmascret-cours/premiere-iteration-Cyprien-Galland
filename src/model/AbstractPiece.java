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
		//retourne true si le d�placement est possible
		//d�pends de la pi�ce : non cod�e ici
	}
	
	public boolean move(int xFinal, int yFinal) {
		//return true si le d�placement � �t� fait
		if getX() == xFinal :
			if getY() == yFinal :
				return True
		else :
			return False
	}
	
	public boolean capture() {
		//TODO
		//retourne true si la pi�ce est captur�e, et positionne x et y � -1
		/*
		 * if la pi�ce est captur�e :
		 * 	x = -1
		 * 	y = -1
		 * 	return True
		 * else :
		 * 	return False
		 */
	}
	
	public String toString() {
		return "Cette pi�ce est de couleur " + this.Couleur + " en position " + this.Coord.;
	}

}

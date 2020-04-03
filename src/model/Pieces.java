/**
 * 
 */

/**
 * @author cypri
 *
 */
public interface Pieces {

	public int getX() {
		// returns la position en x
		//implémenté dans la classe
	}
	
	public int getY() {
		// returns la position en y
		//implémenté dans la classe
	}
	
	public Couleur getCouleur() {
		//retourne la couleur de la pièce
		//implémenté dans la classe
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
	
}

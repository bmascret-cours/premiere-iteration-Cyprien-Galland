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
		//impl�ment� dans la classe
	}
	
	public int getY() {
		// returns la position en y
		//impl�ment� dans la classe
	}
	
	public Couleur getCouleur() {
		//retourne la couleur de la pi�ce
		//impl�ment� dans la classe
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
	
}

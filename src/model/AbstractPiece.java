package model;

/**
 * 
 */

/**
 * @author cypri
 *
 */
public class AbstractPiece implements Pieces {
	Couleur couleur;
	Coord coord;
	

	public AbstractPiece(Couleur couleur,Coord coord) {
		this.coord=coord;
		this.couleur=couleur;
	}
	
	@Override
	public int getX() {
		return this.coord.x;
	}
	
	@Override
	public int getY() {
		return this.coord.y;
	}
	
	public Couleur getCouleur() {
		return this.couleur;
	}
	
	
	public boolean isMoveOk(int xFinal, int yFinal) {
		//retourne true si le déplacement est possible
		//dépends de la pièce : non codée ici
		return true;
	}
	
	
	@Override
	public boolean move(int xFinal,int yFinal) {
		if(this.isMoveOk(xFinal,yFinal)){
			this.coord.x=xFinal;
			this.coord.y=yFinal;
			return true;
		}
		else return false;
	}
	
	
	
	public boolean capture() {
		//retourne true si la pièce est capturée, et positionne x et y à -1
		// On suppose qu'elle est appelée à la capture de la pièce, et pas en dehors.
		this.setCoord(new model.Coord(-1,-1));
		return true;
	}
	
	/*public boolean Capture() {
		this.coord.x=-1;
		this.coord.y=-1;
		return true;
	}*/
	
	public Coord getCoord() {
		return this.coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	@Override
	public String toString() {
		String S="Je suis un "+this.getClass().getSimpleName()+" de couleur "+(this.couleur==Couleur.BLANC ? "blanche":"noire")+" et je me situe en : ["+this.coord.x+","+this.coord.y+"]";
		return S;
	}
	


}



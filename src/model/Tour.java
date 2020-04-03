/**
 * 
 */

/**
 * @author cypri
 *
 */
public class Tour extends AbstractPieces{
	Couleur Couleur;
	Coord Coord;
	
	public Tour(){
		super ()
	}
	
	public Tour(Couleur Couleur, Coord Coord) {
		super()
		this.Couleur = Couleur;
		this.Coord = Coord;
	}

	public boolean isMoveOk(int xFinal, int yFinal) {
		if xfinal == this.Coord.x :
			return True;
		else if yfinal == this.Coord.y :
			return True;
		else :
			return False
	}

}

package model;

import java.io.Serializable;


/**
 * @author francoise.perrin
 *
 */
public class Coord implements Serializable {
	
	public int x, y;
	
	/**
	 * @param x
	 * @param y
	 */
	public Coord(int x, int y) {
		this.x = x; 
		this.y = y;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
	
	/**
	 * @param x
	 * @param y
	 * @return true si les coordonn�es sont valides (dans un plateau de 8*8)
	 */
	public static boolean coordonnees_valides(int x, int y){
		return ( (x<=7) && (x>=0) && (y<=7) && (y>=0) );
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coord other = (Coord) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	public int conversion_coord_panel() {
		int retour = -1;
		if (x==0) {
			retour = y;
		}
		if (x==1) {
			retour = y+8;
		}
		if (x==2) {
			retour = y+16;
		}
		if (x==3) {
			retour = y+24;
		}
		if (x==4) {
			retour = y+32;
		}
		if (x==5) {
			retour = y+40;
		}
		if (x==6) {
			retour = y+48;
		}
		if (x==7) {
			retour = y+56;
		}
		return retour;
	}
}

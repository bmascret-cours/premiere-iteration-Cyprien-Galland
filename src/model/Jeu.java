package model;


import java.util.LinkedList;
import java.util.List;

import tools.ChessPiecesFactory;

public class Jeu {
	public List<Pieces> Pieces;

	public Jeu(Couleur couleur) {
		this.Pieces=ChessPiecesFactory.newPieces(couleur);
	}
	
	/*public void main(String[] args) {
		Jeu test1 = new Jeu(model.Couleur.BLANC);
		System.out.println(test1);
		// TODO Auto-generated method stub
	}*/
	
	@Override
	public String toString() {
		for(Pieces p:Pieces) {
			System.out.println(p.toString());
		}

	return("");
	}
	
	public Pieces findPiece(int x,int y) {
		Pieces P=null;
		for(Pieces p:Pieces) {
			if((((AbstractPiece)p).coord.x==x) && (((AbstractPiece)p).coord.y==y)){
				P=p;
			}
		}

		return P;
	}
	
	 
	 public boolean isPieceHere(int x, int y) {
		 boolean result = false;
		 for (Pieces i : this.Pieces) {
			 if (i.getX() == x) {
				 if (i.getY() == y) {
					 result = true;
				 }
			 }
		 }
		 return result;
	 }
	 
	 public boolean isMoveOk(int xInit, int yInit, int xFinal, int yFinal) {
		 boolean result = false;
		 for (Pieces i : this.Pieces) {
			 if (i.isMoveOk(xFinal, yFinal)){
				 result = true;
			 }
		 }
		 return result;
	 }
	 
	 public boolean move(int xInit, int yInit, int xFinal, int yFinal) {
		 boolean result = false;
		 for (Pieces i : this.Pieces) {
			 if (i.move(xFinal, yFinal)) {
				 result = true;
			 }
		 }
		 return result;
	 }
	 
	 public void setPossibleCapture() {
		 //TODO
	 }
	 
	 public void capture() {
		 //TODO
	 }
	 
	 public Couleur getPieceColor(int x, int y) {
		 //TODO
		 return null;
	 }
	 
	 public java.lang.String getPieceType(int x, int y){
		 //TODO
		 return null;
	 }
	 
	 public Couleur getCouleur() {
		 return this.getCouleur();
	 }
	 
	 public java.util.List<PieceIHM> getPiecesIHM() {
		 PieceIHM newPieceIHM = null;
		 List<PieceIHM> list = new LinkedList<PieceIHM>();      
		 for (Pieces piece : Pieces){    
			 boolean existe = false;    
			 // si le type de piece existe déjà dans la liste de PieceIHM     
			 // ajout des coordonnées de la pièce dans la liste de Coord de ce type     
			 // si elle est toujours en jeu (x et y != -1)    
			 for ( PieceIHM pieceIHM : list){         
				 if ((pieceIHM.getTypePiece()).equals(piece.getClass().getSimpleName())){      
					 existe = true;      
					 if (piece.getX() != -1){       
						 pieceIHM.add(new Coord(piece.getX(), piece.getY()));      
					 }     
				 }       
			 }    
			 // sinon, création d'une nouvelle PieceIHM si la pièce est toujours en jeu    
			 if (! existe) {     
				 if (piece.getX() != -1){      
					 newPieceIHM = new PieceIHM(piece.getClass().getSimpleName(), piece.getCouleur());
					 newPieceIHM.add(new Coord(piece.getX(), piece.getY()));
					 list.add(newPieceIHM);
				 }    
			 }   
		 }   
		 return list;
	 }
	 
	 public void setCastling() {
		 //TODO
	 }
	 
	 public void undoMove() {
	 }
	 
	 public void undoCapture() {
		 
	 }
	 
	 public boolean isPawnPromotion(int xFinal, int yfinal) {
		 boolean result = false;
		 if (yfinal == 8) {
			 result = true;
		 }
		 return result;
	 }
	 
	 public boolean pawnPromotion(int xFinal, int yfinal, java.lang.String type) {
		 //TODO
		 return false;
	 }
	 
	 public Coord getKingCoord() {
		 Coord result = new Coord(0,0);
		 for (Pieces i : this.Pieces) {
			 if (i instanceof Roi){
				 result.setX(i.getX());
				 result.setY(i.getY());
			 }
		 }
		 return result;
	 }


}



package model;


import java.util.LinkedList;
import java.util.List;

import tools.ChessPiecesFactory;

public class Jeu {
	List<Pieces> liste_pieces;
	Couleur couleur;

	public Jeu(Couleur Couleur) {
		liste_pieces = ChessPiecesFactory.newPieces(Couleur);
		couleur = Couleur;
		// TODO Auto-generated constructor stub
	}
	
	public void main(String[] args) {
		Jeu test1 = new Jeu(model.Couleur.BLANC);
		System.out.println(test1);
		// TODO Auto-generated method stub
	}
	
	public List<String> ToString() {
		List liste = null;
		for (Pieces i : this.liste_pieces) {
			String txt = i.toString();
			liste.add(txt);
		}
		return liste;
	}
	
	 private Pieces findPiece(int x, int y) {
		 //TODO
	 }
	 
	 public boolean isPieceHere(int x, int y) {
		 boolean result = false;
		 for (Pieces i : this.liste_pieces) {
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
		 for (Pieces i : this.liste_pieces) {
			 if (i.isMoveOk(xFinal, yFinal)){
				 result = true;
			 }
		 }
		 return result;
	 }
	 
	 public boolean move(int xInit, int yInit, int xFinal, int yFinal) {
		 boolean result = false;
		 for (Pieces i : this.liste_pieces) {
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
	 }
	 
	 public java.lang.String getPieceType(int x, int y){
		 //TODO
	 }
	 
	 public Couleur getCouleur() {
		 return this.couleur;
	 }
	 
	 public java.util.List<PieceIHM> getPiecesIHM() {
		 PieceIHM newPieceIHM = null;
		 List<PieceIHM> list = new LinkedList<PieceIHM>();      
		 for (Pieces piece : pieces){    
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
	 }
	 
	 public Coord getKingCoord() {
		 Coord result = new Coord(0,0);
		 for (Pieces i : this.liste_pieces) {
			 if (i instanceof Roi){
				 result.setX(i.getX());
				 result.setY(i.getY());
			 }
		 }
		 return result;
	 }


}



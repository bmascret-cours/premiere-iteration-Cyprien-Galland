package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.util.Hashtable;
import java.util.Observable;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import controler.ChessGameControlers;

import model.Couleur;
import model.Jeu;
import model.Pieces;
import tools.ChessImageProvider;

public class ChessGameGUI
extends javax.swing.JFrame
implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.util.Observer{

	  JLayeredPane layeredPane;
	  JPanel chessBoard;
	  JLabel chessPiece;
	  int xAdjustment;
	  int yAdjustment;
	 
	  public ChessGameGUI(java.lang.String name,
	            ChessGameControlers chessGameControler,
	            java.awt.Dimension boardSize){
	  
	 
	  //  Use a Layered Pane for this this application
    layeredPane = new JLayeredPane();
	  getContentPane().add(layeredPane);
	  layeredPane.setPreferredSize(boardSize);
	  layeredPane.addMouseListener(this);
	  layeredPane.addMouseMotionListener(this);
	  layeredPane.setName(name);
	  //Add a chess board to the Layered Pane 
	 
	  chessBoard = new JPanel();
	  layeredPane.add(chessBoard, JLayeredPane.DEFAULT_LAYER);
	  chessBoard.setLayout( new GridLayout(8, 8) );
	  chessBoard.setPreferredSize( boardSize );
	  chessBoard.setBounds(0, 0, boardSize.width, boardSize.height);
	 
	  for (int i = 0; i < 64; i++) {
	  JPanel square = new JPanel( new BorderLayout() );
	  chessBoard.add( square );
	 
	  int row = (i / 8) % 2;
	  if (row == 0)
	  square.setBackground( i % 2 == 0 ? Color.black : Color.white );
	  else
	  square.setBackground( i % 2 == 0 ? Color.white : Color.black );
	  }
	  
	  Jeu noir = new Jeu(Couleur.NOIR);
	  Jeu blanc = new Jeu(Couleur.BLANC);
	  
	  JLabel piece = new JLabel( new ImageIcon("/home/tp/git/premiere-iteration-Cyprien-Galland/images/tourNoireS.png") );
	  JPanel panel = (JPanel)chessBoard.getComponent(0);
	  panel.add(piece);
	  
	  for (int k =0; k<noir.getPieces().size(); k++) {
		  Pieces i = noir.getPieces().get(k);
		  piece = new JLabel( new ImageIcon(ChessImageProvider.getImageFile(i.getClass().getName().split("model.")[1], i.getCouleur()) ));
		  	  
		  int n = k;
		  if (k == 1) {
			  n = 7;
		  }
		  if (k == 2) {
			  n = 1;
		  }
		  if (k == 3) {
			  n = 6;
		  }
		  if (k == 4) {
			  n = 2;
		  }
		  if (k == 6) {
			  n = 4;
		  }
		  if (k == 7) {
			  n = 3;
		  }
		  
		  panel = (JPanel)chessBoard.getComponent(n);
		  panel.add(piece);
	  }
	  for (int k =0; k<blanc.getPieces().size(); k++) {
		  Pieces i = blanc.getPieces().get(k);
		  piece = new JLabel( new ImageIcon(ChessImageProvider.getImageFile(i.getClass().getName().split("model.")[1], i.getCouleur()) ));
		  
		  int n = k;
		  if (k == 1) {
			  n = 7;
		  }
		  if (k == 2) {
			  n = 1;
		  }
		  if (k == 3) {
			  n = 6;
		  }
		  if (k == 4) {
			  n = 2;
		  }
		  if (k == 6) {
			  n = 3;
		  }
		  if (k == 7) {
			  n = 4;
		  }
		  
		  panel = (JPanel)chessBoard.getComponent(63-n);
		  panel.add(piece);
	  }	  
	  }
	

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	  }

package launcher.localLauncher;

import java.util.Observer;

import model.Coord;
import model.Pieces;
import model.Tour;
import model.observable.ChessGame;
import vue.ChessGameCmdLine;
import controler.controlerLocal.ChessGameControler;


/**
 * @author francoise.perrin
 * Lance l'exécution d'un jeu d'échec en mode console.
 */
public class LauncherCmdLine {
	
	public static void main(String[] args) {		
		/*
		ChessGame model;
		ChessGameControler controler;	
		ChessGameCmdLine vue;
		
		model = new ChessGame();	
		controler = new ChessGameControler(model);
		
		new ChessGameCmdLine(controler);	
		
		vue = new ChessGameCmdLine(controler);
		model.addObserver((Observer) vue);
		vue.go();
		*/
		
		Coord coords = new Coord(9,8);
		
		Pieces maTour = new Tour(model.Couleur.BLANC, coords);
		System.out.println(maTour.toString());
		System.out.println(maTour.isMoveOk(6, 8));
		System.out.println(maTour.isMoveOk(4, 6));
		System.out.println(maTour.isMoveOk(6,4));
		System.out.println(maTour.getCouleur());
		System.out.println(maTour.getX());
		System.out.println(maTour.getY());
		System.out.println(maTour.move(5, 5));
		System.out.println(maTour.move(6, 8));
		System.out.println(maTour.move(6, 2));
		System.out.println(maTour.capture());
		System.out.println(maTour.toString());
		
		
	}

}

package ui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import entities.Casilla;

public class MarioJFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private MarioJPanel panel;
	
	//Despues sacar, estan temporalmente acá
	private static Casilla[][] tablero;
	private static int CANTIDAD_CASILLAS = 12;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarioJFrame frame = new MarioJFrame(tablero, CANTIDAD_CASILLAS);
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MarioJFrame(Casilla[][] tablero, int cantidadCasillas) {
		//Full Screen
		setExtendedState(MAXIMIZED_BOTH); 
		
		//cerrar con la X la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setTitle(Textos.TITULO_PRINCIPAL);
		setLocationRelativeTo(null);
		
		panel = new MarioJPanel(tablero, cantidadCasillas);
		setContentPane(panel);
	}

}
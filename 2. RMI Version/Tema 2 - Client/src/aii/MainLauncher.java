/*
 * Aplicatii Integrate pentru Intreprinderi
 * 
 * Stefan-Dobrin Cosmin
 * 342C4
 */
package aii;

import java.awt.EventQueue;

import aii.gui.frames.AuthenticationFrame;

public class MainLauncher {

	/**
	 * Launch the application.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new AuthenticationFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

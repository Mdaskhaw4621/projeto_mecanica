package Splash;

import java.awt.*;
import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App extends JWindow{
    
	private int duration;
	
	// Criação do Método App
	public App (int d) {
		// Determinando duração do Splash
		duration = d;
	}
	
	public void showApp() {
		// Instância da tela 
		JPanel content = (JPanel)getContentPane();
		content.setBackground(Color.white);
		
		//Configura a posição e o tamanho da tela
		int width = 450;
		int height = 200;
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screen.width-width)/2;
		int y = (screen.height-height)/2;
		// Definindo o tamanho (coluna, linha, comprimento, altura) do Splash
		setBounds(x,y,width,height);
		
		//Constrói o splash screen
		
		ImageIcon img = new ImageIcon ("Logo_3.jpg");
		img.setImage(img.getImage().getScaledInstance(300, 200, 100));
		JLabel label = new JLabel(img);
		JLabel copyrt = new JLabel ("Loading...", JLabel.CENTER);
		copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
		// Adicionando elementos ao splash
		content.add(label, BorderLayout.CENTER);
		content.add(copyrt, BorderLayout.SOUTH);
		// Criação de uma nova cor
		Color oraRed = new Color(156,20,20,255);
		// Criação de borda
		content.setBorder(BorderFactory.createLineBorder(oraRed, 10));
		//Torna Visivel
		setVisible(true);
		
		//Espera ate que os recursos estejam carregados
		try {
			Thread.sleep(duration);
		}
		catch(Exception e) {}
		setVisible(false);
		
		
	}
	
	public void showAppAndExit() {
		// Chamada ao método construtor showApp
		showApp();
		// Sair do Programa
		System.exit(0);
	}
	
	public static void main( String[] args ){
       // Instancia da classe App e definindo tempo de duração do splash
    	App splash = new App(10000);
    	// Chamada ao método showAppAndExit
    	splash.showAppAndExit();
    }
}

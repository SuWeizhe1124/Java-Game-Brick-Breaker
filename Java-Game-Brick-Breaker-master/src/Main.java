import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) throws IOException {
		JFrame obj=new JFrame();
		Gameplay gamePlay = new Gameplay();
		
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Eliminate stress ball");		
		obj.setResizable(false);
		obj.setVisible(true);
		

		
	     
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
	 	  
	    final List<Image> icons = new ArrayList<Image>();
	     String imagePath = "LOGO-removebg-preview.png";
       File imageFile = new File(imagePath);
	     icons.add(ImageIO.read(imageFile));
	     obj.setIconImages(icons); 
                obj.setVisible(true);
		
	}

}

package TP2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AfficherMessageFechier implements IJournal{

	@Override
	public void outPut_Msg(String Message) {
		try {


			   File file = new File("test.txt");

			   // cr�er le fichier s'il n'existe pas
			   if (!file.exists()) {
			    file.createNewFile();
			   }

			   FileWriter fw = new FileWriter(file.getAbsoluteFile());
			   BufferedWriter bw = new BufferedWriter(fw);
			   bw.write(Message);
			   bw.close();

			   System.out.println("Modification termin�e!");

			  } catch (IOException e) {
			   e.printStackTrace();
			  }
		
	}
	
}

package TP2;

import EtudiantRep.EtudiantService;
import JournalRep.AfficherMessageDate;
import JournalRep.AfficherMessageDirectement;
import JournalRep.AfficherMessageFechier;
import JournalRep.IJournal;

public class MainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		EtudiantService serv=new EtudiantService(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx",1, 0, 0);
		try {
			serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx",1, 0, 0);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		IJournal message = new AfficherMessageDirectement();
		message.outPut_Msg("C'est le TP2");
		
		IJournal message2= new AfficherMessageDate();
		message2.outPut_Msg("C'est le TP2");
		
		IJournal message3 = new AfficherMessageFechier();
		message3.outPut_Msg("C'est le TP2");
	}




}

package JournalRep;

public class Afficher_tout extends Journal{

protected String message ="TP2 Est afficher ";
	
	protected IJournal msg = new AfficherMessageDirectement();
	protected IJournal msg2 = new AfficherMessageDate();
	protected IJournal msg3 = new AfficherMessageFechier();
}

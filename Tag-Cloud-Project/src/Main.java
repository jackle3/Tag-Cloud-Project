import java.awt.Color;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JFrame;
@SuppressWarnings("serial")
//Computer Science 3 Tag Cloud Project - Nathan Nguyen(7th period) & Jack Le (4th Period)

/*
 * Main.java - extends the JFrame and sets it up. Instantiates the other classes
 * and allows them to interact with each other. It is the file that is run to
 * start the program.
 * 
 * @author Nathan Nguyen
 */
public class Main extends JFrame {
	
	private static Data site;
	private static Display disp;
	public static final int WIDTH = 1200, HEIGHT = 950;
	
	public Main() {
		super("Tag Cloud Project - Jack Le & Nathan Nguyen");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(WIDTH+20,HEIGHT+50);
		setBackground(Color.BLACK);
		getContentPane().add(disp);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		
	}
		
	public static void main(String[] args) throws Exception {
		/*Scanner kb = new Scanner(System.in);
		System.out.println("What website would you like to make a tag cloud out of?");
		String url = kb.nextLine();*/
		//String url = "https://www.espn.com/";
		//String url = "https://www.xvideos.com/";
		String url = "https://www.cfisd.net/en";
		//String url = "https://www.pornhub.com/";
		System.out.println(url);
		//String url = "fsafasf";
		Scraper scr = new Scraper(url);
		String s = scr.getWebsite();
		site = new Data(s);	
		
		Map<String,Integer> tester = new TreeMap<>();
		tester.put("fsadfsaf", 10);
		tester.put("fsdafsffsadf", 10);
		tester.put("fdsafsagsag", 10);
		disp = new Display(site.getMax(),site.getCloud());
		//disp = new Display(site.getMax(),tester);
		
		/*System.out.println(s);
		
		System.out.println(site.getCloud());
		System.out.println("MAX " + site.getMax());*/
		
		new Main();
		//kb.close();
	}
}


package week3.day2.inheritance;

//Class        :Desktop

public class Desktop extends Computer {

//Methods   :desktopSize()
	
	public void desktopSize() {
		System.out.println("Print Desktop size ");
	}

/*create above 2 class and call all your class methods into the 
Desktop using single inheritance.*/
	
	public static void main(String[] args) {
		
		Desktop a = new Desktop();
		a.computerModel();
		a.desktopSize();
	}
}
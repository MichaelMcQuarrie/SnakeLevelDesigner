public class Application {
	
	private BackEnd backEnd;
	private FrontEndGTerm uiGT;
	

	public Application() {
		this.backEnd = new BackEnd();
		this.uiGT = new FrontEndGTerm(this.backEnd);
		
		
		
	}

	public static void main(String[] args) {
		Application app = new Application();
	}
}
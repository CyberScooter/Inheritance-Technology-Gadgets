
public class iPhone extends Smartphone{
	private double cost;
	private int cameraMP;
	
	

	public iPhone(boolean powerState, boolean chargingPort, double cost, int cameraMP) {
		super(0, "None", powerState, chargingPort);
		this.cost = cost;
		this.cameraMP = cameraMP;
	}
		
		public void snapPicture(){
			System.out.println(cameraMP + " Mega Pixel" + " Selfie has been sent to Apple headquarters");
		}
		public void AppStore(String app){
			System.out.println("Installing... " + app);
		} 
		public void refund(){
			System.out.println("It must be good, it costs: " + cost);
		}

	
		
	
	
	
	
}


public class Smartphone extends TechGadget{
	private int volume;
	private String application;
	
	public Smartphone(int volume, String application, boolean powerState, boolean chargingPort) {
		super(powerState, chargingPort);
		this.volume = volume;
		this.application = application;
	}
	public void volumeUp(int amount){
		if(volume <= 100){
			volume += amount;
		}else{System.out.println("Volume cannot be increased");}
	}
	public void volumeDown(int amount){
		if((volume - amount) >= 0){
			volume -= amount;
		}else{System.out.println("Volume cannot be lowered");}
	}
	public void lockPhone(boolean option){
		if(option == true){
			turnOff();
		}
	}
	public void unlockPhone(boolean option){
		if(option == false){
			turnOn();
		}
	}
	
	@Override
	public void turnOn() {
		System.out.println("Smartphone is initialising...");
		super.turnOn();
	}
	@Override
	public void turnOff() {
		System.out.println("Smartphone is powering off...");
		super.turnOff();
	}
	
	public void changeApplication(String application){
		this.application = application;
		System.out.println("Running ..." + application);
		
	}
	public void closeApplication(){
		this.application = "";
	}
	
	public int getVolume() {
		return volume;
	}

	public String getApplication() {
		return application;
	}
	
	
	
	
	
}

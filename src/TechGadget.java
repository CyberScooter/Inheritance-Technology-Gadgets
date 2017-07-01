
public class TechGadget {
	private boolean powerState;
	private boolean chargingPort;
	
	public TechGadget(boolean powerState, boolean chargingPort) {
		this.powerState = powerState;
		this.chargingPort = chargingPort;
	}
	
	public void turnOn(){
		System.out.println("Turning on");
		powerState = true;
	}
	public void turnOff(){
		System.out.println("Turning off");
		powerState = false;
	}

	public void setChargeTrue(){
		chargingPort = true;
	}
	public void setChargeFalse(){
		chargingPort = false;
	}

	public boolean isPowerState() {
		return powerState;
	}

	public boolean getChargingPort() {
		return chargingPort;
	}
	
	
}

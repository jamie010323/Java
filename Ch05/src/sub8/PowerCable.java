package sub8;

public class PowerCable implements Socket {

	private Bulb bulb;
	
		public PowerCable(Bulb blub) {
		this.bulb = bulb;
	}
	
	@Override
	public void switchOn() {
		bulb.lightOn();
	}

	@Override
	public void switchOff() {
		bulb.lightOff();
		
	}

	
}

public class Car {

	private Engines engine ;

	/*
	 * public Car(Engines engine) { this.engine=engine; }
	 */
	
	public void setEngine(Engines engines) {
		this.engine=engines;
	}
	
	public void drive() {

		int ok = engine.start();

		if (ok > 0) {
			System.out.println("Engine started");
		} else {
			System.out.println("Engine not started");
		}

	}

}

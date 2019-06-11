
public class AutoCar implements OperateCar {
	public void start();
	System.out.println("자동차가 출발합니다.");
	
	public void stop();
	System.out.println("자동차가 멈춥니다.");
	
	public void setSpeed(int speed) {
		System.out.println("자동차 속도가"+speed);
	}
	
	public void turn(int degree) {
		System.out.println("자동차가 방향을"+degree);
	}

	
	}

}

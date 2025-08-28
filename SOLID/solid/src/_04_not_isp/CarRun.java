package _04_not_isp;

class Sedan implements Car {

	@Override
	public void drive() {System.out.println("운행중");}

	@Override
	public void turnLeft() {System.out.println("좌회전");}

	@Override
	public void turnRight() {System.out.println("우회전");}

	@Override
	public void stop() {System.out.println("정지");}

	@Override
	public void water() {}	// 사용하지 않음

	@Override
	public void patientTransport() {}	// 사용하지 않음

	@Override
	public void siren() {}	// 사용하지 않음
}

class FireEngine implements Car {
	@Override
	public void drive() {System.out.println("운행중");}

	@Override
	public void turnLeft() {System.out.println("좌회전");}

	@Override
	public void turnRight() {System.out.println("우회전");}

	@Override
	public void stop() {System.out.println("정지");}

	@Override
	public void water() {System.out.println("물을 뿌립니다");}

	@Override
	public void patientTransport() {}	// 사용하지 않음

	@Override
	public void siren() {System.out.println("삐요삐요");}
}

class Ambulance implements Car {
	@Override
	public void drive() {System.out.println("운행중");}

	@Override
	public void turnLeft() {System.out.println("좌회전");}

	@Override
	public void turnRight() {System.out.println("우회전");}

	@Override
	public void stop() {System.out.println("정지");}

	@Override
	public void water() {}		// 사용하지 않음

	@Override
	public void patientTransport() {System.out.println("응급조치");}

	@Override
	public void siren() {System.out.println("삐요삐요");}
}

public class CarRun {
	public static void main(String[] args) {
		

	}
}

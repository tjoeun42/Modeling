package _03_observer;

public class ObserverA implements Observer {

	@Override
	public void update() {
		System.out.println("ObserverA님 이벤트 알림이 왔습니다");
	}

	@Override
	public String toString() {
		return "ObserverA";
	}
}

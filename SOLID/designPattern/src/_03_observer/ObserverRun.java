package _03_observer;

public class ObserverRun {
	public static void main(String[] args) {
		// 발행자 등록(누구에게 알려줄 것인지)
		Subject subject = new ConcreteSubject();
		
		// 발행자를 구독할 관찰자를 리스트에 등록
		ObserverA oa = new ObserverA();
		ObserverB ob = new ObserverB();
		subject.registerObserver(oa);
		subject.registerObserver(ob);
		
		// 이벤트 발생
		subject.notifyObserver();
		
		// 구독취소
		subject.removeObserver(ob);
		
		subject.notifyObserver();
	}
}

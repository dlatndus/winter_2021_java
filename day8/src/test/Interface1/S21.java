package test.Interface1;


public class S21 implements SmartPhone {

	@Override
	public void installApp(String appName) {
		System.out.println(appName + "앱을 인스톨한다");

	}

	@Override
	public void runApp(String appName) {
		System.out.println(appName + "앱을 실행한다");

	}

	@Override
	public String searchMusic(String word) {
		System.out.println("음악을 검색한다");
		return word + "_music.mp3";
	}

	@Override
	public void playMusic(String music) {
		System.out.println(music + " 음악이 재생된다");

	}

	@Override
	public void stopMusic() {
		System.out.println("재생중인 음악을 정지한다");

	}

	@Override
	public void sendCall(String phoneNumber) {
		System.out.println(phoneNumber + "에 전화를 건다");

	}

	@Override
	public void receiveCall(String phoneNumber) {
		System.out.println(phoneNumber + "에서 걸려온 전화를 받는다");

	}

	@Override
	public void sendSMS(String phoneNumber) {
		System.out.println(phoneNumber + "에 문자를 보낸다");

	}

	@Override
	public void recevieSMS(String phoneNumber) {
		System.out.println(phoneNumber + "에 문자를 받는다");
	}
}


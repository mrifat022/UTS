public class Robot{
	public int Sensor;
	public int Servo;
	public int Power;

	public Robot(){
		Sensor=4;
			System.out.println("Jumlah Sensor Robot = "+Sensor);
	}
}

class Asimo19 extends Robot{
	public int Camera;

	public Asimo19(int w, int x, int y, int z){
		Sensor=w;
		Servo=x;
		Power=y;
		Camera=z;
	}
	public void CetakSpesifikasi(){
		System.out.println("Jumlah Sensor Asimo19 = " +Sensor);
		System.out.println("Jumlah Servo = " +Servo);
		System.out.println("Kapasitas Power = " +Power);
		System.out.println("Jumlah Camera = " +Camera);
	}
	public void Upgrade(int a){
		Sensor = a;
		System.out.println("Asimo19 Di Upgrade Dengan Sensor = " +Sensor);
	}
}
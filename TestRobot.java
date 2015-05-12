public class TestRobot
{
	public static void main(String[] args)
	{
		Asimo19 unit = new Asimo19(30, 150, 1000, 5);
		unit.CetakSpesifikasi();
		unit.Upgrade(20);
		unit.Upgrade(25);
	}
}
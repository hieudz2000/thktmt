
public class Aims {

	public static void main(String[] args) {
		
		Oder anOrder = new Oder(); 
		DigitalVideoDisc d1 = new DigitalVideoDisc("John Wick","Action","Hoang",123,50);
		DigitalVideoDisc d2 = new DigitalVideoDisc("Doraemon","children","Nambazilt",90,55);
		DigitalVideoDisc d3 = new DigitalVideoDisc("Spiderman","drama","Den Houser",100,90);
		DigitalVideoDisc d4 = new DigitalVideoDisc("Hulk","action","Joan Lapotar",120,60);
		DigitalVideoDisc d5 = new DigitalVideoDisc("Silent Hill","horor","Koon De",95,95);
		String phone = "012 3456789";
		String[] output = phone.split(" ");
		System.out.println(output[0]);
		System.out.println(output[1]);
		anOrder.addDigitalVideoDisc(d1);
		anOrder.addDigitalVideoDisc(d2);
		anOrder.addDigitalVideoDisc(d4);
		
		System.out.println(anOrder.totalCost());
	}
}

public class Car{

	private int gasAmount;
	private int carAge;
	private String carName;
	
	public Car(int gasAmount, int carAge, String carName){
		this.gasAmount = gasAmount;
		this.carAge = carAge;
		this.carName = carName;
		
	}
	
	public void honk(){
		System.out.println("Honk");
	}
		

}
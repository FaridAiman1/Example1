//Author: Muhammad Farid Aiman
public class Driver{
	
	public static void main(String []arg){

		Fish nemo = new Fish();

		nemo.Swim();
		nemo.color = "red";
		nemo.Swim();

		Fish dory = new Fish();
		dory.Swim();
		dory.color = "yellow";
		dory.Swim();
	}
}
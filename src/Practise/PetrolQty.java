package Practise;
//Petrol 1l rupee = 84.68
public class PetrolQty {
	float Qty(float rupee)
	{
		float quantity;
		quantity = (float) (rupee / 84.68);
		return quantity;
	}
public static void main(String[] args) {
	PetrolQty p = new PetrolQty();
	float quantity = p.Qty(100);
	
	System.out.println(quantity);
}
}

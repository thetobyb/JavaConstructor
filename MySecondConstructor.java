public class MySecondConstructor {
	
	String Name;
	String Type;
	int Age;
	double Height;
	String Rarity;
	
	public MySecondConstructor(String name, String type, int age, double height, String rarity) {
		
		Name = name;
		Type = type;
		Age = age;
		Height = height;
		Rarity = rarity;
		
		
	}
	public static void main(String[] args) {
		
		MySecondConstructor TreeOne = new MySecondConstructor("Marley", "Oak", 101, 5.2, "Uncommon");
		
		System.out.println("Tree Name: " + TreeOne.Name);
		System.out.println("Tree Type: " + TreeOne.Type);
		System.out.println("Tree Age: " + TreeOne.Age);
		System.out.println("The height of Marley is " + TreeOne.Height + " Metres");
		// TODO Auto-generated method stub

	}

}
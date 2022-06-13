import java.util.*;
class CPU
{
	double price;
	class Processor
	{
		int cores;
		String manufacturer;
		void show()
		{
			System.out.println("Price = " + price + "\nCores = " + cores + "\nManufacturer = " + manufacturer);
		}
	}
	static class RAM
	{
		String memory;
		String manufacturer;
		void show()
		{
			System.out.println("Memory = " + memory + "\nRam Manufacturer = " + manufacturer);
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		CPU cpu = new CPU();
		System.out.println("Enter the details :"); 
		System.out.print("Price of CPU: ");
		cpu.price = Integer.parseInt(sc.nextLine());
		Processor pro = cpu.new Processor();
		System.out.print("Enter number of cores: ");
		pro.cores = Integer.parseInt(sc.nextLine());
		System.out.print("Enter processor manufacturer: ");
		pro.manufacturer = sc.nextLine();
		RAM ram = new RAM();
		System.out.print("Enter RAM memory: ");
		ram.memory = sc.nextLine();
		System.out.print("Enter RAM manufacturer: ");
		ram.manufacturer = sc.nextLine();
		pro.show();
		ram.show();
		
	}
}

output
------

Enter the details :
Price of CPU: 50000
Enter number of cores: 5
Enter processor manufacturer: Dell
Enter RAM memory: 128
Enter RAM manufacturer: Dell
Price = 50000.0
Cores = 5
Manufacturer = Dell
Memory = 128
Ram Manufacturer = Dell
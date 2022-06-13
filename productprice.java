import java.util.*;
class productprice
{
	int p_code;
	String p_name;
	double p_price;
	public void show()
	{
		System.out.print("Code = " + this.p_code + "\nName = " + this.p_name + "\nPrice = " + this.p_price);
	}
	productprice(int code,String name,double price)
	{
		this.p_code = code;
		this.p_name = name;
		this.p_price = price;
	}
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);	
		int code;
		String name;
		double price;
		productprice[] prd = new productprice[3];
		System.out.println("Enter the details:");
		for(int i = 0; i<3; i++)
		{
			System.out.print("product code" + (i+1) + ": ");
			code = Integer.parseInt(sc.nextLine());
			System.out.print("product name" + (i+1) + ": ");
			name = sc.nextLine();
			System.out.print("product price " + (i+1) + ": ");
			price = Double.parseDouble(sc.nextLine());
			prd[i] = new productprice(code, name, price);
		}
		System.out.println("Product with lowest price is:");
		Double[] prices = new Double[]{prd[0].p_price, prd[1].p_price, prd[2].p_price};
		double min = Math.min(Math.min(prices[0], prices[1]), prices[2]);
		int index= Arrays.asList(prices).indexOf(min);
		prd[index].show();
	}
}

output
------

Enter the details:
product code1: 2
product name1: pen
product price 1: 10
product code2: 4
product name2: eraser
product price 2: 3
product code3: 5
product name3: box
product price 3: 45
Product with lowest price is:
Code = 4
Name = eraser
Price = 3.0
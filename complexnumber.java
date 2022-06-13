import java.util.*;
class complexnumber
{
	int real, img;
	complexnumber(int real, int img){
		this.real = real;
		this.img = img;
	}
	void show(){
		System.out.println("Complex number = " + this.real + " + " + this.img + " i ");
	}
	public static complexnumber add(complexnumber n1,complexnumber n2)
	{
		complexnumber result=new complexnumber(0,0);
		result.real = n1.real + n2.real;
		result.img = n1.img + n2.img;
		return result;
	}

	public static void main(String args[]){
		complexnumber[] c = new complexnumber[2];
		Scanner sc = new Scanner(System.in);
		int l_real, l_img;
		
		for(int i = 0; i<2; i++){
			System.out.print("Complex no " + (i+1) + " Real: ");
			l_real = sc.nextInt();
			System.out.print("Complex no " + (i+1) + " Img: ");
			l_img = sc.nextInt();

			c[i] = new complexnumber(l_real, l_img);
		}
		
		complexnumber result = add(c[0], c[1]);
		System.out.println("After addition\nResult is:");
        	result.show();
	}
}

output
------

Complex no 1 Real: 5
Complex no 1 Img: 3
Complex no 2 Real: 2
Complex no 2 Img: 1
After addition
Result is:
Complex number = 7 + 4 i
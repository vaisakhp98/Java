import java.util.*;
class array
{
	public static void main(String args[])
	{
		int[] my_array1={101,235,111,555,107,234,869,367};
		String[] my_array2={"java","python","php","c#","c","c++"};
		System.out.println("Original string numeric array: "+Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.println("Sorted numeric array: "+Arrays.toString(my_array1));
		System.out.println("Original string array: "+Arrays.toString(my_array2));
		Arrays.sort(my_array2);
		System.out.println("Sorted string array: "+Arrays.toString(my_array2));
	}
}

output
------

Original string numeric array: [101, 235, 111, 555, 107, 234, 869, 367]
Sorted numeric array: [101, 107, 111, 234, 235, 367, 555, 869]
Original string array: [java, python, php, c#, c, c++]
Sorted string array: [c, c#, c++, java, php, python]
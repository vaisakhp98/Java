import java.util.*;
class addMatrix
{
	public static void main(String args[])
	{
		int row,col,i,j;
		Scanner obj=new Scanner(System.in);
 		System.out.print("Enter the number of rows: ");
		row =obj.nextInt();
 		System.out.print("Enter the number of columns: ");
		col=obj.nextInt();
 		int mat1[][] = new int[row][col];
		int mat2[][] = new int[row][col];
		int result[][] = new int[row][col];
 		System.out.println("Enter the elements of 1st matrix: ");
 		for (i=0;i<row;i++)
		{ 
 			for(j=0;j<col;j++)
				mat1[i][j]=obj.nextInt();
 			System.out.println();
		}
		System.out.println("Enter the elements of 2nd matrix:");
 		for(i=0;i<row;i++)
		{
 			for(j=0;j<col;j++)
			mat2[i][j]=obj.nextInt();
 			System.out.println();
		}
		for(i=0;i<row;i++)
		for(j= 0;j<col;j++)
		result[i][j]=mat1[i][j]+mat2[i][j] ; 
		System.out.println("Sum of matrices: ");
		for(i=0;i<row;i++)
		{ 
			for(j=0;j<col;j++)
			System.out.print(result[i][j]+"\t");
 			System.out.println();
		}
 
	}
}

output
------

Enter the number of rows: 2
Enter the number of columns: 2
Enter the elements of 1st matrix:
2
3

5
8

Enter the elements of 2nd matrix:
1
6

3
4

Sum of matrices:
3       9
8       12


public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 6, no = 1;

		for(int i = 0; i < rows; i++) //this loop is for forming a pyramid structure
		{
			for(int space = 1; space < rows - i; space++)
			{
				System.out.print("  ");
			}

			for(int j = 0; j <= i; j++)// this loop is for printing the numbers
			{
				if (j == 0 || i == 0)
					no = 1;
				else
					no = no * (i - j + 1) / j;
				

				System.out.printf("%4d", no);
			}
			System.out.println();
		}

	}
	

}

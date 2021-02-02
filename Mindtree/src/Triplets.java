import java.util.Scanner;
public class Triplets {

		public static void sum(int[] a, int n) {
			boolean found = false;
			System.out.println("Triplets:");
			for (int i = 0; i < n - 2; i++) {
				for (int j = i + 1; j < n - 1; j++) {
					for (int k = j + 1; k < n; k++) {
						if (a[i] + a[j] == a[k]) {
							System.out.print(a[i]);
							System.out.print(" ");
							System.out.print(a[j]);
							System.out.print(" ");
							System.out.print(a[k]);
							System.out.print("\n");
							found = true;
						}
					}
				}
			}
			if (found == false)
				System.out.println(" Triplets does not exist!");
		}

		public static void main(String[] args) {
			int flag = 0;
			do {
				Scanner obj = new Scanner(System.in);
				System.out.println("Triplets");
				System.out.print("Enter the Size of array:");
				int n = obj.nextInt();
				int a[] = new int[n];
				System.out.println("Enter the values:");
				for (int i = 0; i < n; i++) {
					a[i] = obj.nextInt();
				}
				sum(a, n);
				obj.close();
				flag = 1;
			} while (flag != 1);
		}
	}

	
	
	


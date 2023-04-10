package basicofjava;

import java.util.Scanner;

public class DaysYearsWeesDays {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter number of days: ");
			int days = sc.nextInt();
			{
			int years = days / 365;
			int weeks = (days % 365) / 7;
			int remainingDays = (days % 365) % 7;
			System.out.println(days + " days");
			System.out.println(years + " years");
			System.out.println(weeks + " weeks");
			System.out.println(remainingDays + " days");
			{
			}
			}
		}
	}


		
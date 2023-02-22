import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		 Movie movie = new Movie();
		 String answer="yes";
		 while(answer.equals("yes")) {
		 System.out.println("Enter title of the movie");
		 movie.setTitle(scanner.nextLine());
		 System.out.println("Enter rating of the movie ");
		 movie.setRating(scanner.nextLine());
		 System.out.println("Enter number of tickets sold ");
		 movie.setSoldTickets(scanner.nextInt());
		 scanner.nextLine();
		 System.out.println("\n");
		 String credits= movie.toString();
		 System.out.println(credits);
		 System.out.println("Do you want to enter another (yes or no)");
		 answer=scanner.nextLine();
		 }
		 System.out.println("Thank you for using this program and goodbye ");
	}

}

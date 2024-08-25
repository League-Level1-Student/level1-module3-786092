package _04_netflix;

public class MovieRunner {
	public static void main(String[]args) {
		Movie movie1 = new Movie("Space Jam", 4);
		Movie movie2 = new Movie("Home Alone", 5);
		Movie movie3 = new Movie("Harry Potter", 4);
		Movie movie4 = new Movie("Showtime Lakers", 5);
		Movie movie5 = new Movie("Shaq & Kobe Lakers Dynasty", 5);
		System.out.println(movie5.getTicketPrice());
		NetflixQueue netflix = new NetflixQueue();
		netflix.addMovie(movie1);
		netflix.addMovie(movie2);
		netflix.addMovie(movie3);
		netflix.addMovie(movie4);
		netflix.addMovie(movie5);
		netflix.printMovies();
		netflix.sortMoviesByRating();
		System.out.println("The best movie is " + netflix.getBestMovie());
		System.out.println("The second best movie is " + netflix.getMovie(1));
		
	}
}

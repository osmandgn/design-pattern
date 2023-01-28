package StructuralDP.CompositeDP.MoviesEx;

public class Main {
    public static void main(String[] args){

        MovieContainer thrillerContainer = new MovieContainer();
        thrillerContainer.addMovie(new Thriller(1,"The Silence of the Lambs","11 Ekim 1991",8.6));
        thrillerContainer.addMovie(new Thriller(2,"Basic Instinct","27 Kasım 1992",7.0));

        MovieContainer horrorContainer = new MovieContainer();
        horrorContainer.addMovie(new Horror(3,"Scream","15 Ağustos 1997",7.4));

        MovieContainer container = new MovieContainer();

        container.addMovie(thrillerContainer);
        container.addMovie(horrorContainer);

        container.showMovieInfo();

    }
}
class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie newMovie, int newDaysRented) {
        this.setNewMovie(newMovie);
        this.setDaysRented(newDaysRented);
    }
    private void setNewMovie(Movie newMovie) {movie = newMovie;}
    private void setDaysRented(int newDaysRented) {daysRented = newDaysRented;}
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }
}
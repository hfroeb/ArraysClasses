public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Dog dog = new Dog();
        dog.name = "Moose";
        dog.age = 12;
        dog.gender = "female";
        dog.breed = "Lab";
        dog.isAlive = true;

        Dress dress = new Dress();
        dress.color = "Black";
        dress.size = 4;
        dress.itFits= true;

        Movie movie = new Movie();
        movie.movieRating = movie.movieRatings[2];
        movie.ticketSales = 355;
        movie.title = "Forrest Gump";

        Drink drink = new Drink();
        drink.drinkName = "Shirley Temple";
        drink.orderNumber = 72;
        drink.nonAlcoholic = true;

        Uber uber = new Uber();
        uber.driverName = "Carl";
        uber.numberOfPassengers = 3;
        uber.arrived = true;
        uber.tripDuration = 17;


        }
    }
}

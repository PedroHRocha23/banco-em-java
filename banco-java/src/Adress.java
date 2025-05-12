public class Adress {
    private String street;
    private int number;
    private String neighborhood;
    private String city;
    private String state;
    private PostalCode postalCode;

    public Adress(String street, int number, String neighborhood, String city, String state, PostalCode postalCode){
        this.street = street;
        this.number = number;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }
}

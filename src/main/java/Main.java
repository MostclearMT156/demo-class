public class Main {
    public static void main(String[] args) {
        Card card1 = new Card();
        card1.title = "Пылесос";
        card1.url = "https://www.website.com";
        Description description1 = new Description();
        description1.price = 500;
        description1.description = "Моющий, мощный, huawei";

        card1.description = description1;

        Flat flat1 = new Flat();
        Bedroom bedroom1 = new Bedroom();
        bedroom1.beds = 2;
        bedroom1.square = 400;
        flat1.bedroom = bedroom1;
    }
}

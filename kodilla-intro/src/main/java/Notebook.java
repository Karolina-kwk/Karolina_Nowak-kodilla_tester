public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive");
        }
    }
    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is light");
        } else if (this.weight > 700 && this.weight < 2000) {
            System.out.println("This notebook is not so heavy");
        } else {
            System.out.println("This notebook is quite heavy");
        }

    }
    public void checkYear() {
        if (this.weight < 700 && this.year >= 2019) {
            System.out.println("Brand new notebook!");
        } else if (this.weight > 700 && this.weight < 1900 && this.year < 2018 && this.year > 2016) {
            System.out.println("Not old not new");
        } else {
            System.out.println("Time for new notebook");
        }
    }

}
package _hw_1;

enum Currency {

    USD("$"),
    EUR("€"),
    GPB("£");

    private String value;

    Currency(String value) {
        this.value = value;
    }
}

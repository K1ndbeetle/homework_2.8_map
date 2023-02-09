package Transport.enums;

public enum BodyTypes {
    SEDAN("седан"),
    HATCHBACK("хетчбэк"),
    COUPE("купе"),
    WAGON("универсал"),
    SUV("внедорожник"),
    CROSSOVER("кроссовер"),
    PICKUP("пикап"),
    VAN("фургон"),
    MINIVAN("минивэн");

    private final String bodyTypes;

    BodyTypes(String bodyTypes) {
        this.bodyTypes = bodyTypes;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + bodyTypes + ".";
    }
}

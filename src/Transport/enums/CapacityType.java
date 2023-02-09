package Transport.enums;

public enum CapacityType {
    LITTLE(null, 10),
    SMALL(null  , 25),
    MEDIUM(25, 50),
    BIG(50, 80),
    GREAT(80, 120);
    private Integer minCapacity;
    private Integer maxCapacity;

    CapacityType(Integer minCapacity, Integer maxCapacity) {
        this.minCapacity = minCapacity;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        if (minCapacity == null) {
            return "Вместимость до: " + maxCapacity + " мест.";
        } else {
            return "Вместимость от: " + minCapacity + " до " + maxCapacity + " мест.";
        }
    }
}
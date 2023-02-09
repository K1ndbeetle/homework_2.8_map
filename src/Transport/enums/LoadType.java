package Transport.enums;

public enum LoadType {
    N1(null, 3.5F),
    N2(3.5F, 12F),
    N3(12F, null);
    private Float min;
    private Float max;

    LoadType(Float min, Float max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        if (min == null) {
            return "Грузоподъемность: до " + max + " тонн.";
        } else if (max == null) {
            return "Грузоподъемность: свыше " + min + " тонн.";
        } else {
            return "Грузоподъемность: от " + min + " до " + max + " тонн.";
        }
    }
}
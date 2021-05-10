package stream;

import enums.homework.HttpCode;

import java.util.Arrays;

public enum Categories {
    JUNIORS(0, 14000, "Joniors"),
    MIDDLE(14001, 21000, "Middle"),
    SENIORS(21001, Integer.MAX_VALUE , "Seniors");

    private final int min;
    private final int max;
    private final String name;

    Categories(int min, int max, String name) {
        this.min = min;
        this.max = max;
        this.name = name;
    }

    public static Categories getCategore(int val) {
        Categories[] categories = values();
        return Arrays.stream(categories).filter(item -> val >= item.min && val <= item.max)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(val + " not supported"));
    }

    @Override
    public String toString() {

        return name;
    }
}

package finalExam;

import java.util.Arrays;

public enum Status {
    SHORT(0,9),
    MEDIUM(10,19),
    LONG(20,200);

    private final int min;
    private final int max;

    Status(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static Status getStatus(int length){
        Status[] status = values();
          return Arrays.stream(status).filter(item -> length >= item.min && length <= item.max)
            .findFirst()
                .orElseThrow(() -> new IllegalStateException(length + " not supported"));
    }
}

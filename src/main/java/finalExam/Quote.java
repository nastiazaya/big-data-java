package finalExam;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Builder
@AllArgsConstructor
public class Quote implements Serializable {
    private int id;
    private String text;
    private Status status;

}
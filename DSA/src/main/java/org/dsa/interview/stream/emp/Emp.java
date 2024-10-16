package org.dsa.interview.stream.emp;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Emp {
    private String name;
    private Double salary;
}

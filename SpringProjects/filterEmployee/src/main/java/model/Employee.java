package model;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    private String firstName;
    private String lastName;
    private float salary;
    private short deptId;
}

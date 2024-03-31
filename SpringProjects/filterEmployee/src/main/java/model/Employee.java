package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component

public class Employee {
    private String firstName;
    private String lastName;
    private float salary;
    private short deptId;
}

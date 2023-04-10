package tech.getarrays.employeemanager.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    private String employeeCode;

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    //    @PrePersist
//    void prePersist() {
//        this.employeeCode = UUID.randomUUID().toString();
//    }

//    public String getEmployeeCode() {
//        return employeeCode;
//    }
//
//    public void setEmployeeCode(String employeeCode) {
//        this.employeeCode = employeeCode;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "id = " + id +
                ", name = '" + name +
                ", email = '" + email +
                "jobTitle = '" + jobTitle +
                "phone = '" + phone +
                "imageUrl = '" + imageUrl +
                '}';
    }
}

package co.develhope.hybernate.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_students")
    private long studentId;

    @Column(name = "email_students", unique = true, nullable = false)
    private String email;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "student")
    private List<Enrollment> studentEnrollmentList;

    public Student() {
    }

    public Student(long studentId, String email, String firstName, String lastName, List<Enrollment> studentEnrollmentList) {
        this.studentId = studentId;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentEnrollmentList = studentEnrollmentList;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Enrollment> getStudentEnrollmentList() {
        return studentEnrollmentList;
    }

    public void setStudentEnrollmentList(List<Enrollment> studentEnrollmentList) {
        this.studentEnrollmentList = studentEnrollmentList;
    }
}
package co.develhope.hybernate.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classes ")
public class SchoolClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_classes")
    private long schoolClassId;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String title;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "schoolClass")
    private List<Enrollment> classEnrollmentList;

    public SchoolClass() {
    }

    public SchoolClass(long schoolClassId, String description, String title, List<Enrollment> classEnrollmentList) {
        this.schoolClassId = schoolClassId;
        this.description = description;
        this.title = title;
        this.classEnrollmentList = classEnrollmentList;
    }

    public long getSchoolClassId() {
        return schoolClassId;
    }

    public void setSchoolClassId(long schoolClassId) {
        this.schoolClassId = schoolClassId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Enrollment> getClassEnrollmentList() {
        return classEnrollmentList;
    }

    public void setClassEnrollmentList(List<Enrollment> classEnrollmentList) {
        this.classEnrollmentList = classEnrollmentList;
    }
}
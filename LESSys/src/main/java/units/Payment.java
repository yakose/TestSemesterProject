package units;

import javax.persistence.*;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
public class Payment implements Serializable {
    public Payment(Student student, Course course, Double payment_amt, Calendar date) {
        this.student = student;
        this.course = course;
        this.payment_amt = payment_amt;
        this.date = date;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "course_id")
    private Course course;

    private Double payment_amt;

    private Calendar date;

    public Payment(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Double getPayment_amt() {
        return payment_amt;
    }

    public void setPayment_amt(Double payment_amt) {
        this.payment_amt = payment_amt;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
}
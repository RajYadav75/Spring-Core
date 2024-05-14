package in.raj.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Person {
    private Integer personId;
    private String personName;
    private String gender;
    private Long phno;
    private Date dob;

    /*public Person() {

    }

    public Person(Integer personId, String personName, String gender, Long phno, Date dob) {
        this.personId = personId;
        this.personName = personName;
        this.gender = gender;
        this.phno = phno;
        this.dob = dob;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getPhno() {
        return phno;
    }

    public void setPhno(Long phno) {
        this.phno = phno;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", gender='" + gender + '\'' +
                ", phno=" + phno +
                ", dob=" + dob +
                '}';
    }*/
}

package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "id_card")
public class IdCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_card_id")
    private Long id;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "issued_by")
    private String issuedBy;

    @Column(name = "issued_date")
    private String issuedDate;

    @Column(name = "valid_till")
    private String validTill;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public String getIssuedBy() { return issuedBy; }
    public void setIssuedBy(String issuedBy) { this.issuedBy = issuedBy; }

    public String getIssuedDate() { return issuedDate; }
    public void setIssuedDate(String issuedDate) { this.issuedDate = issuedDate; }

    public String getValidTill() { return validTill; }
    public void setValidTill(String validTill) { this.validTill = validTill; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
}
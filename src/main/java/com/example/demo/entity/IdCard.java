@Entity
public class IdCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cardNumber;
    private String issuedBy;
    private String validTill;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
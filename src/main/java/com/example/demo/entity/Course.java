@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String courseName;
    private int durationMonths;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
}
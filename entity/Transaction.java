@Entity
@Getter @Setter
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private LocalDateTime date;

    @ManyToOne
    private Account sender;

    @ManyToOne
    private Account receiver;
}
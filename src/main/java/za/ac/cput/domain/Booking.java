package za.ac.cput.domain;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long booking_id;
    private LocalTime startTime;
    private LocalTime endTime;
    private LocalDate date;
    @OneToOne
    @JoinColumn(name = "tutor_id")
    private Tutor tutor;
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @OneToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
    @OneToOne
    @JoinColumn(name = "location_id")
    private Location location;
    private String topic;
    public enum Status{UPCOMING, PAST}
    private Status status;


}

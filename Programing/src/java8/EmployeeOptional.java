package java8;

import java.time.LocalDate;
import java.util.Optional;

public class EmployeeOptional {
    private  final  int id;
    private final String name;
    private final LocalDate birthDate;
    private final LocalDate plannedJoingDate;
    private final Optional<LocalDate> actualJoinDate;

    public EmployeeOptional(int id, String name, LocalDate birthDate, LocalDate plannedJoingDate, Optional<LocalDate> actualJoinDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.plannedJoingDate = plannedJoingDate;
        this.actualJoinDate = actualJoinDate;
    }

    public String getactualJoinDate() {
        actualJoinDate.ifPresent(d -> System.out.println("Actual Join Date: " + d));
        return actualJoinDate.map(LocalDate::toString).orElse(" ");
    }

    @Override
    public String toString() {
        return "EmployeeOptional{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", plannedJoingDate=" + plannedJoingDate +
                ", actualJoinDate=" + actualJoinDate +
                '}';
    }
}

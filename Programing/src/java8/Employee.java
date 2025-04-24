package java8;

import java.time.LocalDate;
import java.util.Locale;

public class Employee {
    private  final int id;
    private  final String name;
    private  final LocalDate birthDate;
    private  final LocalDate plannedJoinDate;
    private  final LocalDate actualJoiningData;

    public Employee(int id, String name, LocalDate birthDate, LocalDate plannedJoinDate, LocalDate actualJoiningData) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.plannedJoinDate = plannedJoinDate;
        this.actualJoiningData = actualJoiningData;
    }
    public  String getactualJoiningData(){
        return actualJoiningData==null?" ":actualJoiningData.toString();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", plannedJoinDate=" + plannedJoinDate +
                ", actualJoiningData=" + actualJoiningData +
                '}';
    }
}

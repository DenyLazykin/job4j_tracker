package ru.job4j.generics.game;

public class Game<T> {
    public static void main(String[] args) {
        Schoolboy schoolboyIvan = new Schoolboy("Ivan", 13);
        Schoolboy schoolboyMari = new Schoolboy("Mari", 15);
        Schoolboy schoolboySergei = new Schoolboy("Sergei", 12);
        Schoolboy schoolboyKolya = new Schoolboy("Kolya", 14);
        Student studentNik = new Student("Nik", 20);
        Student studentKseniya = new Student("Kseniya", 18);
        Student studentJim = new Student("Jim", 22);
        Student studentKaty = new Student("Katy", 20);
        Employee employeeZaur = new Employee("Zaur", 32);
        Employee employeeMicky = new Employee("Micky", 47);
        Employee employeeDen = new Employee("Den", 33);
        Employee employeeNasty = new Employee("Nasty", 33);
        Team<Schoolboy> schoolTeamDragons = new Team<>("Dragons");
        Team<Schoolboy> schoolTeamMage = new Team<>("Mage");
        Team<Student> studentTeamGo = new Team<>("Go");
        Team<Student> studentTeamBack = new Team<>("Back");
        Team<Employee> employeeTeamEmp = new Team<>("Emp");
        Team<Employee> employeeTeamPme = new Team<>("Pme");
        schoolTeamDragons.addNewParticipant(schoolboyIvan);
        schoolTeamDragons.addNewParticipant(schoolboyMari);
        schoolTeamMage.addNewParticipant(schoolboyKolya);
        schoolTeamMage.addNewParticipant(schoolboySergei);
        studentTeamGo.addNewParticipant(studentNik);
        studentTeamGo.addNewParticipant(studentKseniya);
        studentTeamBack.addNewParticipant(studentJim);
        studentTeamBack.addNewParticipant(studentKaty);
        employeeTeamEmp.addNewParticipant(employeeZaur);
        employeeTeamEmp.addNewParticipant(employeeMicky);
        employeeTeamPme.addNewParticipant(employeeDen);
        employeeTeamPme.addNewParticipant(employeeNasty);
        schoolTeamDragons.playWin(schoolTeamMage);
        studentTeamBack.playWin(studentTeamGo);
        employeeTeamEmp.playWin(employeeTeamPme);
    }
}

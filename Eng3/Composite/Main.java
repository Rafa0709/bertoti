import java.util.ArrayList;

class Composite {
    public static void main (String[] args){
        Developer dev1 = new Developer("Alice", "Backend Developer");
        Developer dev2 = new Developer("Bob", "Frontend Developer");
        Manager manager1 = new Manager("Charlie", "Engineering");

        Team devTeam = new Team("Development Team");
        devTeam.addEmployee(dev1);
        devTeam.addEmployee(dev2);

        Team managementTeam = new Team("Management Team");
        managementTeam.addEmployee(manager1);

        Team company = new Team("Tech Company");
        company.addEmployee(devTeam);
        company.addEmployee(managementTeam);

        company.showDetails();
    }
}
class Team implements Employee {
    private String teamName;
    private List<Employee> employees = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Team: " + teamName);
        for (Employee employee : employees) {
            employee.showDetails();
        }
    }
}
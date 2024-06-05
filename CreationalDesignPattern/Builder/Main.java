package Educational_Initiatives.DesignPatterns.CreationalDesignPattern.Builder;

class Main {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder("Vikram", "ABC")
                .setHasBike(false).setHasBike(true).build();
    }
}
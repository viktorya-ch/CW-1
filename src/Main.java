public class Main {

    private static Employee[] depository = new Employee[10];


    public static void main(String[] args) {
        depository[0] = new Employee(" Архипов Павел Семенович ", 2, 77459);
        depository[1] = new Employee(" Григорьев Евгений Михайлович ", 5, 98013);
        depository[2] = new Employee(" Леонова Лариса Геннадьевна ", 1, 84795);
        depository[3] = new Employee(" Фадеев Леонид Антонович ", 5, 68994);
        depository[4] = new Employee(" Быков Анатолий Максимович ", 4, 68909);
        depository[5] = new Employee(" Миронова Алина Александровна ", 1, 88457);
        depository[6] = new Employee(" Суриков Максим Семенович ", 3, 63018);
        depository[7] = new Employee(" Жданов Никита Сергеевич ", 4, 57099);
        depository[8] = new Employee(" Акулова Светлана Андреевна ", 2, 104036);
        depository[9] = new Employee(" Куликов Александр  Егорович ", 3, 101485);
        for (int i = 0; i < depository.length; i++) {
            System.out.println(depository[i]);
        }
        printFullName();


    }


    private static int calculateTheSalaryCosts() {
        int sum = 0;
        for (int i = 0; i < depository.length; i++) {
            sum += depository[i].getSalary();
        }
        return sum;
    }


    private static Employee findEmployeeWithMinSalary() {
        Employee minSalary = null;
        for (int i = 0; i < depository.length; i++) {
            if (minSalary == null || depository[i].getSalary() < minSalary.getSalary()) {
                minSalary = depository[i];

            }
        }
        return minSalary;
    }


    private static Employee findEmployeeWithMaxSalary() {
        Employee maxSalary = null;
        for (int i = 0; i < depository.length; i++) {
            if (maxSalary == null || depository[i].getSalary() > maxSalary.getSalary()) {
                maxSalary = depository[i];
            }
        }
        return maxSalary;
    }


    private static int calculateTheAverageSalary() {
        return calculateTheSalaryCosts() / depository.length;
    }


    private static void printFullName() {
        for (int i = 0; i < depository.length; i++) {
            System.out.println(depository[i].getFullName());
        }
    }


}
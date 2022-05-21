import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "青木", "男性", 400000);
        Employee employee2 = new Employee(2, "石田", "男性", 500000);

        System.out.println("社員番号:" + employee1.getId() + ",名前:" + employee1.getName() + ",基本給:" + employee1.getSalary());
        System.out.println("社員番号:" + employee2.getId() + ",名前:" + employee2.getName() + ",基本給:" + employee2.getSalary());

        employee2.setSalary(600000);
        System.out.println("石田さん昇格により基本給" + employee2.getSalary());

        Employee employee3 = new Employee(25, "内山", "女性", 250000);
        Employee employee4 = new Employee(46, "江口", "男性", 300000);
        Employee employee5 = new Employee(253, "尾崎", "女性", 210000);
        Employee employee6 = new Employee(330, "内田", "男性", 350000);

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);

//        名前に”内”の文字が入っている従業員の基本情報を表示
        for (Employee employee : employeeList) {
            if (employee.getName().contains("内")) {
                System.out.println("社員番号:" + employee.getId() + ",名前:" + employee.getName() + ",性別:" + employee.getGender() + ",基本給:" + employee.getSalary());
            }

        }
//        性別が女性の従業員の基本情報を表示
        for (Employee employee : employeeList) {
            if (employee.getGender().equals("女性")) {
                System.out.println("社員番号:" + employee.getId() + ",名前:" + employee.getName() + ",性別:" + employee.getGender() + ",基本給:" + employee.getSalary());
            }
        }

//        各従業員の給与からグレードを出す
        for (Employee employee : employeeList) {
            if (employee.getSalary() >= 300000) {
                System.out.println("社員番号" + employee.getId() + "の従業員は3グレードです。");
            } else if (employee.getSalary() >= 250000) {
                System.out.println("社員番号" + employee.getId() + "の従業員は2グレードです。");
            } else if (employee.getSalary() >= 200000) {
                System.out.println("社員番号" + employee.getId() + "の従業員は1グレードです。");
            }
        }
    }
}




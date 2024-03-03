import java.io.Serializable;

public class Employee implements Serializable {
    private int empNo;
    private String empName;
    private double empSalary;

    public Employee(int empNo, String empName, double empSalary) {
        this.empNo = empNo;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSalary=" + empSalary + "]";
    }
}

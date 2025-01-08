package prueba_3;
// Generated 6 ene. 2025 17:24:29 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Employees generated by hbm2java
 */
public class Employees  implements java.io.Serializable {


     private int employeeId;
     private Employees employees;
     private String firstName;
     private String lastName;
     private String email;
     private String phoneNumber;
     private Date hireDate;
     private String jobId;
     private BigDecimal salary;
     private BigDecimal commissionPct;
     private Short departmentId;
     private Set employeeses = new HashSet(0);

    public Employees() {
    }

	
    public Employees(int employeeId, String lastName, String firstName, String email, Date hireDate, String jobId, BigDecimal salary) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.hireDate = hireDate;
        this.jobId = jobId;
        this.salary = salary; 
    }
    public Employees(int employeeId, Employees employees, String firstName, String lastName, String email, String phoneNumber, Date hireDate, String jobId, BigDecimal salary, BigDecimal commissionPct, Short departmentId, Set employeeses) {
       this.employeeId = employeeId;
       this.employees = employees;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.phoneNumber = phoneNumber;
       this.hireDate = hireDate;
       this.jobId = jobId;
       this.salary = salary;
       this.commissionPct = commissionPct;
       this.departmentId = departmentId;
       this.employeeses = employeeses;
    }
   
    public int getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public Employees getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Employees employees) {
        this.employees = employees;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Date getHireDate() {
        return this.hireDate;
    }
    
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    public String getJobId() {
        return this.jobId;
    }
    
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
    public BigDecimal getSalary() {
        return this.salary;
    }
    
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    public BigDecimal getCommissionPct() {
        return this.commissionPct;
    }
    
    public void setCommissionPct(BigDecimal commissionPct) {
        this.commissionPct = commissionPct;
    }
    public Short getDepartmentId() {
        return this.departmentId;
    }
    
    public void setDepartmentId(Short departmentId) {
        this.departmentId = departmentId;
    }
    public Set getEmployeeses() {
        return this.employeeses;
    }
    
    public void setEmployeeses(Set employeeses) {
        this.employeeses = employeeses;
    }




}



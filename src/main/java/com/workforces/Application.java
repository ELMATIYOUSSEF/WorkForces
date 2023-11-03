package com.workforces;

import com.workforces.Service.DepartementService;
import com.workforces.Service.EmployeService;
import com.workforces.model.Departement;
import com.workforces.model.Employe;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Departement departement = appContext.getBean("departement",Departement.class);
        departement.setName("Design");
        DepartementService departementService = appContext.getBean("departementService", DepartementService.class);
        departementService.save(departement);
        Employe employee =  appContext.getBean("employe",Employe.class);
        employee.setFirstName("EL-MATI");
        employee.setLastName("Khalid");
        employee.setAge(13);
        employee.setSalary(9500D);
        employee.setDepartement(departement);
        EmployeService employeService = appContext.getBean("employeService", EmployeService.class);
        employeService.save(employee);
        }
}

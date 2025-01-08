package prueba_3;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Clase para gestionar empleados utilizando Hibernate.
 * Incluye inserción, consulta, actualización y consulta de empleados con salarios altos.
 */
public class EmpleadosHIBERNATE {

    
    public static void main(String[] args) throws ParseException {
        // Traemos el sessionFactory
        SessionFactory sesionGeneral = SessionFactorySingleton.getSessionFactory();

        // Abrimos una sesión
        Session sesion = sesionGeneral.openSession();

        // Asociamos una transacción a la sesión
        Transaction tx = sesion.beginTransaction();

        // Datos del empleado a insertar
        BigDecimal salary = new BigDecimal("15000");
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        Date hire = dateformat.parse("05/08/1992");

        try {
            // Insertar un empleado
            Employees art = new Employees(500, "Amsellem", "David", "David@david.com", hire, "SH_CLERK", salary);

            // Guardamos el objeto para insertarlo en la BD
            sesion.save(art);
            System.out.println("Empleado insertado correctamente.");

            // Hacemos el commit para que los cambios sean permanentes en la BD
            tx.commit();
        } catch (Exception e) {
            System.out.println("Error al insertar el empleado: " + e.toString());
            tx.rollback();
        }

        // Consulta y modificación del empleado
        Transaction tx2 = sesion.beginTransaction(); // Iniciamos una nueva transacción
        try {
           

            Query query = sesion.createQuery(
                "FROM Employees WHERE first_Name = 'David' AND last_Name = 'Amsellem'"
            );
           

            List<Employees> resultList = query.list();

            if (!resultList.isEmpty()) {
                Employees employee = resultList.get(0);

                // Mostrar datos del empleado recuperado
                System.out.println("Empleado encontrado:");
                System.out.println("ID: " + employee.getEmployeeId());
                System.out.println("Nombre: " + employee.getFirstName());
                System.out.println("Apellido: " + employee.getLastName());
                System.out.println("Salario actual: " + employee.getSalary());

                // Modificar el salario
                BigDecimal newSalary = new BigDecimal("30000");
                employee.setSalary(newSalary);

                // Guardar los cambios
                sesion.update(employee);
                System.out.println("Salario actualizado a: " + employee.getSalary());
            } else {
                System.out.println("No se encontró el empleado con el nombre y apellido especificados.");
            }
            
            // Confirmamos los cambios
            tx2.commit();
        } catch (Exception e) {
            System.out.println("Error durante la consulta o actualización: " + e.toString());
            tx2.rollback();
        }

        // Consulta de empleados con salario mayor a 20000
        Transaction tx3 = sesion.beginTransaction(); // Nueva transacción
        try {
            System.out.println("\nEmpleados con salario mayor a 20000:");
            Query queryHighSalary = sesion.createQuery(
                "FROM Employees WHERE salary > :minSalary"
            );
            queryHighSalary.setParameter("minSalary", new BigDecimal("20000"));

            List<Employees> highSalaryEmployees = queryHighSalary.list();

            if (!highSalaryEmployees.isEmpty()) {
                for (Employees emp : highSalaryEmployees) {
                    System.out.println("Nombre: " + emp.getFirstName() +
                            ", Apellido: " + emp.getLastName() +
                            ", Salario: " + emp.getSalary());
                }
            } else {
                System.out.println("No se encontraron empleados con salario mayor a 20000.");
            }

            tx3.commit();
        } catch (Exception e) {
            System.out.println("Error durante la consulta de empleados con salario alto: " + e.toString());
            tx3.rollback();
        } finally {
            // Liberar recursos
            sesion.close();
            sesionGeneral.close();
        }
    }
}

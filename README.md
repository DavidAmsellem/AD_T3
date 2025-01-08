Esta tarea consiste en realizar las siguientes sub-tareas:


Crear un proyecto en Java realizando la configuración de un mapeo objeto relacional con la herramienta Hibernate sobre el esquema HR SGBD Oracle. 
Para conectar con el esquema HR se puede hacer con el usuario de Oracle 'sys' y la contraseña 'oracle'. También se puede hacer con el usuario 'HR' y la contraseña 'hr'. 
Estás contraseñas son las de la instalación de Oracle Express en la máquina virtual si no se modificaron con anterioridad. Recordad que si usamos la maquina virtual 
cuando hagamos la conexión con el SGBD usaremos el driver ojdbc8.jar y un tipo de conexión "oracle:thin".



Además, crear una clase denominada “SessionFactorySingleton” que permita obtener un objeto SessionFactory de Hibernate. La clase llama a configure() y 
carga el fichero de configuración (hibernate.cfg.xml) y entonces construye la sesión SessionFactory para obtener el objeto sesión. Dicha clase debe utilizar 
un patrón de diseño Singleton para restringir la creación de los objetos pertenecientes a una clase.

Crearemos archivos de configuración y de ingeniería inversa. Además, obtendremos el fichero de mapeo y POJOs de la tabla de Empleados (employees),
sin obtener ninguna otra tabla relacionada con ella. 

Crearemos una clase denominada "EmpleadosHIBERNATE.java" realizará una operación de inserción sobre la tabla empleados e insertará un empleado con el nombre 
(first_name) y apellido (last_name) del autor de la tarea, con un salario de 15000. El resto de los valores a incluir serán los que quiera el usuario con el fin
de poder realizar la inserción correctamente.



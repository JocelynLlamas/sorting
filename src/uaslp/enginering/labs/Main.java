package uaslp.enginering.labs;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        Integer[] datos = {3, 2, 6, 3, 1, 8, 5, 4};

        sort(datos, new IntegerAscendantComparator());
        System.out.println("-------- A S C E N D A N T --------");
        for (int dato : datos) {
            System.out.print(dato + ", ");
        }

        System.out.println();

        sort(datos, new IntegerDescendantComparator());
        System.out.println("-------- D E S C E N D A N T --------");
        for (int dato : datos) {
            System.out.print(dato + ", ");
        }

        System.out.println();

        String[] nombres = {"Hector", "Jocelyn", "Antonio", "Caleb", "Isaías", "José", "Gustavo", "Alain", "Ivan"};

        sort(nombres, new StringAscendantComparator());
        System.out.println("-------- A S C E N D A N T --------");
        for (String dato : nombres) {
            System.out.print(dato + ", ");
        }

        System.out.println();

        sort(nombres, new StringDescendantComparator());
        System.out.println("-------- D E S C E N D A N T --------");
        for (String dato : nombres) {
            System.out.print(dato + ", ");
        }

        System.out.println();

        Alumno alumnos[] = {
                new Alumno("Hector", "Hernandez", LocalDate.of(2001, Month.AUGUST, 11), 4723717),
                new Alumno("Jocelyn", "Llamas", LocalDate.of(2001, Month.JULY, 21), 32321),
                new Alumno("Antonio", "Galvan", LocalDate.of(2002, Month.JANUARY, 1), 45365645),
                new Alumno("Francisco", "Solis", LocalDate.of(2001, Month.FEBRUARY, 14), 72436723),
                new Alumno("Caleb", "Solis", LocalDate.of(2001, Month.FEBRUARY, 16), 72436723),
                new Alumno("Arturo", "Llamas", LocalDate.of(2001, Month.JULY, 12), 32321),
        };

        // Ordenar los alumnos por lastName y firstName e imprimir

        sort(alumnos, new AlumnAscendantComparator());
        System.out.println("-------- A S C E N D A N T   N A M E --------");        
        for (Alumno alumno : alumnos) {
          
            System.out.println(alumno.getLastName() + " " + alumno.getFirstName() + " " + alumno.getBirthday() + " " + alumno.getClave());
        }

        System.out.println();

        sort(alumnos, new AlumnDescendantComparator());
        System.out.println("-------- D E S C E N D A N T   N A M E --------");        
        for (Alumno alumno : alumnos) {
            
            System.out.println(alumno.getLastName() + " " + alumno.getFirstName() + " " + alumno.getBirthday() + " " + alumno.getClave());
        }

        System.out.println();


        // Ordenar por mes de nacimiento y por clave e imprimir
            
        sort(alumnos, new MonthcodeComparator());
        System.out.println("-------- M O N T H  A N D  C O D E --------");
        for (Alumno alumno : alumnos) {
        
            System.out.println(alumno.getBirthday() + " " + alumno.getClave() + " " + alumno.getFirstName() + " " + alumno.getLastName());
        }

        System.out.println();
    }

    private static void sort(Object[] datos, Comparator comparator) {
        for (int i = 0; i < datos.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (comparator.compare(datos[j], datos[j + 1]) < 0) {
                    Object temp = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    
}

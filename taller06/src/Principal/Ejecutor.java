package Principal;
import java.util.Scanner;
import Entidades.*;
/**
 *
 * @author josep
 */

public class Ejecutor {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la ciudada: ");
        String nombreCiudad = leer.nextLine();
        
        System.out.println("Ingrese el nombre de la Provincia: ");
        String nombreProvincia = leer.nextLine();
        
        Ciudad ciudad = new Ciudad(nombreCiudad, nombreProvincia); 
        
        System.out.println("Ingrese el nombre del Hospital");
        String nombreHospital = leer.nextLine();
        
        System.out.println("Ingresar el numero de Especialidades");
        int numeroEspecialidades = leer.nextInt();
        
        System.out.println("Ingresar la direeccion del Hospital");
        String direccionHospital = leer.next();
        
        Hospital hospital = new Hospital(nombreHospital, ciudad, numeroEspecialidades,
        direccionHospital);
        
        System.out.println("Ingresar numero de Medicos");
        int numeroMedicos = leer.nextInt();
        hospital.inicializarGrupoMedico(numeroMedicos);
        System.out.println("Ingresar numero de Enfermeros");
        int numeroEnfermeros = leer.nextInt();
        hospital.inicializarGrupoEnfermero(numeroEnfermeros);
        
        for (int i = 0; i < numeroMedicos; i++) {
            System.out.printf("Ingresar el nombre del Medico %d: " ,i+1);
            String nombreMedicos = leer.next();
            System.out.printf("Ingresar el sueldo:");
            double sueldo = leer.nextDouble();
            System.out.printf("Ingresar especialidad del medico:");
            String especialidad = leer.next();
            
            Medico medico = new Medico(nombreMedicos, especialidad ,sueldo);
            hospital.CrearMedico(medico);
        }
            for (int i = 0; i < numeroEnfermeros; i++) {
            System.out.printf("Ingresar el nombre del Enfermero %d: " ,i+1);
            String nombreEnfermeros = leer.next();
            System.out.printf("Ingresar el sueldo:");
            double sueldo = leer.nextDouble();
            System.out.printf("Ingresar el tipo de contrato del Enfermero:");
            String tipoContrato = leer.next();
            
            Enfermero enfermero = new Enfermero(nombreEnfermeros, tipoContrato ,sueldo);
            hospital.CrearEnfermero(enfermero);
            
        }
            hospital.calcularTotalSueldosCancelar();
            System.out.println(hospital);
    }
}

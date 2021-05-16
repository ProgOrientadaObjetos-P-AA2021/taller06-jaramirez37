package Entidades;

/**
 *
 * @author josep
 */
public class Hospital {
    
    
    private String nombreHospital;
    private Ciudad ciudad;
    private int numeroEspecialidades;
    private Medico[]conjuntoMedicos;
    private Enfermero[]conjuntoEnfermeros;
    private double totalSueldosCancelar;
    private String direccionHospital;

    
    public Hospital(String nombreHospital, Ciudad ciudad, int numeroEspecialidades, 
            String direccionHospital) {
        
        this.nombreHospital = nombreHospital;
        this.ciudad = ciudad;
        this.numeroEspecialidades = numeroEspecialidades;
        this.direccionHospital = direccionHospital;
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumeroEspecialidades() {
        return numeroEspecialidades;
    }

    public void setNumeroEspecialidades(int numeroEspecialidades) {
        this.numeroEspecialidades = numeroEspecialidades;
    }

    public Medico[] getConjuntoMedicos() {
        return conjuntoMedicos;
    }

    public void setConjuntoMedicos(Medico[] conjuntoMedicos) {
        this.conjuntoMedicos = conjuntoMedicos;
    }

    public Enfermero[] getConjuntoEnfermeros() {
        return conjuntoEnfermeros;
    }

    public void setConjuntoEnfermeros(Enfermero[] conjuntoEnfermeros) {
        this.conjuntoEnfermeros = conjuntoEnfermeros;
    }

    public double getTotalSueldosCancelar() {
        return totalSueldosCancelar;
    }

    public void calcularTotalSueldosCancelar() {
        for (int i = 0; i < conjuntoMedicos.length; i++) {
            totalSueldosCancelar += conjuntoMedicos[i].getSueldoMensual();
        }
        for (int i = 0; i < conjuntoEnfermeros.length; i++) {
            totalSueldosCancelar += conjuntoEnfermeros[i].getSueldoMensual();
        }
    }

    public String getDireccionHospital() {
        return direccionHospital;
    }

    public void setDireccionHospital(String direccionHospital) {
        this.direccionHospital = direccionHospital;
    }
    int ultimoMedico = 0;
    public void CrearMedico(Medico medico) {
        
        conjuntoMedicos[ultimoMedico]= medico;
        ultimoMedico += 1;
    }
    public void inicializarGrupoMedico(int n) {
        
        conjuntoMedicos = new Medico[n];
    }
    int ultimoEnfermero = 0;
    public void CrearEnfermero(Enfermero enfermero) {
        
        conjuntoEnfermeros[ultimoEnfermero]= enfermero;
        ultimoEnfermero += 1;
    }
    public void inicializarGrupoEnfermero(int n) {
        
        conjuntoEnfermeros = new Enfermero[n];
    }
    public String getEnfermeros() {
        String datos = "";
        
        for (int i = 0; i < conjuntoEnfermeros.length; i++) {
            datos = datos + conjuntoEnfermeros[i].toString();
        }
        
        return datos;
    }
    public String getMedicos() {
        String datos = "";
        
        for (int i = 0; i < conjuntoMedicos.length; i++) {
            datos = datos + conjuntoMedicos[i].toString();
        }
        
        return datos;
    }
    
    public String toString() {
        return String.format(
                " %s\n"+ "Direccion: %s\n" + "Ciudad: %s\n"+ "Provincia: %s\n"
                + "Numoero de especialidades: %s\n"+ "Medicos: \n%s\n"
                + "Enfermeros: \n%s\n" + "\nSueldos a pagar: %s \n",
                nombreHospital, direccionHospital, ciudad.getNombreCiudad(), ciudad.getProvinciaCiudad(),
                numeroEspecialidades, getMedicos(), getEnfermeros(), totalSueldosCancelar);
    }
}

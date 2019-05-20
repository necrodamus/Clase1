/*
 * Derechos Reservados Por Necrodamus
 */

/*
 * Derechos Reservados Por Necrodamus
 */

package andres.curso.clase1.Modelo;

import java.util.Date;

public class Alumnos {
    private String nombreAlumno;
    private Date fechaNacimientoAlumno;
    private long nroDeMatricula;

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Date getFechaNacimientoAlumno() {
        return fechaNacimientoAlumno;
    }

    public void setFechaNacimientoAlumno(Date fechaNacimientoAlumno) {
        this.fechaNacimientoAlumno = fechaNacimientoAlumno;
    }

    public long getNroDeMatricula() {
        return nroDeMatricula;
    }

    public void setNroDeMatricula(long nroDeMatricula) {
        this.nroDeMatricula = nroDeMatricula;
    }
}

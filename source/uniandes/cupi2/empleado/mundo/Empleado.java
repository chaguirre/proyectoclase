/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1
 *
 * Proyecto Cupi2
 * Ejercicio: n1_empleado
 * Autor: Mario S�nchez - 13/06/2005
 * Autor: Mario S�nchez - 02/2005
 * Autor: Pablo Barvo - 22/08/2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.empleado.mundo;

/**
 * Esta clase representa un empleado
 */
public class Empleado
{
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * Nombre
     */
    private String nombre;

    /**
     * Apellido
     */
    private String apellido;

    /**
     * Sexo o genero
     */
    private int sexo;

    /**
     * Fecha de nacimiento
     */
    private Fecha fechaNacimiento;

    /**
     * Fecha de ingreso
     */
    private Fecha fechaIngreso;

    /**
     * Ruta de la imagen
     */
    private String imagen;

    /**
     * Salario
     */
    private int salario;

    //-----------------------------------------------------------------
    // M�todos
    //-----------------------------------------------------------------

    /**
     * Inicializa un empleado con la informaci�n b�sica. <br>
     * <b>post: </b> El objeto empleado tiene sus datos b�sicos asignados.
     * @param pNombre El nombre del empleado. pNombre != null.
     * @param pApellido El apellido del empleado. pApellido != null.
     * @param pSexo El sexo del empleado. pSexo pertenece a {1,2}.
     * @param pFechaN La fecha de nacimiento del empleado. pFechaN != null.
     */
    public void inicializar( String pNombre, String pApellido, int pSexo, Fecha pFechaN, Fecha pFechaI, int pSalario )
    {
        nombre = pNombre;
        apellido = pApellido;
        sexo = pSexo;
        fechaNacimiento = pFechaN;
        fechaIngreso = pFechaI;
        imagen = null;
        salario = pSalario;
    }

    /**
     * Retorna el apellido del empleado
     * @return apellido
     */
    public String darApellido( )
    {
        return apellido;
    }

    /**
     * Retorna la fecha de ingreso del empleado en una cadena
     * @return fechaIngreso
     */
    public String darFechaIngreso( )
    {
        String strFecha = fechaIngreso.toString( );
        return strFecha;
    }

    /**
     * Retorna la fecha de nacimiento del empleado en una cadena
     * @return fechaNacimiento
     */
    public String darFechaNacimiento( )
    {
        String strFecha = fechaNacimiento.toString( );
        return strFecha;
    }

    /**
     * Retorna la ruta donde se encuentra la imagen del empleado
     * @return imagen
     */
    public String darImagen( )
    {
        return imagen;
    }

    /**
     * Retorna el nombre del empleado
     * @return nombre
     */
    public String darNombre( )
    {
        return nombre;
    }

    /**
     * Retorna el salario del empleado
     * @return salario
     */
    public int darSalario( )
    {
        return salario;
    }

    /**
     * Retorna el sexo del empleado.
     * @return sexo. sexo pertenece a {1 , 2 }
     */
    public int darSexo( )
    {
        return sexo;
    }

    /**
     * Retorna la edad de la persona en a�os.
     * @return Edad de la persona
     */
    public int darEdad( )
    {
        // Obtiene la fecha actual
        Fecha hoy = new Fecha( );
        hoy.inicializarHoy( );

        //Calcula la diferencia de a�os
        int edad = fechaNacimiento.darDiferenciaEnMeses( hoy ) / 12;

        return edad;
    }

    /**
     * Retorna la antig�edad del empleado en a�os.
     * @return Antig�edad del empleado
     */
    public int darAntiguedad( )
    {
        // Obtiene la fecha actual
        Fecha hoy = new Fecha( );
        hoy.inicializarHoy( );

        //Calcula la diferencia de a�os
        int antiguedad = fechaIngreso.darDiferenciaEnMeses( hoy ) / 12;

        return antiguedad;
    }

    /**
     * Este m�todo sirve para saber las prestaciones del empleado usando la f�rmula: p = (a * s)/12 (p: prestaciones, a: antig�edad, s: salario). <br>
     * La antig�edad que se utiliza est� dada en a�os, as� que si un empleado lleva menos de un a�o en la empresa, sus prestaciones ser�n 0.
     * @return Prestaciones a las que tiene derecho
     */
    public double darPrestaciones( )
    {
        int antiguedad = darAntiguedad( );
        double prestaciones = ( ( double ) ( antiguedad * salario ) ) / 12;
        return prestaciones;
    }

    /**
     * Cambia la fecha de ingreso del empleado. <br>
     * <b>post: </b> fechaIngreso == pFechaIngreso.
     * @param pFechaIngreso La nueva fecha de ingreso del empleado. pFechaIngreso != null.
     */
    public void cambiarFechaIngreso( Fecha pFechaIngreso )
    {
        fechaIngreso = pFechaIngreso;
    }

    /**
     * Cambia la ruta donde est� la imagen del empleado. <br>
     * <b>post: </b> imagen == pImagen.
     * @param pImagen La nueva ruta de la imagen del empleado. pImagen != null.
     */
    public void cambiarImagen( String pImagen )
    {
        imagen = pImagen;
    }

    /**
     * Cambia el salario del empleado. <br>
     * <b>post: </b> salario == pSalario.
     * @param pSalario El nuevo salario del empleado.
     */
    public void cambiarSalario( int pSalario )
    {
        salario = pSalario;
    }

    //-----------------------------------------------------------------
    // Puntos de Extensi�n
    //-----------------------------------------------------------------

    /**
     * M�todo de extensi�n 1
     * @return Resultado de la operaci�n
     */
    public String metodo1( )
    {
        return "Respuesta 1";
    }

    /**
     * M�todo de extensi�n 2
     * @return Resultado de la operaci�n
     */
    public String metodo2( )
    {
        return "Respuesta 2";
    }

}
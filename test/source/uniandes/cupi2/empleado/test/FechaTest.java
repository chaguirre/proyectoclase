/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ 
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n1_empleado 
 * Autor: Mario Sánchez - 14/06/2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */

package uniandes.cupi2.empleado.test;

import uniandes.cupi2.empleado.mundo.Fecha;
import junit.framework.TestCase;

/**
 * Estas son las pruebas para la clase fecha
 */
public class FechaTest extends TestCase
{

    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * Fecha 1 de prueba
     */
    private Fecha fecha1;
    /**
     * Fecha 2 de prueba
     */
    private Fecha fecha2;
    /**
     * Fecha 3 de prueba
     */
    private Fecha fecha3;
    /**
     * Fecha 4 de prueba
     */
    private Fecha fecha4;

    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------

    /**
     * Establece el primer escenario de prueba.
     */
    private void setupEscenario1( )
    {
        fecha1 = new Fecha( );
        fecha1.inicializar( 14, 11, 1982 );
        fecha2 = new Fecha( );
        fecha2.inicializar( 15, 11, 1983 );
        fecha3 = new Fecha( );
        fecha3.inicializar( 15, 12, 1982 );
        fecha4 = new Fecha( );
        fecha4.inicializar( 14, 10, 1984 );
    }

    /**
     * Verificar que el calculo de la diferencia se haga bien
     */
    public void testDarDiferenciaEnMeses( )
    {
        setupEscenario1( );

        assertEquals( "La diferencia entre " + fecha1 + " y " + fecha2 + " debe ser 12 meses", 12, fecha1.darDiferenciaEnMeses( fecha2 ) );
        assertEquals( "La diferencia entre " + fecha1 + " y " + fecha3 + " debe ser 1 mes", 1, fecha1.darDiferenciaEnMeses( fecha3 ) );
        assertEquals( "La diferencia entre " + fecha1 + " y " + fecha4 + " debe ser 23 meses", 23, fecha1.darDiferenciaEnMeses( fecha4 ) );
    }
}

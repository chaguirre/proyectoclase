/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ 
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n1_empleado 
 * Autor: Mario S�nchez - 14/06/2005 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */

package uniandes.cupi2.empleado.interfaz;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 * Es el panel para las extensiones del ejemplo
 */
public class PanelExtensiones extends JPanel implements ActionListener
{
    //-----------------------------------------------------------------
    // Constantes
    //-----------------------------------------------------------------

    /**
     * El comando para el bot�n 1
     */
    private final String OPCION_1 = "opcion1";

    /**
     * El comando para el bot�n 2
     */
    private final String OPCION_2 = "opcion2";

    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * Es la referencia a la interfaz de la aplicaci�n
     */
    private InterfazEmpleado interfazEmpleado;

    //-----------------------------------------------------------------
    // Atributos de la Interfaz
    //-----------------------------------------------------------------

    /**
     * Es el bot�n 1
     */
    private JButton butOpcion1;

    /**
     * Es el bot�n 2
     */
    private JButton butOpcion2;

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

    /**
     * Construye el panel de extensiones con una referencia a la ventana principal de la aplicaci�n. <br>
     * <b>post: </b> Construy� el panel e interfazEmpleado == interfaz. <br>
     * @param interfaz Referencia a la ventana principal. interfaz != null.
     */
    public PanelExtensiones( InterfazEmpleado interfaz )
    {
        interfazEmpleado = interfaz;

        setBorder( new CompoundBorder( new EmptyBorder( 0, 0, 5, 0 ), new TitledBorder( "Puntos de Extensi�n" ) ) );

        setLayout( new FlowLayout( ) );
        butOpcion1 = new JButton( "Opci�n 1" );
        butOpcion1.setActionCommand( OPCION_1 );
        butOpcion1.addActionListener( this );

        butOpcion2 = new JButton( "Opci�n 2" );
        butOpcion2.setActionCommand( OPCION_2 );
        butOpcion2.addActionListener( this );

        add( butOpcion1 );
        add( butOpcion2 );
    }

    //-----------------------------------------------------------------
    // M�todos
    //-----------------------------------------------------------------

    /**
     * Este m�todo se llama cuando se presiona uno de los botones. <br>
     * <b>post: </b> Se ejecut� la acci�n correspondiente al bot�n presionado. <br>
     * @param evento El evento del click en el bot�n. evento != null.
     */
    public void actionPerformed( ActionEvent evento )
    {
        String comando = evento.getActionCommand( );
        if( OPCION_1.equals( comando ) )
        {
            interfazEmpleado.reqFuncOpcion1( );
        }
        else if( OPCION_2.equals( comando ) )
        {
            interfazEmpleado.reqFuncOpcion2( );
        }
    }

}

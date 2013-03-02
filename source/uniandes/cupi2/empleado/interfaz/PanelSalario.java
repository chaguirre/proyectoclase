/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ 
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n1_empleado 
 * Autor: Mario S�nchez - Jun 13, 2005 
 * Autor: Mario S�nchez - Jun 13, 2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */

package uniandes.cupi2.empleado.interfaz;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 * Es el panel en el que se muestra y se modifica el salario del empleado
 */
public class PanelSalario extends JPanel implements ActionListener
{
    //-----------------------------------------------------------------
    // Constantes
    //-----------------------------------------------------------------

    /**
     * Es el comando para el bot�n de modificar el salario
     */
    private final static String BUT_MODIFICAR_SALARIO = "MODIFICAR SALARIO";

    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * Es una referencia a la interfaz de la aplicaci�n
     */
    private InterfazEmpleado interfazEmpleado;

    //-----------------------------------------------------------------
    // Atributos de la Interfaz
    //-----------------------------------------------------------------

    /**
     * Etiqueta para el salario
     */
    private JLabel labSalario;

    /**
     * Es el campo de texto para el salario
     */
    private JTextField txtSalario;

    /**
     * Es el bot�n para modificar el salario
     */
    private JButton botonModificarSalario;

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

    /**
     * Construye el panel con una referencia a la ventana principal de la aplicaci�n <br>
     * <b>post: </b> Construy� el panel e interfazEmpleado == interfaz. <br>
     * @param interfaz - Referencia a la ventana principal. interfaz != null.
     */
    public PanelSalario( InterfazEmpleado interfaz )
    {
        interfazEmpleado = interfaz;

        setLayout( new FlowLayout( ) );

        labSalario = new JLabel( "Salario: " );
        add( labSalario );

        txtSalario = new JTextField( 10 );
        add( txtSalario );

        botonModificarSalario = new JButton( );
        botonModificarSalario.setText( "Modificar" );
        botonModificarSalario.setActionCommand( PanelSalario.BUT_MODIFICAR_SALARIO );
        botonModificarSalario.addActionListener( this );

        add( botonModificarSalario );
        setBorder( new CompoundBorder( new EmptyBorder( 0, 0, 5, 0 ), new TitledBorder( "Salario" ) ) );

        txtSalario.setEnabled( false );
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
        String command = evento.getActionCommand( );

        if( command.equals( BUT_MODIFICAR_SALARIO ) )
        {
            interfazEmpleado.modificarSalario( );
        }
    }

    /**
     * Actualiza el salario que se muestra. <br>
     * <b>post: </b> Se cambi� el salario mostrado. <br>
     * @param salario.
     */
    public void actualizarSalario( int salario )
    {
        DecimalFormat df = ( DecimalFormat )NumberFormat.getInstance( );
        df.applyPattern( "$###,###.##" );
        txtSalario.setText( df.format( salario ) );
    }

}

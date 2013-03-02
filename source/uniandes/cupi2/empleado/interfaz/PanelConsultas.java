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
 * Autor: Pablo Barvo - 22/08/2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */

package uniandes.cupi2.empleado.interfaz;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import uniandes.cupi2.empleado.mundo.Empleado;

/**
 * En este panel se muestran los campos y botones necesarios para realizar las consultas
 */
public class PanelConsultas extends JPanel implements ActionListener
{

    //-----------------------------------------------------------------
    // Constantes
    //-----------------------------------------------------------------

    /**
     * El comando para el bot�n de calcular la edad del empleado
     */
    private final static String CALCULAR_EDAD = "CALCULAR EDAD";

    /**
     * El comando para el bot�n de calcular la antig�edad del empleado
     */
    private final static String CALCULAR_ANTIGUEDAD = "CALCULAR ANTIGUEDAD";

    /**
     * El comando para el bot�n de calcular las prestaciones del empleado
     */
    private final static String CALCULAR_PRESTACIONES = "CALCULAR PRESTACIONES";

    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * El empleado sobre el que se realizan los c�lculos
     */
    private Empleado empleado;

    //-----------------------------------------------------------------
    // Atributos de la interfaz
    //-----------------------------------------------------------------

    /**
     * El campo donde se muestra la edad
     */
    private JTextField txtEdad;

    /**
     * El campo donde se muestra la antig�edad
     */
    private JTextField txtAntiguedad;

    /**
     * El campo donde se muestran las prestaciones
     */
    private JTextField txtPrestaciones;

    /**
     * El bot�n para calcular la edad
     */
    private JButton butEdad;

    /**
     * El bot�n para calcular la antig�edad
     */
    private JButton butAntiguedad;

    /**
     * El bot�n para calcular las prestaciones
     */
    private JButton butPrestaciones;

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

    /**
     * Construye el panel de datos a consultar.
     */
    public PanelConsultas( )
    {
        GridBagLayout gridbag = new GridBagLayout( );
        setLayout( gridbag );
        setBorder( new CompoundBorder( new EmptyBorder( 0, 0, 5, 0 ), new TitledBorder( "C�lculos" ) ) );

        butEdad = new JButton( );
        GridBagConstraints gbc = new GridBagConstraints( 0, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( butEdad, gbc );

        butAntiguedad = new JButton( );
        gbc = new GridBagConstraints( 0, 1, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( butAntiguedad, gbc );

        butPrestaciones = new JButton( );
        gbc = new GridBagConstraints( 0, 2, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( butPrestaciones, gbc );

        txtEdad = new JTextField( 10 );
        gbc = new GridBagConstraints( 1, 0, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( txtEdad, gbc );
        txtEdad.setEnabled( false );

        txtAntiguedad = new JTextField( 10 );
        gbc = new GridBagConstraints( 1, 1, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( txtAntiguedad, gbc );
        txtAntiguedad.setEnabled( false );

        txtPrestaciones = new JTextField( 10 );
        gbc = new GridBagConstraints( 1, 2, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets( 5, 5, 5, 5 ), 0, 0 );
        add( txtPrestaciones, gbc );
        txtPrestaciones.setEnabled( false );

        butEdad.setText( "Calcular Edad" );
        butEdad.setActionCommand( PanelConsultas.CALCULAR_EDAD );
        butEdad.addActionListener( this );

        butAntiguedad.setText( "Calcular Antig�edad" );
        butAntiguedad.setActionCommand( PanelConsultas.CALCULAR_ANTIGUEDAD );
        butAntiguedad.addActionListener( this );

        butPrestaciones.setText( "Calcular Prestaciones" );
        butPrestaciones.setActionCommand( PanelConsultas.CALCULAR_PRESTACIONES );
        butPrestaciones.addActionListener( this );
    }

    //-----------------------------------------------------------------
    // M�todos
    //-----------------------------------------------------------------

    /**
     * Modifica el empleado que se utiliza para realizar los c�lculos. <br>
     * <b>post: </b> empleado == unEmpleado. <br>
     * @param unEmpleado Nuevo empleado que se usar� para los c�lculos. unEmpleado != null.
     */
    public void cambiarEmpleado( Empleado unEmpleado )
    {
        empleado = unEmpleado;
    }

    /**
     * Limpia los campos. <br>
     * <b>post: </b> Todos los campos del panel est�n limpios. <br>
     */
    public void limpiarCampos( )
    {
        txtEdad.setText( "" );
        txtAntiguedad.setText( "" );
        txtPrestaciones.setText( "" );
    }

    /**
     * Este m�todo se llama cuando se presiona uno de los botones. <br>
     * <b>post: </b> Se ejecut� la acci�n correspondiente al bot�n presionado. <br>
     * @param evento El evento del click en el bot�n. evento != null.
     */
    public void actionPerformed( ActionEvent evento )
    {
        String command = evento.getActionCommand( );

        if( command.equals( CALCULAR_EDAD ) )
        {
            int edad = empleado.darEdad( );
            txtEdad.setText( "" + edad );
        }
        else if( command.equals( CALCULAR_ANTIGUEDAD ) )
        {
            int antiguedad = empleado.darAntiguedad( );
            txtAntiguedad.setText( "" + antiguedad );
        }
        else if( command.equals( CALCULAR_PRESTACIONES ) )
        {
            double prestaciones = empleado.darPrestaciones( );
            DecimalFormat df = ( DecimalFormat )NumberFormat.getInstance( );
            df.applyPattern( "$###,###.##" );
            txtPrestaciones.setText( df.format( prestaciones ) );
        }
    }

}

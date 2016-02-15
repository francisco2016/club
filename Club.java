import java.util.ArrayList;
import java.util.Iterator;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> socios;

    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        socios = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        socios.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return socios.size();
    }

    /**
     * /** 
     * Calcula el numero de socios que se dieron de alta en un mes determinado. ------------------------------- 0063
     * El a�o no nos importa.
     * En caso de que el parametro contenga un valor no valido se muestra por pantalla el error.--------------- 0063
     * @param month El mes en el que estamos interesados
     * @return El numero de socios que se dieron de alta dicho mes
     */
    public int joinedMonth(int month){
        //1� Para devolver un valor siempre creamos una VL.
        int contador = 0;
        //2�Comprobamos si el mes se correcto
        if(month > 0 && month < 13){
            //3� Recorro toda la colecci�n.
            for(Membership socio : socios){
                //4� Compruebo si el elemento tiene el mismo mes de alta que el mes pasado como par�metro
                if(socio.getMonth() == month){
                    //le sumo 1 a la variable a devolver.
                    contador ++;
                }
            }    
        }
        //5� Si el mes no el v�lido: Mostramos mensaje de error
        else{
            System.out.println("Erro, n� de mes incorrecto. ");
            contador = -1; //ponemos la variable a devolver a -1
        }
        //6� Devolvemos la variable.
        return contador;
    }
    
    /** 
     * Todos los socios que se han dado de alta un determinado mes de un determinado a�o se
     * dan de baja. En caso de que el parametro month contenga un valor no valido se muestra 
     * por pantalla el error.
     * @param month El mes en el que estamos interesados ------------------------------------------------------ 0063
     * @param year El a�o en el que estamos interesados
     * @return Una coleccion con los socios que se han dado de baja del club
     */
    //1� Al tener que devolver una  colecci�n el mt. ha de ser tipo ArrayList de objetos de colecci�n socios.
    public ArrayList<Membership> purge(int month, int year)//-------------------------------------------------- 0063
    {   //2�Declaramos la VL para retornar el valor pedido, es de tipo colecci�n.
        ArrayList<Membership> sociosEliminados = null;
        //3� Comprobamos que el mes sea correcto.
        if (month > 0 && month < 13)
        {   //4� Al ser correcto inicializo el ArrayList para poder guardar los socios dados de baja
            sociosEliminados = new ArrayList<Membership>();
            //5� Recorremos la colecci�n con un Iterator, por que tenemos que borra a los dados de baja. 
            Iterator<Membership> it = socios.iterator();
            while (it.hasNext()) {
                //6� VL para guardar los datos del socio que nos pasa el mt,next();
                Membership socio = it.next();
                //7� si el mes y el a�o coinciden  con los pasdados en los par�metros. 
                if(socio.getMonth() == month && socio.getYear() == year){
                    sociosEliminados.add(socio);// los pasamos a la colecci�n que vamos a devolver; sociosEliminados
                    it.remove();        // y les borramos de la colecci�n de objetos Membership
                }
            }
        }
        else { //Si el mes pasado como parametro no es valido...
            System.out.println("datos mal introducidos,introducir valores entre[1-12]");
        }
        return sociosEliminados;
    }
}


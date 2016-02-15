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
     * El año no nos importa.
     * En caso de que el parametro contenga un valor no valido se muestra por pantalla el error.
     * @param month El mes en el que estamos interesados
     * @return El numero de socios que se dieron de alta dicho mes
     */
    public int joinedMonth(int month){
        //1º Para devolver un valor siempre creamos una VL.
        int contador = 0;
        //2ºComprobamos si el mes se correcto
        if(month > 0 && month < 13){
            //3º Recorro toda la colección.
            for(Membership socio : socios){
                //4º Compruebo si el elemento tiene el mismo mes de alta que el mes pasado como parámetro
                if(socio.getMonth() == month){
                    //le sumo 1 a la variable a devolver.
                    contador ++;
                }
            }    
        }
        //5º Si el mes no el válido: Mostramos mensaje de error
        else{
            System.out.println("Erro, nº de mes incorrecto. ");
            contador = -1; //ponemos la variable a devolver a -1
        }
        //6º Devolvemos la variable.
        return contador;
    }

    public ArrayList<Membership> purge(int month, int year)//-------------------------------------------------- 0063
    {
        ArrayList<Membership> sociosEliminados = null;
        if (month > 0 && month < 13)
        {
            sociosEliminados = new ArrayList<Membership>();
            Iterator<Membership> it = socios.iterator();
            while (it.hasNext()) {
                Membership socio = it.next();
                if(socio.getMonth() == month && socio.getYear() == year){
                    sociosEliminados.add(socio);
                    it.remove();
                }
            }
        }
        else {
            System.out.println("datos mal introducidos,introducir valores entre[1-12]");
        }
        return sociosEliminados;
    }
}


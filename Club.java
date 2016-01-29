import java.util.ArrayList;
public class Club
{
    // para guardar elementos de la colección socios.
    private ArrayList<Membership> socios;
    //para guardar el nº de socios.
    public int contador;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
       socios = new ArrayList<Membership>();

    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        socios.add(member);
        contador ++;
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers(){
        
        return contador;
    }
}

import java.util.*;

public class hashpassenger {

    Hashtable<ticketdetails,String> hashlinked = new Hashtable<>();
    public Hashtable<ticketdetails,String> insert(ArrayList<ticketdetails> tc) {
        hashlinked.put(tc.get(0),"PNR1001\n");

        hashlinked.put(tc.get(1),"PNR10004\n");

        return hashlinked;
    }

}

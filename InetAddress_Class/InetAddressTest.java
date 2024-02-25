
import java.io.IOException;
import java.net.InetAddress;
/**
 * GetIP
 */
public class InetAddressTest {
    public static void main(String[] args) throws IOException
    {
        InetAddress addr;

        // InetAddress.getLocalHost() return the object of your machine host details
        addr = InetAddress.getLocalHost();
        System.out.println("My own Ip: " + addr.getHostAddress());
        System.out.println();


        // InetAddress.getLocalHost() return the object of target machine host details
        addr = InetAddress.getByName("www.yahoo.com");
        System.out.println("Host Address: " + addr.getHostAddress()); // returns the host address
        System.out.println("Cannonical Host Address: " + addr.getCanonicalHostName()); 
        System.out.println("Host Name: " + addr.getHostName()); // returns the host name
        
        // check the addr active or not
        System.out.println("Checking target ip active or not...");
        System.out.println(addr.isReachable(1000));
    }
    
}
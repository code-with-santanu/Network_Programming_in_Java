
import java.io.IOException;
import java.net.InetAddress;
/**
 * GetIP
 */
public class GetIP {
    public static void main(String[] args) throws IOException
    {
        // InetAddress.getLocalHost() return the object of your machine host details
        InetAddress domain = InetAddress.getLocalHost();
        System.out.println("My own Ip: " + domain.getHostAddress());
        System.out.println();


        // InetAddress.getLocalHost() return the object of target machine host details
        domain = InetAddress.getByName("www.yahoo.com");
        System.out.println("Host Address: " + domain.getHostAddress());
        System.out.println("Cannonical Host Address: " + domain.getCanonicalHostName());
        System.out.println("Host Name: " + domain.getHostName());
        
        // check the domain active or not
        System.out.println("Checking target ip active or not...");
        System.out.println(domain.isReachable(1000));
    }
    
}
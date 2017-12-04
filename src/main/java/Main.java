import io.vertx.core.Vertx;
import io.vertx.core.dns.DnsClient;

public class Main {
    public static void main(String [] args ) {
        Vertx vertx = Vertx.vertx();
        DnsClient dnsClient = vertx.createDnsClient(53, "10.0.0.1");

        dnsClient.lookup6("vertx.io",  result -> {
            System.out.println(result.succeeded());
        });

    }
}

import com.moascode.modifiers.auction.Auction;
import com.moascode.modifiers.auction.Bid;

import static com.moascode.modifiers.Modifiers.*;

public class ModifiersTest {
    public static void main(String[] args) throws ClassNotFoundException {
        printClassModifiers(Auction.class);
        printClassModifiers(Bid.class);
        printClassModifiers(Bid.Builder.class);
        printClassModifiers(Class.forName("com.moascode.modifiers.auction.Bid$Builder$BidImpl"));

        printMethodsModifiers(Auction.class.getDeclaredMethods());

        printFieldsModifiers(Auction.class.getDeclaredFields());
        printFieldsModifiers(Bid.class.getDeclaredFields());
        runAuction();
    }
}

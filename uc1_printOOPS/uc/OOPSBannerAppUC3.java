/**
 * OOPSBannerApp - UC3
 * Goal: Display "OOPS" in a banner format using String.join() for efficiency.
 * 
 * @author YourName
 * @version 3.0
 */
public class OOPSBannerAppUC3 {

    /**
     * Entry point of the application.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Print OOPS in Banner Format using String.join()

        // Line 1
        System.out.println(String.join(" ", " *** ", "  *** ", " ***** ", " ***** "));
        // Line 2
        System.out.println(String.join(" ", "*   *", " *   *", " *    *", " *     "));
        // Line 3
        System.out.println(String.join(" ", "*   *", " *   *", " *    *", " *     "));
        // Line 4
        System.out.println(String.join(" ", "*   *", " *   *", " ***** ", " ***** "));
        // Line 5
        System.out.println(String.join(" ", "*   *", " *   *", " *      ", " *    "));
        // Line 6
        System.out.println(String.join(" ", "*   *", " *   *", " *      ", " *    "));
        // Line 7
        System.out.println(String.join(" ", " *** ", "  *** ", " *      ", " ***** "));
    }
}

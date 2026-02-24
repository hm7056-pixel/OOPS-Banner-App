/**
 * OOPSBannerApp - UC5
 * Goal: Display "OOPS" in a banner format using inline array initialization with String.join().
 * 
 * @author YourName
 * @version 5.0
 */
public class OOPSBannerAppUC5 {

    /**
     * Entry point of the application.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Inline initialization of banner lines using String.join()
        String[] bannerLines = {
            String.join(" ", " *** ", "  *** ", " ***** ", " ***** "),
            String.join(" ", "*   *", " *   *", " *    *", " *     "),
            String.join(" ", "*   *", " *   *", " *    *", " *     "),
            String.join(" ", "*   *", " *   *", " ***** ", " ***** "),
            String.join(" ", "*   *", " *   *", " *      ", " *    "),
            String.join(" ", "*   *", " *   *", " *      ", " *    "),
            String.join(" ", " *** ", "  *** ", " *      ", " ***** ")
        };

        // Print each line using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}

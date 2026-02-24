/**
 * OOPSBannerApp - UC4
 * Goal: Display "OOPS" in a banner format using String array and loop.
 * 
 * @author YourName
 * @version 4.0
 */
public class OOPSBannerAppUC4 {

    /**
     * Entry point of the application.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Store banner lines in a String array
        String[] bannerLines = {
            String.join(" ", " *** ", "  *** ", " ***** ", " ***** "),
            String.join(" ", "*   *", " *   *", " *    *", " *     "),
            String.join(" ", "*   *", " *   *", " *    *", " *     "),
            String.join(" ", "*   *", " *   *", " ***** ", " ***** "),
            String.join(" ", "*   *", " *   *", " *      ", " *    "),
            String.join(" ", "*   *", " *   *", " *      ", " *    "),
            String.join(" ", " *** ", "  *** ", " *      ", " ***** ")
        };

        // Print each line using a loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}

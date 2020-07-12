import org.opencv.core.Core;

import static org.opencv.core.Core.NATIVE_LIBRARY_NAME;

public class Main {
    public static void main(String[] args) {
        //Compulsory -> Load Native libraries
        System.loadLibrary(NATIVE_LIBRARY_NAME);
        System.out.println("Loaded OpenCV version "+ Core.VERSION);
    }
}

package android.graphics;

import android.util.Log;

import java.io.OutputStream;

public final class Bitmap {
    public enum Config {
        ARGB_8888   (5);

        final int nativeInt;
        Config(int ni) {
            this.nativeInt = ni;
        }
    }
    public enum CompressFormat {
        JPEG    (0),
        PNG     (1),
        WEBP    (2);

        CompressFormat(int nativeInt) {
            this.nativeInt = nativeInt;
        }
        final int nativeInt;
    }
    public static Bitmap createBitmap(int width, int height, Config config) throws Exception {
        throw new Exception("stub");
    }
    public final int getWidth() throws Exception {
        throw new Exception("stub");
    }
    public final int getHeight() throws Exception {
        throw new Exception("stub");
    }
    public boolean compress(CompressFormat format, int quality, OutputStream stream) throws Exception {
        throw new Exception("stub");
    }
}

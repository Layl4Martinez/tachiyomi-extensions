package android.net;

import java.util.List;

public abstract class Uri {
    public static final class Builder {
        public Builder appendQueryParameter(String key, String value) throws Exception {
            throw new Exception("stub");
        }
    }

    public abstract Builder buildUpon();

    public static Uri parse(String uriString) throws Exception {
        throw new Exception("stub");
    }

    public List<String> getPathSegments() throws Exception {
        throw new Exception("stub");
    }
}

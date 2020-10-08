package android.net;

import java.util.List;

public abstract class Uri {
    public abstract String getEncodedPath();
    public abstract String getEncodedQuery();
    public abstract String getEncodedFragment();
    public abstract String getLastPathSegment();
    public static final class Builder {
        public Builder appendQueryParameter(String key, String value) throws Exception {
            throw new Exception("stub");
        }
        public Builder path(String path) throws Exception {
            throw new Exception("stub");
        }
        public Builder appendPath(String newSegment) throws Exception {
            throw new Exception("stub");
        }
        public Builder fragment(String fragment) throws Exception {
            throw new Exception("stub");
        }
        public Uri build() throws Exception {
            throw new Exception("stub");
        }
        public Builder appendEncodedPath(String newSegment) throws Exception {
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

    public static String encode(String s) throws Exception {
        throw new Exception("stub");
    }

    public List<String> getQueryParameters(String key) throws Exception {
        throw new Exception("stub");
    }
}

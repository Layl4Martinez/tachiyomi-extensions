package android.net;

import java.util.List;

public abstract class Uri {
    public abstract String getEncodedPath();
    public abstract String getEncodedQuery();
    public abstract String getEncodedFragment();
    public abstract String getLastPathSegment();
    public static final class Builder {
        public Builder appendQueryParameter(String key, String value) {
            throw new UnsupportedOperationException("stub");
        }
        public Builder path(String path) {
            throw new UnsupportedOperationException("stub");
        }
        public Builder appendPath(String newSegment) {
            throw new UnsupportedOperationException("stub");
        }
        public Builder fragment(String fragment) {
            throw new UnsupportedOperationException("stub");
        }
        public Uri build() {
            throw new UnsupportedOperationException("stub");
        }
        public Builder appendEncodedPath(String newSegment) {
            throw new UnsupportedOperationException("stub");
        }
    }

    public abstract Builder buildUpon();

    public static Uri parse(String uriString) {
        throw new UnsupportedOperationException("stub");
    }

    public List<String> getPathSegments() {
        throw new UnsupportedOperationException("stub");
    }

    public static String encode(String s) {
        throw new UnsupportedOperationException("stub");
    }

    public List<String> getQueryParameters(String key) {
        throw new UnsupportedOperationException("stub");
    }
}

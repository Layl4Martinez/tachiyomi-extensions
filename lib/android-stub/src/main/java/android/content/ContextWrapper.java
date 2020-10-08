package android.content;

public class ContextWrapper extends Context {
    public String getPackageName() {
        throw new UnsupportedOperationException("stub");
    }
    @Override
    public void startActivity(Intent intent) {
        throw new UnsupportedOperationException("stub");
    }
    public SharedPreferences getSharedPreferences(String name, int mode) {
        throw new UnsupportedOperationException("stub");
    }
}

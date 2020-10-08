package android.content;

public class ContextWrapper extends Context {
    public String getPackageName() throws Exception {
        throw new Exception("stub");
    }

    @Override
    public void startActivity(Intent intent) throws Exception {
        throw new Exception("stub");
    }

    public SharedPreferences getSharedPreferences(String name, int mode) throws Exception {
        throw new Exception("stub");
    }
}

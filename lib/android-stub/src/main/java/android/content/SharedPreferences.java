package android.content;

public interface SharedPreferences {
    interface Editor {
        Editor putInt(String key, int value);
        Editor putString(String key, String value);
        Editor putBoolean(String key, boolean value);
        Editor putLong(String key, long value);
        boolean commit();
        void apply();
    }
    Editor edit();
    int getInt(String string, int integer);
    String getString(String string, String string2);
    boolean getBoolean(String key, boolean defValue);
    long getLong(String key, long defValue);
    boolean contains(String key);
}

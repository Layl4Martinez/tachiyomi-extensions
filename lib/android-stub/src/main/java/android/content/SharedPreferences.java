package android.content;

public interface SharedPreferences {

    interface Editor {
        SharedPreferences putInt(String string, int integer);
        SharedPreferences putString(String string, String string2);

    }

    Editor edit();

    boolean commit();

    int getInt(String string, int integer);

    String getString(String string, String string2);
}

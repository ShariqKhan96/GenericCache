package app.potli.genericcache;

import android.content.Context;

import io.paperdb.Paper;

public class Cache {
    private static final Cache ourInstance = new Cache();

    public static Cache getInstance(Context context) {
        Paper.init(context);
        return ourInstance;
    }

    private Cache() {
    }

    public <T> T get(String key) {
        return Paper.book().read(key);
    }

    public <T> void set(T object, String key) {
        Paper.book().write(key, object);
    }

    public void remove(String key) {
        Paper.book().delete(key);
    }

    public void clear() {
        Paper.book().destroy();
    }

}

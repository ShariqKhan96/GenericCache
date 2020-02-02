package app.potli.genericcache;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User();
        user.name = "s";

        Class cl = new Class();
        cl.name = "c";

        Cache.getInstance(this).set(user, "user");
        Cache.getInstance(this).set(cl, "class");

        User user1 = Cache.getInstance(this).get("user");
        Class c = Cache.getInstance(this).get("class");

        Log.e("userclass", user1.name + " " + c.name);

    }
}

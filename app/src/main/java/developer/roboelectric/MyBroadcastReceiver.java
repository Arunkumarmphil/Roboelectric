package developer.roboelectric;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Can try with some other way..",
                Toast.LENGTH_LONG).show();

        // Need to create alert box..


    }
}

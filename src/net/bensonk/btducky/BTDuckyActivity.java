package net.bensonk.btducky;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BTDuckyActivity extends Activity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final EditText message = (EditText) findViewById(R.id.message);
        final Button goButton = (Button) findViewById(R.id.go_button);
        goButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				String msg = message.getText().toString();
				message.getText().clear();
				Log.i(TAG, "Message for you sir: \"" + msg.trim() + "\"");
			}
		});
    }
    private static final String TAG = "BTDucky";
}
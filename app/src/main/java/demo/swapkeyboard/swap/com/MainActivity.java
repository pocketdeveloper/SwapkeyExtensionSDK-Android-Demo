package demo.swapkeyboard.swap.com;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import swap.com.swapkeyboard.sdk.service.SwapKeyService;
import swap.com.swapkeyboard.sdk.service.security.SecureDevicePreferences;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add this to enter a device
        SecureDevicePreferences secureDevice = new SecureDevicePreferences(this);
        secureDevice.saveAPIKey("swap");
        secureDevice.save("DEVICE");

    }
}
package cl.ipvg.ejemplosensoresipvg2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SensorManager mgr;
    private TextView textlista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mgr =(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        textlista =(TextView) findViewById(R.id.sensorLista);
        List<Sensor> sensorlista= mgr.getSensorList(Sensor.TYPE_ALL);
        StringBuilder strbuilder =new StringBuilder();
        for ( Sensor s: sensorlista){
            strbuilder.append(s.getName()+"\n");
         }
        textlista.setVisibility(View.VISIBLE);
        textlista.setText(strbuilder);

    }
}
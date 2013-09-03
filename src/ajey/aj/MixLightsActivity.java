package ajey.aj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MixLightsActivity extends Activity implements OnItemSelectedListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MixLightsActivity.this, R.array.color_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        
        spinner.setOnItemSelectedListener(this);
        
            
        Button b=(Button)findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
			finish();
			System.exit(0);
				
			}
		});
                
    }

	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		
		Spinner sp1=(Spinner)findViewById(R.id.spinner1);
		
		String txt=sp1.getSelectedItem().toString();
		
		if(txt.equals("Blue"))
		{
			Intent blueIntent = new Intent(MixLightsActivity.this,BLA.class);
        	startActivity(blueIntent);
        	//finish();
		}
		if(txt.equals("Orange"))
		{
			Intent orangeIntent=new Intent(MixLightsActivity.this,OLA.class);
			startActivity(orangeIntent);
			//finish();
		}
		if(txt.equals("Green"))
		{
			Intent GreenIntent=new Intent(MixLightsActivity.this,GLA.class);
			startActivity(GreenIntent);
			//finish();
		}
		if(txt.equals("Pink"))
		{
			Intent pinkIntent=new Intent(MixLightsActivity.this,PLA.class);
			startActivity(pinkIntent);
			//finish();
		}
		if(txt.equals("Red"))
		{
			Intent redIntent=new Intent(MixLightsActivity.this,RLA.class);
			startActivity(redIntent);
			//finish();
		}
		if(txt.equals("Yellow"))
		{
			Intent yellowIntent=new Intent(MixLightsActivity.this,YLA.class);
			startActivity(yellowIntent);
			//finish();
		}
		
	}

	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
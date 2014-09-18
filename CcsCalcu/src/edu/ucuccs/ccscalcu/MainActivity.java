package edu.ucuccs.ccscalcu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        start = (Button)findViewById(R.id.go);
       
       start.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent gotocalcu=new Intent(MainActivity.this,Calculator.class);
			startActivity(gotocalcu);
			
		}
    	   
       
       });
    	   
     


    }

	
	}
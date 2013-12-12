package org.example.mbtiapplication;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MBTI extends Activity {

	//Main Activity

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mbti); 
		
		//Creates a button object to for 'Quick Assessment Test'
		final Button button = (Button) findViewById(R.id.btntype);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	//Opens MBTI Test class 
            	Intent myIntent = new Intent(MBTI.this, MBTITest.class);
        		MBTI.this.startActivity(myIntent);
            }
        });
	
	}
	


	
	
	       





}

	


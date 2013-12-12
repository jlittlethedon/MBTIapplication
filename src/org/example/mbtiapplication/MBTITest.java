package org.example.mbtiapplication;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MBTITest extends Activity implements OnItemSelectedListener {

	// Add Questions:
	// Modify 'submit' array variable to # of questions
	// declare & initiate xSpinner variable
	// initiate 'submit' variable
	// Add items to new Spinners
	// setOnItemSelectedListener for new Spinners
	// Add new question to onSelectedItem method
	// Modify XXXauthenticator length

	float I, E, N, S, T, F, J, P;
	String[] type;
	String[] submit;
	Spinner Spinner1;
	Spinner Spinner2;
	Spinner Spinner3;
	Spinner Spinner4;
	Spinner Spinner5;
	Spinner Spinner6;
	Spinner Spinner7;
	Spinner Spinner8;
	Spinner Spinner9;
	Spinner Spinner10;
	Spinner Spinner11;
	Spinner Spinner12;
	String Answer1;
	String Answer2;
	String Answer3;
	String Answer4;
	String Answer5;
	String Answer6;
	String Answer7;
	String Answer8;
	String Answer9;
	String Answer10;
	String Answer11;
	String Answer12;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mbtitest);
		Spinner1 = (Spinner) findViewById(R.id.spinner1);
		Spinner2 = (Spinner) findViewById(R.id.spinner2);
		Spinner3 = (Spinner) findViewById(R.id.spinner3);
		Spinner4 = (Spinner) findViewById(R.id.spinner4);
		Spinner5 = (Spinner) findViewById(R.id.Spinner5);
		Spinner6 = (Spinner) findViewById(R.id.Spinner6);
		Spinner7 = (Spinner) findViewById(R.id.Spinner7);
		Spinner8 = (Spinner) findViewById(R.id.Spinner8);
		Spinner9 = (Spinner) findViewById(R.id.Spinner9);
		Spinner10 = (Spinner) findViewById(R.id.Spinner10);
		Spinner11 = (Spinner) findViewById(R.id.Spinner11);
		Spinner12 = (Spinner) findViewById(R.id.Spinner12);
		type = new String[4];
		submit = new String[12];
		submit[0] = " ";
		submit[1] = " ";
		submit[2] = " ";
		submit[3] = " ";
		submit[4] = " ";
		submit[5] = " ";
		submit[6] = " ";
		submit[7] = " ";
		submit[8] = " ";
		submit[9] = " ";
		submit[10] = " ";
		submit[11] = " ";
		addItemsOnSpinner1();
		addItemsOnSpinner2();
		addItemsOnSpinner3();
		addItemsOnSpinner4();
		addItemsOnSpinner5();
		addItemsOnSpinner6();
		addItemsOnSpinner7();
		addItemsOnSpinner8();
		addItemsOnSpinner9();
		addItemsOnSpinner10();
		addItemsOnSpinner11();
		addItemsOnSpinner12();
		Spinner1.setOnItemSelectedListener(this);
		Spinner2.setOnItemSelectedListener(this);
		Spinner3.setOnItemSelectedListener(this);
		Spinner4.setOnItemSelectedListener(this);
		Spinner5.setOnItemSelectedListener(this);
		Spinner6.setOnItemSelectedListener(this);
		Spinner7.setOnItemSelectedListener(this);
		Spinner8.setOnItemSelectedListener(this);
		Spinner9.setOnItemSelectedListener(this);
		Spinner10.setOnItemSelectedListener(this);
		Spinner11.setOnItemSelectedListener(this);
		Spinner12.setOnItemSelectedListener(this);
		
		
		
		
		
		Button calculate = (Button) findViewById(R.id.calculate);
		calculate.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				resetValues();
				evaluateAnswers();
				evaluateType2();
				buildTypeString();
				//TextView debugger = (TextView) findViewById(R.id.TextView1);
				// StringBuilder type2Builder = new StringBuilder();
				// for (String letters : eval) {
				// type2Builder.append(letters);
				// }
				//debugger.setText("Scroll down and answer all 16 questions.\n Click submit when you're finished!");

			}
		});
	}

	// ADD STRING ARRAY OPTIONS FOR ALL 4 SPINNERS
	public void addItemsOnSpinner1() {
		Spinner firstSpinner = (Spinner) findViewById(R.id.spinner1);
		// Create an ArrayAdapter using the string array and a default spinner
		// layout
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.spinnerarraybool,
				android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		firstSpinner.setAdapter(adapter);
	}

	public void addItemsOnSpinner2() {
		Spinner firstSpinner = (Spinner) findViewById(R.id.spinner2);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.spinnerarraybool,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		firstSpinner.setAdapter(adapter);
	}

	public void addItemsOnSpinner3() {
		Spinner firstSpinner = (Spinner) findViewById(R.id.spinner3);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.spinnerarraybool,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		firstSpinner.setAdapter(adapter);
	}

	public void addItemsOnSpinner4() {
		Spinner firstSpinner = (Spinner) findViewById(R.id.spinner4);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.spinnerarraybool,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		firstSpinner.setAdapter(adapter);
	}

	public void addItemsOnSpinner5() {
		Spinner firstSpinner = (Spinner) findViewById(R.id.Spinner5);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.spinnerarraybool,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		firstSpinner.setAdapter(adapter);
	}
	
	public void addItemsOnSpinner6() {
		Spinner firstSpinner = (Spinner) findViewById(R.id.Spinner6);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.spinnerarraybool,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		firstSpinner.setAdapter(adapter);
	}
	public void addItemsOnSpinner7() {
		Spinner firstSpinner = (Spinner) findViewById(R.id.Spinner7);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.spinnerarraybool,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		firstSpinner.setAdapter(adapter);
	}
	public void addItemsOnSpinner8() {
		Spinner firstSpinner = (Spinner) findViewById(R.id.Spinner8);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.spinnerarraybool,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		firstSpinner.setAdapter(adapter);
	}
	public void addItemsOnSpinner9() {
		Spinner firstSpinner = (Spinner) findViewById(R.id.Spinner9);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.spinnerarraybool,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		firstSpinner.setAdapter(adapter);
	}
	public void addItemsOnSpinner10() {
		Spinner firstSpinner = (Spinner) findViewById(R.id.Spinner10);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.spinnerarraybool,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		firstSpinner.setAdapter(adapter);
	}
	public void addItemsOnSpinner11() {
		Spinner firstSpinner = (Spinner) findViewById(R.id.Spinner11);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.spinnerarraybool,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		firstSpinner.setAdapter(adapter);
	}
	public void addItemsOnSpinner12() {
		Spinner firstSpinner = (Spinner) findViewById(R.id.Spinner12);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.spinnerarraybool,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		firstSpinner.setAdapter(adapter);
	}
	
	// ACTIONS THAT TAKE PLACE WHEN SPINNER OPTION IS CHOSEN

	public void onItemSelected(AdapterView<?> parent, View view, int arg2,
			long arg3) {
		Button calculatebtn = (Button) findViewById(R.id.calculate);
		switch (parent.getId()) {
		case R.id.spinner1:
			String Answer1 = Spinner1.getSelectedItem().toString();
			if (Answer1.equals("Select an Answer")) {
				submit[0] = " ";
				calculatebtn.setEnabled(false);
			}
			if (Answer1.equals("True")) {
				submit[0] = "x";
				enableSubmit();

			}
			if (Answer1.equals("In the Middle")) {
				submit[0] = "x";
				enableSubmit();
			}
			if (Answer1.equals("False")) {
				submit[0] = "x";
				enableSubmit();
			}
			break;

		case R.id.spinner2:

			String Answer2 = Spinner2.getSelectedItem().toString();
			if (Answer2.equals("Select an Answer")) {
				submit[1] = " ";
				calculatebtn.setEnabled(false);
			}

			if (Answer2.equals("True")) {
				submit[1] = "x";
				enableSubmit();

			}
			if (Answer2.equals("In the Middle")) {
				submit[1] = "x";
				enableSubmit();
			}
			if (Answer2.equals("False")) {
				submit[1] = "x";
				enableSubmit();
			}

			break;

		case R.id.spinner3:
			String Answer3 = Spinner3.getSelectedItem().toString();
			if (Answer3.equals("Select an Answer")) {
				submit[2] = " ";
				calculatebtn.setEnabled(false);
			}
			if (Answer3.equals("True")) {

				submit[2] = "x";
				enableSubmit();
			}
			if (Answer3.equals("In the Middle")) {

				submit[2] = "x";
				enableSubmit();
			}
			if (Answer3.equals("False")) {

				submit[2] = "x";
				enableSubmit();
			}
			break;

		case R.id.spinner4:
			String Answer4 = Spinner4.getSelectedItem().toString();
			if (Answer4.equals("Select an Answer")) {
				submit[3] = " ";
				calculatebtn.setEnabled(false);
			}
			if (Answer4.equals("True")) {

				submit[3] = "x";
				enableSubmit();
			}
			if (Answer4.equals("In the Middle")) {

				submit[3] = "x";
				enableSubmit();
			}
			if (Answer4.equals("False")) {

				submit[3] = "x";
				enableSubmit();
			}
			break;
		
		case R.id.Spinner5:
			String Answer5 = Spinner5.getSelectedItem().toString();
			if (Answer5.equals("Select an Answer")) {
				submit[4] = " ";
				calculatebtn.setEnabled(false);
			}
			if (Answer5.equals("True")) {

			submit[4] = "x";
			enableSubmit();
			}
			if (Answer5.equals("In the Middle")) {

				submit[4] = "x";
				enableSubmit();
			}
			if (Answer5.equals("False")) {

				submit[4] = "x";
				enableSubmit();
			}
			break;
		case R.id.Spinner6:
			String Answer6 = Spinner6.getSelectedItem().toString();
			if (Answer6.equals("Select an Answer")) {
				submit[5] = " ";
				calculatebtn.setEnabled(false);
			}
			if (Answer6.equals("True")) {

				submit[5] = "x";
				enableSubmit();
			}
			if (Answer6.equals("In the Middle")) {

				submit[5] = "x";
				enableSubmit();
			}
			if (Answer6.equals("False")) {

				submit[5] = "x";
				enableSubmit();
			}
			break;
		case R.id.Spinner7:
			String Answer7 = Spinner7.getSelectedItem().toString();
			if (Answer7.equals("Select an Answer")) {
				submit[6] = " ";
				calculatebtn.setEnabled(false);
			}
			if (Answer7.equals("True")) {

				submit[6] = "x";
				enableSubmit();
			}
			if (Answer7.equals("In the Middle")) {

				submit[6] = "x";
				enableSubmit();
			}
			if (Answer7.equals("False")) {

				submit[6] = "x";
				enableSubmit();
			}
			break;
		case R.id.Spinner8:
			String Answer8 = Spinner8.getSelectedItem().toString();
			if (Answer8.equals("Select an Answer")) {
				submit[7] = " ";
				calculatebtn.setEnabled(false);
			}
			if (Answer8.equals("True")) {

				submit[7] = "x";
				enableSubmit();
			}
			if (Answer8.equals("In the Middle")) {

				submit[7] = "x";
				enableSubmit();
			}
			if (Answer8.equals("False")) {

				submit[7] = "x";
				enableSubmit();
			}
			break;
		case R.id.Spinner9:
			String Answer9 = Spinner9.getSelectedItem().toString();
			if (Answer9.equals("Select an Answer")) {
				submit[8] = " ";
				calculatebtn.setEnabled(false);
			}
			if (Answer9.equals("True")) {

				submit[8] = "x";
				enableSubmit();
			}
			if (Answer9.equals("In the Middle")) {

				submit[8] = "x";
				enableSubmit();
			}
			if (Answer9.equals("False")) {

				submit[8] = "x";
				enableSubmit();
			}
			break;
		case R.id.Spinner10:
			String Answer10 = Spinner10.getSelectedItem().toString();
			if (Answer10.equals("Select an Answer")) {
				submit[9] = " ";
				calculatebtn.setEnabled(false);
			}
			if (Answer10.equals("True")) {

				submit[9] = "x";
				enableSubmit();
			}
			if (Answer10.equals("In the Middle")) {

				submit[9] = "x";
				enableSubmit();
			}
			if (Answer10.equals("False")) {

				submit[9] = "x";
				enableSubmit();
			}
			break;
		case R.id.Spinner11:
			String Answer11 = Spinner11.getSelectedItem().toString();
			if (Answer11.equals("Select an Answer")) {
				submit[10] = " ";
				calculatebtn.setEnabled(false);
			}
			if (Answer11.equals("True")) {

				submit[10] = "x";
				enableSubmit();
			}
			if (Answer11.equals("In the Middle")) {

				submit[10] = "x";
				enableSubmit();
			}
			if (Answer11.equals("False")) {

				submit[10] = "x";
				enableSubmit();
			}
			break;
		case R.id.Spinner12:
			String Answer12 = Spinner12.getSelectedItem().toString();
			if (Answer12.equals("Select an Answer")) {
				submit[11] = " ";
				calculatebtn.setEnabled(false);
			}
			if (Answer12.equals("True")) {

				submit[11] = "x";
				enableSubmit();
			}
			if (Answer12.equals("In the Middle")) {

				submit[11] = "x";
				enableSubmit();
			}
			if (Answer12.equals("False")) {

				submit[11] = "x";
				enableSubmit();
			}
			break;
		}
	}
	

	public void evaluateAnswers() {
		String Answer1 = Spinner1.getSelectedItem().toString();
		if (Answer1.equals("True")) {
			E += 1;
		}
		if (Answer1.equals("In the Middle")) {
			E += .5f;
			I += .5f;
		}
		if (Answer1.equals("False")) {
			I += 1;
		}
		String Answer2 = Spinner2.getSelectedItem().toString();
		if (Answer2.equals("True")) {
			N += 1;
		}
		if (Answer2.equals("In the Middle")) {
			N += .5f;
			S += .5f;
		}
		if (Answer2.equals("False")) {
			S += 1;
		}
		String Answer3 = Spinner3.getSelectedItem().toString();
		if (Answer3.equals("True")) {
			F += 1;
		}
		if (Answer3.equals("In the Middle")) {
			F += .5f;
			T += .5f;
		}
		if (Answer3.equals("False")) {
			T += 1;
		}
		String Answer4 = Spinner4.getSelectedItem().toString();
		if (Answer4.equals("True")) {
			J += 1;
		}
		if (Answer4.equals("In the Middle")) {
			P += .5f;
			J += .5f;
		}
		if (Answer4.equals("False")) {
			P += 1;
		}
	}
	public void evaluateType2(){
		if (E > I) {
			type[0] = "E";
		}
		if (I > E) {
			type[0] = "I";
		}
		if (I == E) {
			type[0] = "x";
		}
		if (T > F) {
			type[2] = "T";
		}
		if (F > T) {
			type[2] = "F";
		}
		if (T == F) {
			type[2] = "x";
		}
		if (N > S) {
			type[1] = "N";
		}
		if (S > N) {
			type[1] = "S";
		}
		if (S == N) {
			type[1] = "x";
		}
		if (P > J) {
			type[3] = "P";
		}
		if (J > P) {
			type[3] = "J";
		}
		if (P == J) {
			type[3] = "x";
		}

	}

	public void resetValues() {
		I = 0;
		E = 0;
		N = 0;
		S = 0;
		T = 0;
		F = 0;
		P = 0;
		J = 0;

	}

	public void buildTypeString() {
		StringBuilder typeBuilder = new StringBuilder();
		for (String letters : type) {
			typeBuilder.append(letters);
		}
		TextView calculatedPersonality = (TextView) findViewById(R.id.personalitytype);
		calculatedPersonality.setText(typeBuilder.toString());
	}

	public void enableSubmit() {
		StringBuilder XXXXauthenticator = new StringBuilder();
		for (String letters : submit) {
			XXXXauthenticator.append(letters);
		}
		String newXXXX = XXXXauthenticator.toString();
		if (newXXXX.equals("xxxxxxxxxxxx")) {
			Button calculate = (Button) findViewById(R.id.calculate);
			calculate.setEnabled(true);
		}

	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}

}

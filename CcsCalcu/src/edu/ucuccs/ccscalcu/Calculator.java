package edu.ucuccs.ccscalcu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Calculator extends Activity implements OnClickListener {
	Button one;
	Button two;
	Button three;
	Button four;
	Button five;
	Button six;
	Button seven;
	Button eight;
	Button nine;
	Button zero;
	Button A;
	Button B;
	Button C;
	Button D;
	Button E;
	Button F;

	Button divide;
	Button multiply;
	Button minus;
	Button plus;
	Button point;
	Button equals;
	RadioButton binary;
	RadioButton octal;
	RadioButton decimal;
	RadioButton hexa;
	EditText calc;

	boolean clear;
	
	String addSymbol;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);

		one = (Button) findViewById(R.id.one);
		two = (Button) findViewById(R.id.two);
		three = (Button) findViewById(R.id.three);
		four = (Button) findViewById(R.id.four);
		five = (Button)findViewById(R.id.five);
		six = (Button)findViewById(R.id.six);
		seven = (Button)findViewById(R.id.seven);
		eight = (Button)findViewById(R.id.eight);
		nine = (Button)findViewById(R.id.nine);
		zero = (Button)findViewById(R.id.zero);
		A = (Button)findViewById(R.id.a);
		B = (Button)findViewById(R.id.b);
		C = (Button)findViewById(R.id.c);
		D = (Button)findViewById(R.id.d);
		E = (Button)findViewById(R.id.e);
		F = (Button)findViewById(R.id.f);
		divide = (Button)findViewById(R.id.division);
		multiply = (Button)findViewById(R.id.multiply);
		minus = (Button)findViewById(R.id.minus);
		plus = (Button)findViewById(R.id.plus);
		equals = (Button)findViewById(R.id.equals);
		point = (Button)findViewById(R.id.point);
		calc = (EditText)findViewById(R.id.calc_screen);
		
		
calc.setText("");
		
		one.setOnClickListener(this);
		two.setOnClickListener(this);
		three.setOnClickListener(this);
		four.setOnClickListener(this);
		five.setOnClickListener(this);
		six.setOnClickListener(this);
		seven.setOnClickListener(this);
		eight.setOnClickListener(this);
		nine.setOnClickListener(this);
		zero.setOnClickListener(this);
		
		A.setOnClickListener(this);
		B.setOnClickListener(this);
		C.setOnClickListener(this);
		D.setOnClickListener(this);
		
		E.setOnClickListener(this);
		F.setOnClickListener(this);
		
		clear = false;
		
		
    }

	
	public void onClick(View v) {
		if(clear){
			calc.setText("");
			clear = false;
		}
		int id = v.getId();
		String addSymbol="";
		switch(id){
		case R.id.one:
			addSymbol = "1";
			break;
		case R.id.two:
			addSymbol = "2";
			break;
		case R.id.three:
			addSymbol = "3";
			break;
		case R.id.four:
			addSymbol = "4";
			break;
		case R.id.five:
			addSymbol = "5";
			break;
		case R.id.six:
			addSymbol = "6";
			break;
		case R.id.seven:
			addSymbol = "7";
			break;
		case R.id.eight:
			addSymbol = "8";
			break;
		case R.id.nine:
			addSymbol = "9";
			break;
		case R.id.zero:
			addSymbol = "0";
			break;
		case R.id.a:
			addSymbol = "A";
			break;
		case R.id.b:
			addSymbol = "B";
			break;
		case R.id.c:
			addSymbol = "C";
			break;
		case R.id.d:
			addSymbol = "D";
			break;
		case R.id.e:
			addSymbol = "E";
			break;
		case R.id.f:
			addSymbol = "F";
			break;
		
	}


	}

}

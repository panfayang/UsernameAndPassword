package com.example.usernameandpassword;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.View;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void dialogSignin(View view){
		FragmentManager fm = getSupportFragmentManager();
		DialogSignin ds = new DialogSignin();
		ds.show(fm, "dialog_Signin");
//		Intent intent = new Intent(this, FragmentWrapper.class);
//    	startActivity(intent);
//		DialogFragment newFragment = DialogSignin.newInstance(R.string.title_activity_dialog_signin);
//		newFragment.show(getSupportFragmentManager(),"kjhk");

	}
}

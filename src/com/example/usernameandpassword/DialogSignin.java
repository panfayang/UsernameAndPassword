package com.example.usernameandpassword;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DialogSignin extends DialogFragment {
	
	
	@Override
	public Dialog onCreateDialog(Bundle saveInstanceState){
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		// Get the layout inflater 
		LayoutInflater inflater = getActivity().getLayoutInflater();
		final View view = inflater.inflate(R.layout.activity_dialog_signin, null);
		
		
		// Inflate and set the layout for the dialog
		// Pass null as the parent view because its going in the dialog layout

		builder.setView(view)
		// Add action buttons
		
			.setPositiveButton(R.string.signin, new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface dialog, int id){
					EditText uname = (EditText) view.findViewById(R.id.username);
					EditText pword = (EditText) view.findViewById(R.id.password);
					String username = uname.getText().toString();
					String password = pword.getText().toString();
					Toast.makeText(getActivity(), username, Toast.LENGTH_SHORT).show();
					if (username.equals("pan") && password.equals("abc")){
						Toast toast = Toast.makeText(getActivity(), "success", Toast.LENGTH_SHORT);
						toast.show();
					}
					else{
						Toast toast2 = Toast.makeText(getActivity(), "wrong", Toast.LENGTH_SHORT);
						toast2.show();
					}
					
					
				}
			})
			.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int id){
					DialogSignin.this.getDialog().cancel();
				}
					
			});
		
		return builder.create();
	}
	
	

}

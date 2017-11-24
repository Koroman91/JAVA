package net.learn2develop.Dialog;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	CharSequence[] items = { "Google", "Apple", "Microsoft" };
	boolean[] itemsChecked = new boolean [items.length];
	protected boolean isChecked;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

public void onClick(View v)
{
showDialog(0);	
}

public void onClick2(View v)
{
	//---prikazivanje okvira za dijalog---
	final ProgressDialog dialog = ProgressDialog.show(this, "Doing something", "Please wait..", true);
	new Thread(new Runnable(){
		public void run(){
			try {
			//---simulacija izvrsavanja akcije koja drugo traje---
			Thread.sleep(5000);
			//---uklanjanje okvira za dijalog---
					dialog.dismiss();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
			
		}
	}
}).start();
}

@Override
 protected Dialog onCreateDialog(int id){
	switch(id){
	case 0:
		return new AlertDialog.Builder(this)
		.setIcon(R.drawable.ic_launcher)
		.setTitle("This is a dialog with some simple text...")
		.setPositiveButton("OK",
				new DialogInterface.OnClickListener(){
			public void onClick(DialogInterface dialog, int whichButton)
			{
				Toast.makeText(getBaseContext(), 
						"OK clicked!", Toast.LENGTH_SHORT).show();
			}
		}
	)
	.setNegativeButton("Cancel",
			new DialogInterface.OnClickListener(){
		public void onClick(DialogInterface dialog, int whichButton)
		{
			Toast.makeText(getBaseContext(), 
					"Cancel clicked!", Toast.LENGTH_SHORT).show();
		}
	}
)
    .setMultiChoiceItems(items, itemsChecked,
    		new DialogInterface.OnMultiChoiceClickListener()
    {
    	public void onClick(DialogInterface dialog,
    			int which, boolean isClicked) {
    		Toast.makeText(getBaseContext(),
    				items[which] + (isChecked ? " checked!":" unchecked!"),
    				Toast.LENGTH_SHORT).show();
    	}
    }
              ).create();
         }
         return null;
    }
}
    	
  


package com.example.telas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	Button bt2, bt3;
	EditText texto, texto2;
	Singleton bd = Singleton.getInstance();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		bt2 = (Button) findViewById(R.id.button2);
		bt3 = (Button) findViewById(R.id.button3);
		texto = (EditText) findViewById(R.id.editText1);

		bt2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Log.e("SETANDO text", "nao entrou");
				if (!texto.getText().toString().equals("")) {
					bd.setText(texto.getText().toString());
				}
				Log.e("SETOU text", bd.getText());
				// TODO Auto-generated method stub
				Intent TrocaTela = new Intent(MainActivity.this, tela_2.class);

				MainActivity.this.startActivity(TrocaTela);

				MainActivity.this.finish();
			}
		});

		bt3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent TrocaTela = new Intent(MainActivity.this, tela_3.class);
				if (!texto.getText().toString().equals("")) {
					bd.setText(texto.getText().toString());
				}
				MainActivity.this.startActivity(TrocaTela);

				MainActivity.this.finish();
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

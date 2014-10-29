package com.example.telas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class tela_2 extends Activity {
	
	Button bt1, bt3;
	TextView texto2;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_2);
        
       
        bt1 = (Button) findViewById(R.id.button1);
        bt3 = (Button) findViewById(R.id.button3);
        texto2 = (TextView) findViewById(R.id.textView2);
        
        bt1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				Intent TrocaTela = new Intent(tela_2.this, MainActivity.class);
				
				tela_2.this.startActivity(TrocaTela);
				
				tela_2.this.finish();
			}
		});
        
        bt3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				Intent TrocaTela = new Intent(tela_2.this, tela_3.class);
				
				tela_2.this.startActivity(TrocaTela);
				
				tela_2.this.finish();
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

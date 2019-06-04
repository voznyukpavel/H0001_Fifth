package com.home.h0001_fifth;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements OnClickListener {
	private DBHelper dbhelper;
	private TextView text_winner;
	private ContentValues cv;
	private SQLiteDatabase db;
	private List<Button> buttons;
	private Randomizer random_numb;
	// private TextView user_name;
	final private String TAG_LOG = "Fifth";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d(TAG_LOG, "create activity");
		initialize();

	}

	private void initialize() {
		Log.d(TAG_LOG, "initialize");
		buttons = new ArrayList<Button>();
		text_winner = (TextView) findViewById(R.id.textView1);
		dbhelper = new DBHelper(this);
		cv = new ContentValues();
		db = dbhelper.getWritableDatabase();
		// user_name = (TextView) findViewById(R.id.textView2);
		buttons.add((Button) findViewById(R.id.button1));
		buttons.add((Button) findViewById(R.id.button2));
		buttons.add((Button) findViewById(R.id.button3));
		buttons.add((Button) findViewById(R.id.button4));
		buttons.add((Button) findViewById(R.id.button5));
		buttons.add((Button) findViewById(R.id.button6));
		buttons.add((Button) findViewById(R.id.button7));
		buttons.add((Button) findViewById(R.id.button8));
		buttons.add((Button) findViewById(R.id.button9));
		buttons.add((Button) findViewById(R.id.button10));
		buttons.add((Button) findViewById(R.id.button11));
		buttons.add((Button) findViewById(R.id.button12));
		buttons.add((Button) findViewById(R.id.button13));
		buttons.add((Button) findViewById(R.id.button14));
		buttons.add((Button) findViewById(R.id.button15));
		buttons.add((Button) findViewById(R.id.button16));
		fillButtons();

	}

	private void fillButtons() {
		Log.d(TAG_LOG, "fillButtons");
		random_numb = new Randomizer();
		int counter = 0;
		for (Button b : buttons) {
			String s = "" + random_numb.getElement(counter);
			if (s.equals("0")) {
				s = "";
				b.setEnabled(false);
			} else {
				b.setEnabled(true);
			}
			b.setText(s);
			b.setOnClickListener(this);
			counter++;
		}
		styleDecor();
	}

	private void styleDecor() {
		Log.d(TAG_LOG, "styleDecor");
		RelativeLayout back = (RelativeLayout) findViewById(R.id.RL);
		back.setBackgroundResource(R.color.backGroundFifth);
		for (Button b : buttons) {		
			if(!b.getText().equals("")){
				String numb=b.getText().toString();
				Integer number=Integer.valueOf(numb);
				buttonsPicture(b, number);
			}
			if (b.getText().equals("")) {
				b.setBackgroundResource(R.drawable.button_normal);
			}
		}
		Toast.makeText(this, "ñîáåðè", Toast.LENGTH_LONG).show();
	}
	
	private void buttonsPicture(Button b, int numb){
		switch(numb){
		case 1:{
			b.setBackgroundResource(R.drawable.button_normal1);
			break;
		}
		case 2:{
			b.setBackgroundResource(R.drawable.button_normal2);
			break;
		}
		case 3:{
			b.setBackgroundResource(R.drawable.button_normal3);
			break;
		}
		case 4:{
			b.setBackgroundResource(R.drawable.button_normal4);
			break;
		}
		case 5:{
			b.setBackgroundResource(R.drawable.button_normal5);
			break;
		}
		case 6:{
			b.setBackgroundResource(R.drawable.button_normal6);
			break;
		}
		case 7:{
			b.setBackgroundResource(R.drawable.button_normal7);
			break;
		}
		case 8:{
			b.setBackgroundResource(R.drawable.button_normal8);
			break;
		}
		case 9:{
			b.setBackgroundResource(R.drawable.button_normal9);
			break;
		}
		case 10:{
			b.setBackgroundResource(R.drawable.button_normal10);
			break;
		}
		case 11:{
			b.setBackgroundResource(R.drawable.button_normal11);
			break;
		}
		case 12:{
			b.setBackgroundResource(R.drawable.button_normal12);
			break;
		}
		case 13:{
			b.setBackgroundResource(R.drawable.button_normal13);
			break;
		}
		case 14:{
			b.setBackgroundResource(R.drawable.button_normal14);
			break;
		}
		case 15:{
			b.setBackgroundResource(R.drawable.button_normal15);
			break;
		}
		}
	}

	public void onClick(View v) {
		Log.d(TAG_LOG, "onClick");
		switch (v.getId()) {
		case R.id.button1:
			selectedMetod(buttons.get(0), 0);
			break;
		case R.id.button2:
			selectedMetod(buttons.get(1), 1);
			break;
		case R.id.button3:
			selectedMetod(buttons.get(2), 2);
			break;
		case R.id.button4:
			selectedMetod(buttons.get(3), 3);
			break;
		case R.id.button5:
			selectedMetod(buttons.get(4), 4);
			break;
		case R.id.button6:
			selectedMetod(buttons.get(5), 5);
			break;
		case R.id.button7:
			selectedMetod(buttons.get(6), 6);
			break;
		case R.id.button8:
			selectedMetod(buttons.get(7), 7);
			break;
		case R.id.button9:
			selectedMetod(buttons.get(8), 8);
			break;
		case R.id.button10:
			selectedMetod(buttons.get(9), 9);
			break;
		case R.id.button11:
			selectedMetod(buttons.get(10), 10);
			break;
		case R.id.button12:
			selectedMetod(buttons.get(11), 11);
			break;
		case R.id.button13:
			selectedMetod(buttons.get(12), 12);
			break;
		case R.id.button14:
			selectedMetod(buttons.get(13), 13);
			break;
		case R.id.button15:
			selectedMetod(buttons.get(14), 14);
			break;
		case R.id.button16:
			selectedMetod(buttons.get(15), 15);
			break;
		}
	}

	private void selectedMetod(Button b, int id_botton) {
		Log.d(TAG_LOG, "selectedMetod");
		NavigableMap<Integer, Button> chosenbuttons = new TreeMap<Integer, Button>();
		for (int i = 1; i < 4; i++) {
			if (id_botton < 4) {
				if (id_botton - i >= 0) {
					chosenbuttons
							.put(id_botton - i, buttons.get(id_botton - i));
				}
				if (id_botton + i < 4) {
					chosenbuttons
							.put(id_botton + i, buttons.get(id_botton + i));
				}
			} else if (id_botton < 8) {
				if (id_botton - i > 3) {
					chosenbuttons
							.put(id_botton - i, buttons.get(id_botton - i));
				}
				if (id_botton + i < 8) {
					chosenbuttons
							.put(id_botton + i, buttons.get(id_botton + i));
				}
			} else if (id_botton < 12) {
				if (id_botton - i > 7) {
					chosenbuttons
							.put(id_botton - i, buttons.get(id_botton - i));
				}
				if (id_botton + i < 12) {
					chosenbuttons
							.put(id_botton + i, buttons.get(id_botton + i));
				}
			} else {
				if (id_botton - i > 11) {
					chosenbuttons
							.put(id_botton - i, buttons.get(id_botton - i));
				}
				if (id_botton + i <= 15) {
					chosenbuttons
							.put(id_botton + i, buttons.get(id_botton + i));
				}
			}
			if (id_botton + 4 * i <= 15) {
				chosenbuttons.put(id_botton + (4 * i),
						buttons.get(id_botton + (4 * i)));
			}
			if (id_botton - 4 * i >= 0) {
				chosenbuttons.put(id_botton - (4 * i),
						buttons.get(id_botton - (4 * i)));
			}

		}
		chosenbuttons.put(id_botton, b);
		setMetod(chosenbuttons, b, id_botton);

	}

	private void setMetod(NavigableMap<Integer, Button> chosenbuttons,
			Button b, int id_botton) {
		Log.d(TAG_LOG, "setMetod");
		Set<Integer> keys = new HashSet<Integer>();
		keys = chosenbuttons.keySet();
		Integer[] keyses = new Integer[keys.size()];
		keyses = keys.toArray(keyses);
		for (int i = 0; i < keyses.length; i++) {
			int key = keyses[i];
			String button_text = chosenbuttons.get(key).getText().toString();
			if (button_text == "") {
				int nullkey = keyses[i];
				if (id_botton - nullkey > 3) {
					movingButtons(chosenbuttons, b, id_botton, nullkey, 4);
					break;
				} else if (id_botton - nullkey <= 3 && id_botton - nullkey > 0) {
					movingButtons(chosenbuttons, b, id_botton, nullkey, 1);
					break;
				} else if (nullkey - id_botton > 3) {
					movingButtons(chosenbuttons, b, id_botton, nullkey, -4);
					break;
				} else if (nullkey - id_botton <= 3) {
					movingButtons(chosenbuttons, b, id_botton, nullkey, -1);
					break;
				}

			}
			// Log.d(TAG_LOG, "button_text=" + button_text + " key=" + key);
		}
	}

	private void movingButtons(NavigableMap<Integer, Button> chosenbuttons,
			Button b, int id_botton, int nullkey, int sub_parameter) {
		Log.d(TAG_LOG, "movingButtons");
		while (id_botton != nullkey) {
			Log.d(TAG_LOG, "nullkey=" + nullkey + " sub_parameter="
					+ sub_parameter + " sum=" + (nullkey + sub_parameter) + "");

			chosenbuttons.get(nullkey).setText(
					chosenbuttons.get(nullkey + sub_parameter).getText()
							.toString());

			chosenbuttons.get(nullkey).setEnabled(true);
			String numb=chosenbuttons.get(nullkey + sub_parameter).getText().toString();
			Integer number=Integer.valueOf(numb);
			buttonsPicture(chosenbuttons.get(nullkey),  number);
//			chosenbuttons.get(nullkey).setBackgroundResource(
//					R.drawable.button_normal );

			nullkey = nullkey + sub_parameter;
			b = chosenbuttons.get(nullkey);
		}
		b.setText("");
		b.setEnabled(false);
		b.setBackgroundResource(R.drawable.button_normal);
		victory();
	}

	// private void setMetod(Button b, int id_botton) {
	// Log.d(TAG_LOG, "setMetod");
	// List<Button> chosenbuttons = new ArrayList<Button>();
	//
	// if ((id_botton - 1) >= 0 && id_botton != 4 && id_botton != 8
	// && id_botton != 12) {
	// chosenbuttons.add(buttons.get(id_botton - 1));
	// }
	// if ((id_botton + 1) <= 15 && id_botton != 11 && id_botton != 7
	// && id_botton != 3) {
	// chosenbuttons.add(buttons.get(id_botton + 1));
	// }
	// if ((id_botton + 4) <= 15) {
	// chosenbuttons.add(buttons.get(id_botton + 4));
	// }
	// if ((id_botton - 4) >= 0) {
	// chosenbuttons.add(buttons.get(id_botton - 4));
	// }
	// for (int i = 0; i < chosenbuttons.size(); i++) {
	// if (chosenbuttons.get(i).getText().equals("")) {
	// chosenbuttons.get(i).setText(b.getText());
	// chosenbuttons.get(i).setEnabled(true);
	// chosenbuttons.get(i).setBackgroundResource(
	// R.drawable.button_normal1);
	// b.setText("");
	// b.setEnabled(false);
	// b.setBackgroundResource(R.drawable.button_normal);
	// break;
	// }
	// }
	// victory();
	//
	// }

	private void victory() {
		Log.d(TAG_LOG, "victory");
		int counter = 0;
		for (int i = 0; i < buttons.size() - 1; i++) {
			if (buttons.get(i).getText().equals("" + (i + 1))) {
				counter++;
			}
		}
		if (counter == 15) {
			for (Button b : buttons) {
				b.setEnabled(false);
				b.setText("");
			}
			buttons.get(15).setBackgroundResource(R.drawable.button_normal16);
			text_winner.setText("Âû ïîáåäèëè!!!");
			Toast.makeText(this, "ïîçäðàâëÿþ", Toast.LENGTH_LONG).show();

			Toast.makeText(this, "ãîòîâî!!!", Toast.LENGTH_LONG).show();
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fifthmenu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.action_new:
			fillButtons();
			text_winner.setText("");
			return true;
			// case R.id.action_new_gamer:
			// // addgamer();
			// return true;
		case R.id.action_download:
			download();
			return true;
		case R.id.action_save:
			save();
			return true;
		case R.id.action_exit:
			onBackPressed();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	// private void addgamer() {
	// // ///////////////////////////////////////////////////////
	// }

	public void onBackPressed() {
		AlertDialog.Builder alertDialog = new AlertDialog.Builder(
				MainActivity.this);
		alertDialog.setTitle("Âûõîä");

		alertDialog.setMessage("Ñîõðàíèòü èãðó ïåðåä âûõîäîì?");

		alertDialog.setPositiveButton("Äà",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						save();
						Intent intent = new Intent(Intent.ACTION_MAIN);
						intent.addCategory(Intent.CATEGORY_HOME);
						intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
						startActivity(intent);
					}
				});

		alertDialog.setNeutralButton("Íåò",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						Intent intent = new Intent(Intent.ACTION_MAIN);
						intent.addCategory(Intent.CATEGORY_HOME);
						intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
						startActivity(intent);
					}
				});
		alertDialog.setNegativeButton("Îòìåíà",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						dialog.cancel();
					}
				});

		alertDialog.show();
		return;

	}

	private void save() {
		db.delete("fifth", null, null);
		String save = "";
		for (Button b : buttons) {
			if (b.getText() == "") {
				save = save + "n" + 0;
			} else {
				save = save + "n" + b.getText();
			}
		}
		cv.put("numbers", save);
		long rowID = db.insert("fifth", null, cv);
		Log.d(TAG_LOG, save + " " + rowID);
	}

	private void download() {
		String sqlQuery = "SELECT * FROM fifth ";
		// ORDER BY id DESC LIMIT 1
		Cursor c;
		c = db.rawQuery(sqlQuery, null);
		if (c.moveToFirst()) {
			String download = c.getString(c.getColumnIndex("numbers"));
			c.close();
			Log.d(TAG_LOG, download);
			char[] numbers = new char[38];
			numbers = download.toCharArray();
			int counter_n = -1;
			String setnumber[] = new String[16];
			for (int i = 0; i < setnumber.length; i++) {
				setnumber[i] = "";
			}
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] == 'n') {
					counter_n++;
					continue;

				} else {
					setnumber[counter_n] += numbers[i];
					Log.d(TAG_LOG, setnumber[counter_n] + "\n");
				}

			}
			for (int i = 0; i < setnumber.length; i++) {
				Button b = buttons.get(i);
				if (setnumber[i].equals("0")) {
					b.setText("");
					b.setEnabled(false);
				} else {
					b.setText(setnumber[i]);
					b.setEnabled(true);
				}
				b.setOnClickListener(this);
			}
			styleDecor();
		} else {
			Log.d(TAG_LOG, "ZERRO");
			c.close();
		}
	}
}

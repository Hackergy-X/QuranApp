package com.koran.karim;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.HorizontalScrollView;
import android.widget.Button;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdListener;
import android.view.View;

public class HomeActivity extends Activity {
	
	
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private HorizontalScrollView hscroll1;
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button5;
	private Button button4;
	private Button button6;
	private AdView adview1;
	
	private Intent I = new Intent();
	private AlertDialog.Builder D;
	private InterstitialAd it;
	private AdListener _it_ad_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button5 = (Button) findViewById(R.id.button5);
		button4 = (Button) findViewById(R.id.button4);
		button6 = (Button) findViewById(R.id.button6);
		adview1 = (AdView) findViewById(R.id.adview1);
		D = new AlertDialog.Builder(this);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				I.setClass(getApplicationContext(), Kour2anActivity.class);
				it = new InterstitialAd(getApplicationContext());
				it.setAdListener(_it_ad_listener);
				it.show();
				startActivity(I);
				finish();
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				I.setClass(getApplicationContext(), AhadisActivity.class);
				it = new InterstitialAd(getApplicationContext());
				it.setAdListener(_it_ad_listener);
				it.setAdUnitId("ca-app-pub-4473490529750447/3814604855");
				it.loadAd(new AdRequest.Builder().addTestDevice("6E27FCBA55CB4D2529DE643811235A32")
				.build());
				startActivity(I);
				finish();
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				I.setClass(getApplicationContext(), RaaoulallahActivity.class);
				it = new InterstitialAd(getApplicationContext());
				it.setAdListener(_it_ad_listener);
				it.setAdUnitId("ca-app-pub-4473490529750447/3814604855");
				it.loadAd(new AdRequest.Builder().addTestDevice("6E27FCBA55CB4D2529DE643811235A32")
				.build());
				startActivity(I);
				finish();
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				I.setClass(getApplicationContext(), Omarebn5atbActivity.class);
				it = new InterstitialAd(getApplicationContext());
				it.setAdListener(_it_ad_listener);
				it.setAdUnitId("ca-app-pub-4473490529750447/3814604855");
				it.loadAd(new AdRequest.Builder().addTestDevice("6E27FCBA55CB4D2529DE643811235A32")
				.build());
				startActivity(I);
				finish();
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				I.setClass(getApplicationContext(), AboubakerActivity.class);
				it = new InterstitialAd(getApplicationContext());
				it.setAdListener(_it_ad_listener);
				it.setAdUnitId("ca-app-pub-4473490529750447/3814604855");
				it.loadAd(new AdRequest.Builder().addTestDevice("6E27FCBA55CB4D2529DE643811235A32")
				.build());
				startActivity(I);
				finish();
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				I.setClass(getApplicationContext(), InfoActivity.class);
				it = new InterstitialAd(getApplicationContext());
				it.setAdListener(_it_ad_listener);
				it.setAdUnitId("ca-app-pub-4473490529750447/3814604855");
				it.loadAd(new AdRequest.Builder().addTestDevice("6E27FCBA55CB4D2529DE643811235A32")
				.build());
				startActivity(I);
				finish();
			}
		});
		
		_it_ad_listener = new AdListener() {
			@Override
			public void onAdLoaded() {
				it.show();
			}
			
			@Override
			public void onAdFailedToLoad(int _param1) {
				final int _errorCode = _param1;
				
			}
			
			@Override
			public void onAdOpened() {
				
			}
			
			@Override
			public void onAdClosed() {
				
			}
		};
	}
	private void initializeLogic() {
		adview1.loadAd(new AdRequest.Builder().addTestDevice("6E27FCBA55CB4D2529DE643811235A32")
		.build());
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		D.setTitle("exit !!!");
		D.setMessage("are you sure want to exit ?");
		D.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				finish();
			}
		});
		D.setNegativeButton("No", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		D.create().show();
	}
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}

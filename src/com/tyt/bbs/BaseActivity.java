/**
 * 
 */
package com.tyt.bbs;


import com.mobclick.android.MobclickAgent;

import android.app.Activity;

/**
 * @author tyt2011
 *com.tyt.bbs
 */
public class BaseActivity extends Activity {

	/* (non-Javadoc)
	 * @see android.app.Activity#onResume()
	 */
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		 MobclickAgent.onResume(this);
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onPause()
	 */
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		 MobclickAgent.onPause(this);
	}

}

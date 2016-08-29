package cn.phone.start;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Bootreceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent intent2 =new Intent(context,MainActivity.class);
		intent2.setFlags(intent2.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(intent2);
		
		
		
	}

}

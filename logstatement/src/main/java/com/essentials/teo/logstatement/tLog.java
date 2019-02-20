package com.essentials.teo.logstatement;

import android.util.Log;

public class tLog<T> {

	public String title;
	public T message;

	public tLog(String title, T message) {
		this.title = title;
		this.message = message;
		Log.e(title, convertToString(message)+"");
	}

	public String convertToString(T message) {
		return String.valueOf(message);
	}

}

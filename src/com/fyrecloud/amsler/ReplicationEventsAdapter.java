package com.fyrecloud.amsler;

import java.util.Vector;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * This class will connect a data structure containing
 * replication events with a UI such as a ListView.
 *
 * @author Thomas Radloff  fyreman@fyrecloud.com  http://fyrecloud.com/amsler
 *
 */
class ReplicationEventsAdapter extends BaseAdapter {

	/** Must have this when constructing or inflating views */
	private Context context;

	/** The replication events */
	private Vector<LogEntry> replicationEvents;

	public ReplicationEventsAdapter(Context context) {this.context = context;}

	/**
	 * Dependency injection
	 * 
	 * @param s This adapter will need to know the about the 
	 * replication events
	 */
	public void DI(Vector<LogEntry> s) {replicationEvents = s;}

	public int getCount() {return replicationEvents.size();}
	public Object getItem(int position) {return replicationEvents.get(position);}
	public long getItemId(int position) {return position;}

	public View getView(int position, View convertView, ViewGroup parent) {

		LogEntry replicationEvent = (LogEntry) replicationEvents.elementAt(position);
		LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(R.layout.sqlite_explorer_tables_tile, null);

		TextView tv = (TextView) v.findViewById(R.id.lblTableName);
		tv.setText(replicationEvent.s);

		if (replicationEvent.type == LogEntry.MYSQL)
			tv.setBackgroundResource(R.color.red_hint);

		return v;
	}

}
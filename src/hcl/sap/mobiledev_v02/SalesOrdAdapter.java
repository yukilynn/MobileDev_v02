package hcl.sap.mobiledev_v02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SalesOrdAdapter extends ArrayAdapter {
	public static final int TYPE_LIST = 0;
	public static final int TYPE_NONE = 1;

	public ListViewItem[] objects;

	@Override
	public int getViewTypeCount() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int getItemViewType(int position) {
		// TODO Auto-generated method stub
		return objects[position].getType();
	}

	@SuppressWarnings("unchecked")
	public SalesOrdAdapter(Context context, int resource, Object[] objects) {
		super(context, resource, objects);
		// TODO Auto-generated constructor stub
		this.objects = (ListViewItem[]) objects;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder viewHolder = null;
		ListViewItem listViewItem = objects[position];
		int listViewItemType = getItemViewType(position);

		if (convertView == null) {
			if (listViewItemType == TYPE_LIST) {
				convertView = LayoutInflater.from(getContext()).inflate(
						R.layout.list_select, null);
			} else if (listViewItemType == TYPE_NONE) {
				convertView = LayoutInflater.from(getContext()).inflate(
						R.layout.list_view, null);
			}

			TextView textView = (TextView) convertView
					.findViewById(R.id.tvBizPartner);
			viewHolder = new ViewHolder(textView);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		viewHolder.getText().setText(listViewItem.getText());

		return convertView;
	}

}

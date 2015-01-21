package hcl.sap.mobiledev_v02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SalesOrdAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;
	
	public static final int TYPE_LIST = 0;
	public static final int TYPE_NONE = 1;
	
//	public ListViewItem[] objects;

	public SalesOrdAdapter(Context context, String[] values) {
		super(context, R.layout.list_select, values);
		// TODO Auto-generated constructor stub
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View viewHolder = inflater.inflate(R.layout.list_select, parent, false);
		TextView bizPart_lbl = (TextView) viewHolder.findViewById(R.id.tvBizPartner);
		TextView bizPart_name = (TextView) viewHolder.findViewById(R.id.tvBizPartnerName);
		ImageView arrow = (ImageView) viewHolder.findViewById(R.id.ivArrow);
		bizPart_lbl.setText(values[position]);
		String s = values[position];
		if (s.startsWith("Business Partner") || s.startsWith("Sales Employee") || s.startsWith("Posting Date")
				|| s.startsWith("Delivery Date") || s.startsWith("Document Date") || s.startsWith("Remarks")
				|| s.startsWith("Ship To") || s.startsWith("Bill To")) {
			arrow.setImageResource(R.drawable.arrow);
		} else {
			arrow.setImageResource(android.R.color.transparent);
		}
		
		return viewHolder;
	}

}

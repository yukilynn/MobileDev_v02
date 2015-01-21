package hcl.sap.mobiledev_v02;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class AddSalesOrd extends ListActivity {
//	private ListView listView;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		final String[] values = new String[] {
				"Doc. Series", "Business Partner", "Contact Person", "Currency",
				"Sales Employee", "Posting Date", "Delivery Date", "Document Date",
				"Remarks", "Ship To", "Bill To", "Total Before Discount", "Discount%",
				"Discount", "Tax", "Total"
		};
		
		SalesOrdAdapter soAdapter = new SalesOrdAdapter(this, values);
		setListAdapter(soAdapter);
		getListView().setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(AddSalesOrd.this, BizPartList.class);
				startActivity(intent);
			}
			
		});
//		listView.setAdapter(soAdapter);
//		listView.setOnItemClickListener(new OnItemClickListener() {
//
//			@Override
//			public void onItemClick(AdapterView<?> parent, View view,
//					int position, long id) {
//				// TODO Auto-generated method stub
//				Toast.makeText(getBaseContext(), values[position],
//						Toast.LENGTH_SHORT).show();
//			}
//		});
	}
}

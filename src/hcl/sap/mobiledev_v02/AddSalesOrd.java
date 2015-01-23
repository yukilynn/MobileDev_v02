package hcl.sap.mobiledev_v02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class AddSalesOrd extends ActionBarActivity {
	private ListView listView;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_list);
		
		listView = (ListView) findViewById(R.id.list);
		
		String[] values = new String[] {
				"Doc. Series", "Business Partner", "Contact Person", "Currency",
				"Sales Employee", "Posting Date", "Delivery Date", "Document Date",
				"Remarks", "Ship To", "Bill To", "Total Before Discount", "Discount%",
				"Discount", "Tax", "Total"
		};
		
		SalesOrdAdapter soAdapter = new SalesOrdAdapter(this, values);
		listView.setAdapter(soAdapter);
		
		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				// TODO Auto-generated method stub
				if (position == 1) {
					Intent intent = new Intent(AddSalesOrd.this, BizPartList.class);
					startActivity(intent);
				} 
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_list, menu);
		return true;
	}
}

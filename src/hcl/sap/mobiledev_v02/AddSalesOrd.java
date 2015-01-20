package hcl.sap.mobiledev_v02;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class AddSalesOrd extends ActionBarActivity {
	private ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_sls_ord);

		listView = (ListView) findViewById(R.id.list);

		final ListViewItem[] items = new ListViewItem[40];

		for (int i = 0; i < items.length; i++) {
			if (i == 1) {
				items[i] = new ListViewItem("List" + i,
						SalesOrdAdapter.TYPE_LIST);
			} else if (i == 9) {
				items[i] = new ListViewItem("No List" + i,
						SalesOrdAdapter.TYPE_NONE);
			}
		}
		SalesOrdAdapter soAdapter = new SalesOrdAdapter(this,
				R.id.tvBizPartner, items);
		listView.setAdapter(soAdapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(getBaseContext(), items[position].getText(),
						Toast.LENGTH_SHORT).show();
			}
		});
	}
}

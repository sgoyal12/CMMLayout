package shubham.sts.com.cmmlayout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter {

    ArrayList<ListItem> items;
    Context context;
    LayoutInflater inflater;

    public ListAdapter(Context context,ArrayList<ListItem> items) {
        super(context,0, items);

            this.items = items;
            this.context = context;
            this.inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        View output=convertView;
        if(convertView==null)
        {
            output=inflater.inflate(R.layout.list_layout,parent,false);
            output.setTag(new ListHolder(output));
        }
        ListHolder listHolder= (ListHolder) output.getTag();
        ListItem item=items.get(position);
        listHolder.tv.setText(item.getSubject());
        listHolder.progressBar.setProgress(item.getProgress());
        listHolder.tv1.setText(item.getProgress()+"%");
        listHolder.iv.setImageDrawable(context.getResources().getDrawable(R.drawable.maths));


        return output;
    }
}

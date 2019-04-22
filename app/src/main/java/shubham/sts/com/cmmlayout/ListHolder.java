package shubham.sts.com.cmmlayout;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ListHolder {
    public TextView tv,tv1;
    public ImageView iv;
    public ProgressBar progressBar;
    public ListHolder(View itemView) {

        tv=itemView.findViewById(R.id.textList);
        progressBar=itemView.findViewById(R.id.progressBar);
        tv1=itemView.findViewById(R.id.percentage);
        iv=itemView.findViewById(R.id.image);
    }
}

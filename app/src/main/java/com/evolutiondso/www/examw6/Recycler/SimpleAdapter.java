package com.evolutiondso.www.examw6.Recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.evolutiondso.www.examw6.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Albrtx on 22/11/2016.
 */
//MY HOLDER
public class SimpleAdapter extends RecyclerView.ViewHolder {
    @BindView(R.id.r_item_text)
    TextView name;

    SimpleAdapter(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}

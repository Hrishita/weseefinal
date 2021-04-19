package org.tensorflow.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.MyHolder>
{
    Context context;
    List<NotificationModel> arrayList;
    NotificationAdapter(Context context, List<NotificationModel> arrayList)
    {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context)
                .inflate(R.layout.layout_notification_item, parent, false);

        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.name.setText(arrayList.get(position).text);
//        Picasso
//                .get()
//                .load(Constants.SERVER_ADDRESS + "/media/profile/"  + arrayList.get(position))
//                .into(holder.profile);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView call;
        CircleImageView profile;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.ivc_item_name);
            call = itemView.findViewById(R.id.ivc_item_call);
            profile = itemView.findViewById(R.id.ivc_item_profile);
        }
    }
}

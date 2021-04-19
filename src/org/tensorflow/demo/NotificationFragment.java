package org.tensorflow.demo;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {

    HomeActivityInterface mInterface;
    Context context;
    RecyclerView recyclerView;
    List<NotificationModel> arrayList = new ArrayList<>();
    NotificationAdapter adapter;


    public NotificationFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof HomeActivityInterface)
        {
            this.context = context;
            this.mInterface = (HomeActivityInterface) context;
            this.mInterface.hideAppBar();
        }
        else
        {
            throw new ClassCastException("Implement Interface");
        }
    }
    private void loadData() {
        arrayList.add(new NotificationModel(Constants.NOTIFICATION_TYPE_USER,1,1, "Devarsh mavani and 10 others liked your post"));
        arrayList.add(new NotificationModel(Constants.NOTIFICATION_TYPE_USER,1,1, "Devarsh mavani and 10 others liked your post"));
        arrayList.add(new NotificationModel(Constants.NOTIFICATION_TYPE_USER,1,1, "Devarsh mavani and 10 others liked your post"));
        arrayList.add(new NotificationModel(Constants.NOTIFICATION_TYPE_USER,1,1, "Devarsh mavani and 10 others liked your post"));
        arrayList.add(new NotificationModel(Constants.NOTIFICATION_TYPE_USER,1,1, "Devarsh mavani and 10 others liked your post"));
        arrayList.add(new NotificationModel(Constants.NOTIFICATION_TYPE_USER,1,1, "Devarsh mavani and 10 others liked your post"));
        arrayList.add(new NotificationModel(Constants.NOTIFICATION_TYPE_USER,1,1, "Devarsh mavani and 10 others liked your post"));
        arrayList.add(new NotificationModel(Constants.NOTIFICATION_TYPE_USER,1,1, "Devarsh mavani and 10 others liked your post"));
        arrayList.add(new NotificationModel(Constants.NOTIFICATION_TYPE_USER,1,1, "Devarsh mavani and 10 others liked your post"));
        arrayList.add(new NotificationModel(Constants.NOTIFICATION_TYPE_USER,1,1, "Devarsh mavani and 10 others liked your post"));
        arrayList.add(new NotificationModel(Constants.NOTIFICATION_TYPE_USER,1,1, "Devarsh mavani and 10 others liked your post"));
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_notification, container, false);
        recyclerView = v.findViewById(R.id.notifications_rcv);
        loadData();
        adapter= new NotificationAdapter(getContext(), arrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        this.mInterface.showAppBar();
    }
}

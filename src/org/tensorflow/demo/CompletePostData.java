package org.tensorflow.demo;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class CompletePostData implements Parcelable, Serializable {

    public int id; //post id
    public String uid; //phone number
    public String caption; //caption
    public String timestamp;//timestamp

    public String name; //username
    public String profile_link; //profile

    public String images;
    public boolean liked;

//    Post post;
//    User user;
//    PostMedia[] postMedia;
//    Likes likes;

    protected CompletePostData(Parcel in) {
        id = in.readInt();
        uid = in.readString();
        caption = in.readString();
        timestamp = in.readString();
        name = in.readString();
        profile_link = in.readString();
        images = in.readString();
        liked = !in.readString().equals("false");
    }

    public static final Creator<CompletePostData> CREATOR = new Creator<CompletePostData>() {
        @Override
        public CompletePostData createFromParcel(Parcel in) {
            return new CompletePostData(in);
        }

        @Override
        public CompletePostData[] newArray(int size) {
            return new CompletePostData[size];
        }
    };

    public CompletePostData() {

    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(uid);
        dest.writeString(caption);
        dest.writeString(timestamp);
        dest.writeString(name);
        dest.writeString(profile_link);
        dest.writeString(images);
        dest.writeString((liked ? uid : "false"));
    }
}

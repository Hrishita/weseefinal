package org.tensorflow.demo;

import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class UserPostTask extends AsyncTask<String, Void, String>
{
    AlertDialog dialog;
    UserPostTaskCallback mCallback;
    UserPostTask(Context context, UserPostTaskCallback mCallback)
    {
        this.mCallback =mCallback;
        dialog = new AlertDialog.Builder(context)
                .setView(R.layout.loading)
                .setCancelable(false)
                .create();
        dialog.show();
    }
    @Override
    protected String doInBackground(String... strings) {
        String uid = strings[0];
        String enduser = strings[1];
        String url = Constants.SERVER_ADDRESS + "/api/userposts";
        String jsonBody = "{" +
                "\"uid\":\"" + uid + "\"," +
                "\"phone_number\":\"" + enduser + "\"" +
                "}";

        OkHttpClient client = new OkHttpClient();

        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jsonBody);

        Request request = new Request.Builder().url(url).post(body).build();
        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        mCallback.onResult(s);
        dialog.dismiss();

    }
    public interface UserPostTaskCallback{
        void onResult(String s);
    }
}

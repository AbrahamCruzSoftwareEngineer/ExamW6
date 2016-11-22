package com.evolutiondso.www.examw6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.evolutiondso.www.examw6.entities.Example;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity_" ;
    private static final String URL = "https://randomuser.me/api" ;
    OkHttpClient client = new OkHttpClient();
    private String thajson = "{\"results\":[{\"gender\":\"male\",\"name\":{\"title\":\"mr\",\"first\":\"wesley\",\"last\":\"campbell\"},\"location\":{\"street\":\"3677 samaritan dr\",\"city\":\"sunshine coast\",\"state\":\"northern territory\",\"postcode\":2242},\"email\":\"wesley.campbell@example.com\",\"login\":{\"username\":\"beautifulfish584\",\"password\":\"kevin\",\"salt\":\"I4m2si1F\",\"md5\":\"78f07e9c796a8c936106529296a43f50\",\"sha1\":\"6706532ed33e77cdb10acb46724e58d48e38e2e8\",\"sha256\":\"2689407f5b19881c40f4f30f9593ea58d42365f7e0969d606190bc92f555077d\"},\"dob\":\"1953-01-25 00:03:26\",\"registered\":\"2013-01-22 21:52:28\",\"phone\":\"02-9114-3452\",\"cell\":\"0493-869-835\",\"id\":{\"name\":\"TFN\",\"value\":\"990101774\"},\"picture\":{\"large\":\"https://randomuser.me/api/portraits/men/84.jpg\",\"medium\":\"https://randomuser.me/api/portraits/med/men/84.jpg\",\"thumbnail\":\"https://randomuser.me/api/portraits/thumb/men/84.jpg\"},\"nat\":\"AU\"}],\"info\":{\"seed\":\"ecee77f2268b7365\",\"results\":1,\"page\":1,\"version\":\"1.1\"}}";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson g = new Gson();
        Log.d(TAG, "onCreate: " + thajson);
        Example example = g.fromJson(thajson, Example.class);
        Log.d(TAG, "onCreate: " + example.toString());


        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://randomuser.me/api")
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                final String responseData = response.body().string();


            }
        });


    }






}

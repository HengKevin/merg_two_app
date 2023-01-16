package com.samples.flironecamera.tracking;

import android.content.Context;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class AttendanceClient {

    private static final String API_URL = "https://rest-attend-api-production.up.railway.app/attendances";
    private Context context;

    public AttendanceClient(Context context) {
        this.context = context;
    }

    public void sendData(Map<String, String> data) {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, API_URL,
                response -> {
                    // Handle the response here
                },
                error -> {
                    // Handle any errors here
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return data;
            }
        };
        // Add the request to the Volley request queue
        RequestQueue queue = Volley.newRequestQueue(context);
        queue.add(stringRequest);
    }
}


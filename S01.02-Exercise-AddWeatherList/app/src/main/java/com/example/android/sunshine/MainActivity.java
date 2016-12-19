/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView mWeatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        mWeatherTextView = (TextView) findViewById(R.id.tv_weather_data);
        List<String> weatherData = Arrays.asList(
                "Sun, Dec 18 - Snow - 36/30",
                "Mon, Dec 19 - Snow - 41/35",
                "Tue, Dec 20 - Snow - 39/36",
                "Wed, Dec 21 - Snow - 36/35",
                "Thu, Dec 22 - Snow - 33/32",
                "Fri, Dec 23 - Snow - 37/31",
                "Sat, Dec 24 - Snow - 33/32",
                "Sun, Dec 25 - Snow - 32/31",
                "Mon, Dec 26 - Snow - 37/35",
                "Tue, Dec 27 - Snow - 31/30",
                "Wed, Dec 28 - Snow - 39/38",
                "Thu, Dec 29 - Rain - 33/32",
                "Fri, Dec 30 - Snow - 38/31",
                "Sat, Dec 31 - Snow - 35/32"
        );
        for (String weatherEntry : weatherData) {
            mWeatherTextView.append(weatherEntry + "\n\n\n");
        }
    }
}
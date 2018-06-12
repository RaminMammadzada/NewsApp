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
package com.example.android.newsappstage1;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * An {@link NewsAdapter} knows how to create a list item layout for each news
 * in the data source (a list of {@link News} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * The part of the location string from the Guardian service that we use to determine
     * whether or not there is a location offset present ("5km N of Cairo, Egypt").
     */
    private static final String LOCATION_SEPARATOR = " of ";

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param allNews is the list of allNews, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> allNews) {
        super(context, 0, allNews);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of allNews.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of allNews
        News currentNews = getItem(position);

        // Find the TextView with view ID sectionId
        TextView sectionView = (TextView) listItemView.findViewById(R.id.news_section);
        // Display the magnitude of the current news in that TextView
        sectionView.setText(currentNews.getmNewsSection());

        //
        TextView titleView = (TextView) listItemView.findViewById( R.id.news_title );
        titleView.setText( currentNews.getmNewsTitle() );

        //
        TextView dateView = (TextView) listItemView.findViewById( R.id.date );
        dateView.setText( currentNews.getmDate() );

        //
        TextView timeView = (TextView) listItemView.findViewById( R.id.time );
        timeView.setText( currentNews.getmTime() );

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

}

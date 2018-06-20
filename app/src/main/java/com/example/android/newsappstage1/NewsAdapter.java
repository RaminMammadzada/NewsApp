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

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * An {@link NewsAdapter} knows how to create a list item layout for each news
 * in the data source (a list of {@link News} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param allNews is the list of allNews, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> allNews) {
        super( context, 0, allNews );
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
            listItemView = LayoutInflater.from( getContext() ).inflate(
                    R.layout.news_list_item, parent, false );
        }

        // Find the news at the given position in the list of allNews
        News currentNews = getItem( position );

        // Find the TextView with view ID sectionId
        TextView sectionView = (TextView) listItemView.findViewById( R.id.news_section );
        // Display the general context of the current news in that TextView
        sectionView.setText( currentNews.getmNewsSection() );

        // Find the TextView with view ID news_title
        TextView titleView = (TextView) listItemView.findViewById( R.id.news_title );
        // Display the title of the current news in that TextView
        titleView.setText( currentNews.getmNewsTitle() );

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById( R.id.date );
        // Display the date of the current news in that TextView
        dateView.setText( currentNews.getmDate() );

        // Find the TextView with view ID time
        TextView timeView = (TextView) listItemView.findViewById( R.id.time );
        // Display the time of the current news in that TextView
        timeView.setText( currentNews.getmTime() );

        // Find the TextVIew with view ID author_text_view
        TextView authorTV = (TextView) listItemView.findViewById( R.id.author_text_view );
        authorTV.setText( R.string.author_text_view );

        // Find the TextView with view ID author
        TextView authorView = (TextView) listItemView.findViewById( R.id.author );
        // Display the author of the current news in that TextView
        authorView.setText( currentNews.getmAuthors() );

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

}

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

/**
 * An {@link News} object contains information related to a single news.
 */
public class News {

    /** General context of the news */
    private String mNewsSection;

    /** Title of the news */
    private String mNewsTitle;

    /** Website URL of the news on The Guardian */
    private String mUrl;

    /** Raw Date of the news */
    private String mRawDate;

    /** Date of the news */
    private String mDate;

    /** Time of the news */
    private String mTime;


    /**
     * Constructs a new {@link News} object.
     *
     * @param newsSection is the general context of the news
     * @param newsTitle is the title of the current news
     * @param newsWeblink is the hyper link to access to the current news online
     */
    public News(String newsSection, String newsTitle, String newsWeblink, String date) {
        mNewsSection = newsSection;
        mNewsTitle = newsTitle;
        mUrl = newsWeblink;
        mRawDate = date;
    }


    /**
     * Returns the sectionId (general context)
     * of the current news
     */
    public String getmNewsSection() {
        return mNewsSection;
    }

    /**
     * Returns the title of the current news
     */
    public String getmNewsTitle() {
        return mNewsTitle;
    }

    /**
     * Returns the weblink of the current news
     */
    public String getmUrl() {
        return mUrl;
    }

    /**
     * Returns the date of the current news
     */
    public String getmDate() {

        mDate = mRawDate.substring(0,10);
        return mDate;
    }

    public String getmTime(){
        mTime = mRawDate.substring(11,19);
        return mTime;
    }


}

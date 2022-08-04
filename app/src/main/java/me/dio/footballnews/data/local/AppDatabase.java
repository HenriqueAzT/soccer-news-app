package me.dio.footballnews.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import me.dio.footballnews.domain.News;

@Database(entities = {News.class}, version = 1)
abstract class SoccerNewsDb extends RoomDatabase {
    public abstract NewsDao newsDao();
}
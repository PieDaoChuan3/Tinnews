package com.example.tinnews.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.tinnews.model.Article;

import java.util.List;

public interface TinNewsDao {
    @Dao
    public interface ArticleDao {

        @Insert
        void saveArticle(Article article);

        @Query("SELECT * FROM article")
        LiveData<List<Article>> getAllArticles();

        @Delete
        void deleteArticle(Article article);

    }
}

package com.example.android.todolist.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface TaskDao {
    @Query("SELECT * FROM task ORder BY priority")
   LiveData<List<TaskEntry> > loadAllEntity();
@Insert
    void InsertTask(TaskEntry taskEntry );
@Update(onConflict=OnConflictStrategy.REPLACE)
    void UpdateTask(TaskEntry taskEntry);
@Delete
    void DeleteTask(TaskEntry taskEntry);
    @Query("SELECT * FROM task Where id=:id")
TaskEntry loadTaskById(int id);

}

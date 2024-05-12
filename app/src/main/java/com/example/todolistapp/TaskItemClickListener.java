package com.example.todolistapp;

import com.example.todolistapp.TaskItem;

interface TaskItemClickListener {
    fun editTaskItem(taskItem:TaskItem)
    fun completeTaskItem(taskItem: TaskItem)
    fun deleteTaskItem(taskItem: TaskItem)
}
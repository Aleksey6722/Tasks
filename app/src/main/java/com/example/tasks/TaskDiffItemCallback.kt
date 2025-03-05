package com.example.tasks

import androidx.recyclerview.widget.DiffUtil

class TaskDiffItemCallback : DiffUtil.ItemCallback<Task>() {
    override fun areContentsTheSame(oldItem: Task, newItem: Task): Boolean = (oldItem == newItem)

    override fun areItemsTheSame(oldItem: Task, newItem: Task): Boolean =
        (oldItem.taskId == newItem.taskId)
}
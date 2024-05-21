package br.com.gustavos.repositories

import br.com.gustavos.models.Task

class TasksRepository {

    val tasks get() = _tasks.toList()

    fun save(task: Task){
        _tasks.add(task)
    }

    companion object{
        private val _tasks = mutableListOf<Task>()
    }

}
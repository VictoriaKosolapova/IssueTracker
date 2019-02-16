package com.netcracker.edu.tms.dao;

import com.netcracker.edu.tms.model.Priority;
import com.netcracker.edu.tms.model.Status;
import com.netcracker.edu.tms.model.Task;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public interface TaskDao {

    Task getTaskById(BigInteger taskId);

    List<Task> listOfTasksByName(String taskName);

    boolean addTask(Task task);

    boolean updateTask(Task task);

    boolean deleteTask(Task task);

    List<Task> listOfTasksByReporter(BigInteger reporterId);//argument should be User instance

    List<Task> listOfTasksByAssignee(BigInteger assigneeId);//argument should be User instance

    List<Task> listOfTasksByCreationDate(Date creationDate);

    List<Task> listOfTasksByProject(BigInteger projectId);//argument should be Project instance

    List<Task> listOfTasksByStatus(Status taskStatus);

    List<Task> listOfTasksByPriority(Priority taskPriority);


}

package com.netcracker.edu.tms.service;

import com.netcracker.edu.tms.model.Priority;
import com.netcracker.edu.tms.model.Status;
import com.netcracker.edu.tms.model.Task;

import java.math.BigInteger;
import java.util.Date;
import java.text.ParseException;
import java.util.List;

public interface TaskService {

    Task getTaskById(BigInteger taskId);

    List<Task> listOfTasksByName(String taskName);

    boolean addTask(Task task);

    boolean updateTask(Task task);

    boolean deleteTask(Task task);

    List<Task> listOfTasksByReporter(BigInteger reporterId);//argument should be User instance

    List<Task> listOfTasksByAssignee(BigInteger assigneeId);//argument should be User instance

    List<Task> listOfTasksByCreationDate(String creationDate) throws ParseException;

    List<Task> listOfTasksByProject(BigInteger projectId);//argument should be Project instance

    List<Task> listOfTasksByStatus(Status taskStatus);

    List<Task> listOfTasksByPriority(Priority taskPriority);
}

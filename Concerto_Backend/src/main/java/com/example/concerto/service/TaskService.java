package com.example.concerto.service;

import com.example.concerto.fo.*;
import com.example.concerto.vo.TaskVo;

/**
 * @author sarise
 * @version 1.0
 * @date 2021/4/27 下午4:22
 */
public interface TaskService {
    Long createTask(AddTaskForm addTaskForm);
    Long createMileStone(MileStoneForm mileStoneForm);
    Integer modifyTask(ModifyTaskForm modifyTaskForm);
    TaskVo queryTask(Long taskId);
    Long addSubtask(SubtaskForm subtaskForm);
    void modifySubtask(ModifySubtaskForm modifySubtaskForm);
    void changeTaskStatus(Long taskId);
}

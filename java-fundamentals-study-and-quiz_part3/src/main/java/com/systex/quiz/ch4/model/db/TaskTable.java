package com.systex.quiz.ch4.model.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Connection;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskTable {

    private Long taskSeq;

    private String taskName;

    private String description;

    @Override
    public String toString() {
        return "TaskTable [taskSeq=" + taskSeq + ", taskName=" + taskName + ", description=" + description + "]";
    }

}

package com.example.taskFlowApp.repository;

import com.example.taskFlowApp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface taskRepository extends JpaRepository<Task, Long> {
    List<Task> findByAssignedToId(Long userId);
}

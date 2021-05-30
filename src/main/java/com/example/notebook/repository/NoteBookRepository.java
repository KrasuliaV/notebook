package com.example.notebook.repository;

import com.example.notebook.entity.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteBookRepository extends JpaRepository<Notebook, Long> {

    List<Notebook> getAllByOrderByProducerDesc();

    List<Notebook> findByMemory(int memory);

    List<Notebook> findByMemoryGreaterThan(int memory);

    List<Notebook> findByIsUsed(boolean isUsed);
}

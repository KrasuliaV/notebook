package com.example.notebook.service;

import com.example.notebook.entity.Notebook;

import java.util.List;

public interface NotebookService {

    Notebook create(Notebook note);

    List<Notebook> getAllNotebook();

    List<Notebook> getAllNotebookSortedByProducerDesc();

    List<Notebook> getNotesByMemory(int memory);

    List<Notebook> getNotesWithMemoryGreaterThan16();

    List<Notebook> getNotesByUsed(boolean isUsed);
}

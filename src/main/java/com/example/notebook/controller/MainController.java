package com.example.notebook.controller;

import com.example.notebook.entity.Notebook;
import com.example.notebook.service.NotebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final NotebookService notebookService;

    @Autowired
    public MainController(NotebookService notebookService) {
        this.notebookService = notebookService;
    }

    @GetMapping("/")
    public String main(
            @RequestParam(name = "name", required = false, defaultValue = "user") String name,
            Model model) {
        model.addAttribute("name", name);
        return "main";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("notebooks", notebookService.getAllNotebook());
        return "home";
    }

    @GetMapping("/allSortedByProducer")
    public String allSortedByProducer(Model model) {
        model.addAttribute("notebooks", notebookService.getAllNotebookSortedByProducerDesc());
        return "home";
    }

    @GetMapping("/getNotesByMemory")
    public String getNotesByMemory(Model model) {
        model.addAttribute("notebooks", notebookService.getNotesByMemory(16));
        return "home";
    }

    @GetMapping("/getNotesWithMemoryGreaterThan16")
    public String getNotesWithMemoryGreaterThan16(Model model) {
        model.addAttribute("notebooks", notebookService.getNotesWithMemoryGreaterThan16());
        return "home";
    }

    @GetMapping("/getUsedNotes")
    public String getUsedNotes(Model model) {
        model.addAttribute("notebooks", notebookService.getNotesByUsed(true));
        return "home";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("notebook", new Notebook());
        return "create-notebook";
    }

    @PostMapping("/create")
    public String create(Model model, @ModelAttribute("notebook") Notebook notebook) {
        notebookService.create(notebook);
        model.addAttribute("notebooks", notebookService.getAllNotebookSortedByProducerDesc());
        return "home";
    }
}

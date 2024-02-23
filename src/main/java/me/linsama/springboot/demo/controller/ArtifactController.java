package me.linsama.springboot.demo.controller;

import lombok.RequiredArgsConstructor;
import me.linsama.springboot.demo.dto.CreateArtifactDTO;
import me.linsama.springboot.demo.entity.Artifact;
import me.linsama.springboot.demo.service.ArtifactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * ArtifactController
 *
 * @author Linsama
 */
@RestController
@RequestMapping("/artifacts")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ArtifactController {

    private final ArtifactService artifactService;

    @GetMapping("/list")
    public List<Artifact> listArtifacts() {
        return Collections.emptyList();
    }

    @PostMapping("/create")
    public Artifact createArtifact(@RequestBody CreateArtifactDTO createArtifactDTO) {
        return artifactService.createArtifact(createArtifactDTO);
    }
}

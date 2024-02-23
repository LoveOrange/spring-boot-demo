package me.linsama.springboot.demo.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Artifact
 *
 * @author Linsama
 */
@Getter
@Setter
public abstract class Artifact {

    protected Long id;

    protected String name;

    protected String version;

    public abstract ArtifactType getType();

    public abstract String getPath();
}

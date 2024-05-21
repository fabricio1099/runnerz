package dev.fmanga.runnerz.run;

import java.time.LocalDateTime;

public record Run(
        int id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        int miles,
        Location location
) {}

package org.heatup.builder;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by romain on 15/05/2015.
 */
@Getter
@RequiredArgsConstructor
public final class Release {
    private final int release;
    private final ArrayList<File> files;
}

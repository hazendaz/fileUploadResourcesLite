/*
 * fileUploadResourcesLite (https://github.com/hazendaz/fileUploadResourcesLite)
 *
 * Copyright 2009-2022 Hazendaz.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of The Apache Software License,
 * Version 2.0 which accompanies this distribution, and is available at
 * https://www.apache.org/licenses/LICENSE-2.0.txt
 *
 * Contributors:
 *     Hazendaz (Jeremy Landis).
 */
package com.hazendaz.junk;

import lombok.Data;

// import javax.validation.constraints.Past;

@Data
public class InvalidAnnotation {

    /**
     * Set int specifically to test bad annotation. Uncomment @Past in order to cause error
     */
    // @Past
    private int seat;

}

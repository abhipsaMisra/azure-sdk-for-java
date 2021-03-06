// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.spring.data.gremlin.common.domain;

import com.microsoft.spring.data.gremlin.annotation.Vertex;

@Vertex
public class AdvancedUser extends User {

    private int level;

    public AdvancedUser(String id, String name, int level) {
        super(id, name);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

}

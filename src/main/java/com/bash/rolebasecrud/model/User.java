package com.bash.rolebasecrud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private int id;
    private String userName;
    private String password;
    private boolean enabled;
}

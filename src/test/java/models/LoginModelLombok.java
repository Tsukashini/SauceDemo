package models;

import lombok.*;

@Data
@Builder
@EqualsAndHashCode
@ToString
public class LoginModelLombok {
    private String username;
    private String password;


}

package uz.husan.pcmarket.playload;

import lombok.Data;
@Data
public class UserRequestDTO {
    private String name;
    private String username;
    private String password;
    private Double balance;
}

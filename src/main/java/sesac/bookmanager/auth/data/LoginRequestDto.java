package sesac.bookmanager.auth.data;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequestDto {

    @NotBlank(message = "아이디 입력해주세요")
    private String username;
    @NotBlank(message = "비밀번호 입력해주세요")
    private String password;
}

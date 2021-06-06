package UserModel.Response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class UserResponse {

    private int code;
    private String type;
    private String message;

    public UserResponse() {

    }

    public UserResponse(int code, String type, String message) {
        super();
        this.code = code;
        this.type = type;
        this.message = message;

    }
}

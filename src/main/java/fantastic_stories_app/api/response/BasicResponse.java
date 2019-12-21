package fantastic_stories_app.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import fantastic_stories_app.api.type.ResponseStatus;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasicResponse {
    private String responseMsg;
    private String errorCode;
    private String errorMsg;
    private ResponseStatus status;

    public BasicResponse() {
    }

    public BasicResponse(String responseMsg) {
        this.responseMsg = responseMsg;
        this.status = ResponseStatus.SUCCESS;
    }

    public BasicResponse(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.status = ResponseStatus.ERROR;
    }

    public static BasicResponse of(String responseMsg){
        return new BasicResponse(responseMsg);
    }

    public static BasicResponse ofError(String errorCode, String errorMsg){
        return new BasicResponse(errorCode, errorMsg);
    }
}

package objectData.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import objectData.model.BookModel;

import java.util.List;

@Getter
public class ResponseAccountSuccess {

    @JsonProperty("userID")
    private String userId;
    @JsonProperty("username")
    private String username;
    @JsonProperty("books")
    private List<BookModel> books;

}

package cs490.notification.email.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmailContentDto {
    private String from;
    private String to;
    private String subject;
    private String content;

    @Override
    public String toString() {
        return "EmailContentDto{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +

                '}';
    }
}

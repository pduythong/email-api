package cs490.notification.email.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
public class EmailContentDto {
    private String from;
    private String to;
    private String subject;
    private String content;
//    private Template template;

//    public EmailContentDto(Builder builder) {
//        this.from = builder.from;
//        this.to = builder.to;
//        this.content = builder.content;
//        this.template = builder.template;
//        this.subject = builder.subject;
//    }
//
//    public String getFrom() {
//        return from;
//    }
//
//    public String getTo() {
//        return to;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public Template getTemplate() {
//        return template;
//    }
//
//    public String getSubject() {
//        return this.subject;
//    }

//    public static class Builder {
//        private String subject;
//        private String from;
//        private String to;
//        private String content;
//        private Template template;
//
//        public Builder withFrom(String from) {
//            this.from = from;
//            return this;
//        }
//
//        public Builder withTo(String to) {
//            this.to = to;
//            return this;
//        }
//
//        public Builder withContent(String content) {
//            this.content = content;
//            return this;
//        }
//
//        public Builder withTemplate(Template template) {
//            this.template = template;
//            return this;
//        }
//
//        public Builder withSubject(String subject) {
//            this.subject = subject;
//            return this;
//        }
//
//        public EmailContentDto build() {
//            return new EmailContentDto(this);
//        }
//
//    }


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

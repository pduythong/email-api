package cs490.notification.email.dto;

public class DTO {

    private String test;
    private String test1;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public DTO() {
    }

    public DTO(String test, String test1) {
        this.test = test;
        this.test1 = test1;
    }

    @Override
    public String toString() {
        return "DTO{" +
                "test='" + test + '\'' +
                ", test1='" + test1 + '\'' +
                '}';
    }
}
